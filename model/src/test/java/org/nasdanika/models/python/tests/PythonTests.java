package org.nasdanika.models.python.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.python.Class;
import org.nasdanika.models.python.Function;
import org.nasdanika.models.python.Import;
import org.nasdanika.models.python.PythonFactory;
import org.nasdanika.models.python.Variable;

public class PythonTests {
	
	@Test
	public void testGeneratePython() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);

		File pythonFile = new File("target/test.py").getCanonicalFile();
		Resource pythonResource = resourceSet.createResource(URI.createFileURI(pythonFile.getAbsolutePath()));
		
		// Class
		PythonFactory pythonFactory = PythonFactory.eINSTANCE;
		Class pClass = pythonFactory.createClass();
		pClass.setName("LatestAiDevelopment");
		pythonResource.getContents().add(pClass);
		pClass.getDecorators().add("CrewBase");			
		Import crewBaseImport = pythonFactory.createImport();
		crewBaseImport.setModule("crewai.project");
		crewBaseImport.setItem("CrewBase");
		pClass.getImports().add(crewBaseImport);
		
		org.nasdanika.models.source.Source classDoc = org.nasdanika.models.source.Source.create("\"\"\"LatestAiDevelopment crew\"\"\"");
		pClass.getBody().add(classDoc);
		
		pClass.getBody().add(org.nasdanika.models.source.Source.create(
		"""

		# Learn more about YAML configuration files here:
		# Agents: https://docs.crewai.com/concepts/agents#yaml-configuration-recommended
		# Tasks: https://docs.crewai.com/concepts/tasks#yaml-configuration-recommended
		agents_config = 'config/agents.yaml'		
		"""));
		
		// Variable
		Variable taskConfig = pythonFactory.createVariable();
		taskConfig.setName("task_config");
		taskConfig.setExpression("'config/tasks.yaml'");
		pClass.getBody().add(taskConfig);
		
		// Function
		Function researcherFunction = pythonFactory.createFunction();
		org.nasdanika.models.source.Source researcherFunctionBody = org.nasdanika.models.source.Source.create(
			"""
			return Agent(
				config=self.agents_config['researcher'],
				verbose=True
			)				
			""");
		
		researcherFunction.getBody().add(researcherFunctionBody);
		researcherFunction.setAnnotation("Agent");
		
		researcherFunction.setName("researcher");
		researcherFunction.getParameters().add("self");
		
		researcherFunction.getDecorators().add("agent");
		Import crewAgentImport = pythonFactory.createImport();
		crewAgentImport.setModule("crewai");
		crewAgentImport.setItem("Agent");
		researcherFunction.getImports().add(crewAgentImport);
		
		Import agentImport = pythonFactory.createImport();
		agentImport.setModule("crewai.project");
		agentImport.setItem("agent");
		researcherFunction.getImports().add(agentImport);
		
		pClass.getBody().add(researcherFunction);
		
		pythonResource.save(null);
	}
	
	
}
