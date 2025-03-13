var searchDocuments = {"references/eClassifiers/Class/inheritance.html":{"path":"Class/Inheritance","link-uuid":"01bfb33b-28c4-4816-b1f3-4eeddff1f947","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Function/inheritance.html":{"path":"Function/Inheritance","link-uuid":"5bd25b7f-ea15-4c04-8a84-837b3d937441","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/NamedElement/inheritance.html":{"path":"NamedElement/Inheritance","link-uuid":"f0a76298-1da6-48ec-94a3-e1c56d95936c","title":"Inheritance","content":"Supertypes Subtypes  "},"index.html":{"link-uuid":"dc7f650b-f108-497f-ac66-c13136c0f9a6","title":"Python Model","content":"The Python model can be used for generation of Python code. It takes care of indentation and import management, which simplifies &ldquo;assembly&rdquo; of Python sources from multiple elements. Example PythonTests.java: // Building\nPythonFactory pythonFactory = PythonFactory.eINSTANCE;\n\n// Class\nClass pClass = pythonFactory.createClass();\npClass.setName(&quot;LatestAiDevelopment&quot;);\npClass.getDecorators().add(&quot;CrewBase&quot;);\npClass.addItemImport(&quot;crewai.project&quot;, &quot;CrewBase&quot;);\n\norg.nasdanika.models.source.Source classDoc = org.nasdanika.models.source.Source.create(&quot;\\&quot;\\&quot;\\&quot;LatestAiDevelopment crew\\&quot;\\&quot;\\&quot;&quot;);\npClass.getBody().add(classDoc);\n\npClass.getBody().add(org.nasdanika.models.source.Source.create(\n\t&quot;&quot;&quot;\n\n\t# Learn more about YAML configuration files here:\n\t# Agents: https://docs.crewai.com/concepts/agents#yaml-configuration-recommended\n\t# Tasks: https://docs.crewai.com/concepts/tasks#yaml-configuration-recommended\n\tagents_config = 'config/agents.yaml'\n\t&quot;&quot;&quot;));\n\n// Variable\nVariable taskConfig = pythonFactory.createVariable();\ntaskConfig.setName(&quot;task_config&quot;);\ntaskConfig.setExpression(&quot;'config/tasks.yaml'&quot;);\npClass.getBody().add(taskConfig);\n\n// Function\nFunction researcherFunction = pythonFactory.createFunction();\norg.nasdanika.models.source.Source researcherFunctionBody = org.nasdanika.models.source.Source.create(\n\t&quot;&quot;&quot;\n\treturn Agent(\n\t\tconfig=self.agents_config['researcher'],\n\t\tverbose=True\n\t)\n\t&quot;&quot;&quot;);\n\nresearcherFunction.getBody().add(researcherFunctionBody);\nresearcherFunction.setAnnotation(&quot;Agent&quot;);\nresearcherFunction.setName(&quot;researcher&quot;);\nresearcherFunction.getParameters().add(&quot;self&quot;);\nresearcherFunction.getDecorators().add(&quot;agent&quot;);\nresearcherFunction.addItemImport(&quot;crewai&quot;, &quot;Agent&quot;);\nresearcherFunction.addItemImport(&quot;crewai.project&quot;, &quot;agent&quot;);\npClass.getBody().add(researcherFunction);\n\n// Saving\nCapabilityLoader capabilityLoader = new CapabilityLoader();\nProgressMonitor progressMonitor = new PrintStreamProgressMonitor();\nRequirement&lt;ResourceSetRequirement, ResourceSet&gt; requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);\nResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);\n\nFile pythonFile = new File(&quot;target/test.py&quot;).getCanonicalFile();\nResource pythonResource = resourceSet.createResource(URI.createFileURI(pythonFile.getAbsolutePath()));\npythonResource.getContents().add(pClass);\npythonResource.save(null);\n Output: from crewai import Agent\nfrom crewai.project import CrewBase, agent\n@CrewBase\nclass LatestAiDevelopment:\n    &quot;&quot;&quot;LatestAiDevelopment crew&quot;&quot;&quot;\n\n    # Learn more about YAML configuration files here:\n    # Agents: https://docs.crewai.com/concepts/agents#yaml-configuration-recommended\n    # Tasks: https://docs.crewai.com/concepts/tasks#yaml-configuration-recommended\n    agents_config = 'config/agents.yaml'\n    task_config = 'config/tasks.yaml'\n    @agent\n    def researcher(self) -&gt; Agent:\n        return Agent(\n        \tconfig=self.agents_config['researcher'],\n        \tverbose=True\n        )"},"references/eClassifiers/Variable/inheritance.html":{"path":"Variable/Inheritance","link-uuid":"897cdc57-8c63-4715-9135-ea74aca2086f","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Source/inheritance.html":{"path":"Source/Inheritance","link-uuid":"192bc716-afa3-40c5-978b-d013c8c2703e","title":"Inheritance","content":"Supertypes Subtypes  "}}