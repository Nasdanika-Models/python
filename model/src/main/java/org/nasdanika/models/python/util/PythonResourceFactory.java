package org.nasdanika.models.python.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class PythonResourceFactory implements Resource.Factory {

	@Override
	public Resource createResource(URI uri) {
		return new PythonResource(uri);
	}

}
