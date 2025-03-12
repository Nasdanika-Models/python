import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.python.ecore.ECoreGenPythonProcessorsCapabilityFactory;

module org.nasdanika.models.python.ecore {
		
	requires transitive org.nasdanika.models.python;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.python.ecore;
	opens org.nasdanika.models.python.ecore; // For loading resources

	provides CapabilityFactory with ECoreGenPythonProcessorsCapabilityFactory;
	
}
