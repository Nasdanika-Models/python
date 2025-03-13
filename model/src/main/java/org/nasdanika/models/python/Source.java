/**
 */
package org.nasdanika.models.python;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.Source#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.python.PythonPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends org.nasdanika.models.source.Source {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.python.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.nasdanika.models.python.PythonPackage#getSource_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();
		
	default Import addModuleImport(String moduleName) {		
		Import ret = Import.createModuleImport(moduleName);
		getImports().add(ret);
		return ret;
	}
	
	default Import addModuleImport(String moduleName, String alias) {
		Import ret = Import.createModuleImport(moduleName, alias);
		getImports().add(ret);
		return ret;
	}
		
	default Import addItemImport(String moduleName, String item) {
		Import ret = Import.createItemImport(moduleName, item);
		getImports().add(ret);
		return ret;
	}
	
	/**
	 * Multiple imports for the same module
	 * @param moduleName
	 * @param item
	 * @return
	 */
	default List<Import> addItemImports(String moduleName, String... items) {
		return Arrays
				.stream(items)
				.map(item -> addItemImport(moduleName, item))
				.toList();
	}
		
	default Import addItemImport(String moduleName, String item, String name) {
		Import ret = Import.createItemImport(moduleName, item, name);
		getImports().add(ret);
		return ret;
	}		
	

} // Source
