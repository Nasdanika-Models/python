import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.python.util.PythonEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.python.util.PythonResourceFactoryCapabilityFactory;

module org.nasdanika.models.python {
	
	exports org.nasdanika.models.python;
	exports org.nasdanika.models.python.impl;
	exports org.nasdanika.models.python.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.source;
	requires org.eclipse.emf.ecore.xmi; 
	
	provides CapabilityFactory with 
		PythonEPackageResourceSetCapabilityFactory,
		PythonResourceFactoryCapabilityFactory;
	
}