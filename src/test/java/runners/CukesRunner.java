package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
			plugin = {"pretty", 
					"html:target/cucumber-report",
					"json:target/cucumber.json"
			},
			tags ="@test1",
			features= "src/test/resources/features/",
			glue="step_defs/",
			dryRun=false
	)

public class CukesRunner extends AbstractTestNGCucumberTests{
		

	}


