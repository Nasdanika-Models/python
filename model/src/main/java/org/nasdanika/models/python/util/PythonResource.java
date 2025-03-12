package org.nasdanika.models.python.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.Util;
import org.nasdanika.models.python.Import;
import org.nasdanika.models.python.PythonFactory;
import org.nasdanika.models.python.Source;

/**
 * Load Python as Source. Saves a collection of sources by collecting {@link Import}s and aggregating them. 
 * Then calls generate() for content sources.
 */
public class PythonResource extends ResourceImpl {

	public PythonResource(URI uri) {
		super(uri);
	}
		
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		String src = DefaultConverter.INSTANCE.toString(inputStream);
		Source pythonSource = PythonFactory.eINSTANCE.createSource();
		pythonSource.setSource(src);
		getContents().add(pythonSource);
	}
	
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		try (Writer writer = new OutputStreamWriter(outputStream)) {
			// Imports
			Collection<Import> imports = new ArrayList<>();
			getAllContents().forEachRemaining(e -> {
				if (e instanceof Import) {
					imports.add((Import) e);
				}
			});
			
			Comparator<String> strCmp = (a,b) -> {
				if (Objects.equals(a,b)) {
					return 0;
				}
				
				if (a == null) {
					return -1;
				}
				
				if (b == null) {
					return 1;
				}
				
				return a.compareTo(b);
			};			
			
			for (Entry<String, List<Import>> moduleImports: Util.groupBy(imports, Import::getModule, new TreeMap<String, List<Import>>(strCmp)).entrySet()) {
				String moduleName = moduleImports.getKey();
				StringBuilder itemBuilder = new StringBuilder();
				for (Entry<String, List<Import>> aliasImports: Util.groupBy(moduleImports.getValue(), Import::getAlias, new TreeMap<String, List<Import>>(strCmp)).entrySet()) {
					for (Entry<String, List<Import>> itemImports: Util.groupBy(aliasImports.getValue(), Import::getItem, new TreeMap<String, List<Import>>(strCmp)).entrySet()) {
						String item = itemImports.getKey();
						if (Util.isBlank(item)) {
							// Module import
							String alias = aliasImports.getKey();
							if (Util.isBlank(alias)) {
								writer.write("import " + moduleName + System.lineSeparator());
							} else {
								writer.write("import " + moduleName + " as " + alias + System.lineSeparator());								
							}
						} else {
							// Item imports
							for (Entry<String, List<Import>> nameImports: Util.groupBy(itemImports.getValue(), Import::getName, new TreeMap<String, List<Import>>(strCmp)).entrySet()) {
								if (itemBuilder.isEmpty()) {
									itemBuilder.append("from " + moduleName  + " import ");
								} else {
									itemBuilder.append(", ");
								}
								String name = nameImports.getKey();
								itemBuilder.append(item);
								if (!Util.isBlank(name)) {
									itemBuilder.append(" as " + name);
								}
							}
						}
					}
				}
				if (!itemBuilder.isEmpty()) {
					itemBuilder.append(System.lineSeparator());
					writer.write(itemBuilder.toString());
				}
			}
			
			// Source
			for (EObject root: getContents()) {
				if (root instanceof Source) {
					writer.write(((Source) root).generate(null, 0));
				}
			}
		}
	}
	
}
