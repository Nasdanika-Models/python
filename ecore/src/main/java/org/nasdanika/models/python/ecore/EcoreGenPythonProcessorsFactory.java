package org.nasdanika.models.python.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.python.PythonPackage;

@EPackageNodeProcessorFactory(nsURI = PythonPackage.eNS_URI)
public class EcoreGenPythonProcessorsFactory {

	private Context context;
	
	public EcoreGenPythonProcessorsFactory(Context context) {
		this.context = context;
	}
	
	/**
	 * Test of different ways to conProcessorsFactory ProcessorsFactory;e action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EPackageNodeProcessorFactory(
			label = "Python Model",
			//actionPrototypeRef = "test-package.yml",
//			actionPrototype = """
//                    app-action:
//                        text: Param
//                        icon: fas fa-user					
//					""",
			icon = "https://docs.nasdanika.org/images/python.svg",
			description = "A model of a Python language elements for the purposes of code generation",
			documentation =  
				"""
				The Python model can be used for generation of Python code. 
				It takes care of indentation and import management, which simplifies "assembly" of Python sources from multiple elements.				
				
				### Example
				
				[PythonTests.java](https://github.com/Nasdanika-Models/python/blob/main/model/src/test/java/org/nasdanika/models/python/tests/PythonTests.java#L24):
				
				```java
				// Building
				PythonFactory pythonFactory = PythonFactory.eINSTANCE;
				
				// Class
				Class pClass = pythonFactory.createClass();
				pClass.setName("LatestAiDevelopment");
				pClass.getDecorators().add("CrewBase");			
				pClass.addItemImport("crewai.project", "CrewBase");
				
				org.nasdanika.models.source.Source classDoc = org.nasdanika.models.source.Source.create(\"\\\"\\\"\\\"LatestAiDevelopment crew\\\"\\\"\\\"\");
				pClass.getBody().add(classDoc);
				
				pClass.getBody().add(org.nasdanika.models.source.Source.create(
					\"\"\"
			
					# Learn more about YAML configuration files here:
					# Agents: https://docs.crewai.com/concepts/agents#yaml-configuration-recommended
					# Tasks: https://docs.crewai.com/concepts/tasks#yaml-configuration-recommended
					agents_config = 'config/agents.yaml'		
					\"\"\"));
				
				// Variable
				Variable taskConfig = pythonFactory.createVariable();
				taskConfig.setName("task_config");
				taskConfig.setExpression("'config/tasks.yaml'");
				pClass.getBody().add(taskConfig);
				
				// Function
				Function researcherFunction = pythonFactory.createFunction();
				org.nasdanika.models.source.Source researcherFunctionBody = org.nasdanika.models.source.Source.create(
					\"\"\"
					return Agent(
						config=self.agents_config['researcher'],
						verbose=True
					)				
					\"\"\");
				
				researcherFunction.getBody().add(researcherFunctionBody);
				researcherFunction.setAnnotation("Agent");		
				researcherFunction.setName("researcher");
				researcherFunction.getParameters().add("self");		
				researcherFunction.getDecorators().add("agent");
				researcherFunction.addItemImport("crewai", "Agent");
				researcherFunction.addItemImport("crewai.project", "agent");		
				pClass.getBody().add(researcherFunction);
				
				// Saving		
				CapabilityLoader capabilityLoader = new CapabilityLoader();
				ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
				Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);
				ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
				File pythonFile = new File("target/test.py").getCanonicalFile();
				Resource pythonResource = resourceSet.createResource(URI.createFileURI(pythonFile.getAbsolutePath()));
				pythonResource.getContents().add(pClass);
				pythonResource.save(null);
				```
				
				Output:
				
				```python
				from crewai import Agent
				from crewai.project import CrewBase, agent
				@CrewBase
				class LatestAiDevelopment:
				    \"\"\"LatestAiDevelopment crew\"\"\"
				    
				    # Learn more about YAML configuration files here:
				    # Agents: https://docs.crewai.com/concepts/agents#yaml-configuration-recommended
				    # Tasks: https://docs.crewai.com/concepts/tasks#yaml-configuration-recommended
				    agents_config = 'config/agents.yaml'
				    task_config = 'config/tasks.yaml'
				    @agent
				    def researcher(self) -> Agent:
				        return Agent(
				        	config=self.agents_config['researcher'],
				        	verbose=True
				        )
				
				```
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
