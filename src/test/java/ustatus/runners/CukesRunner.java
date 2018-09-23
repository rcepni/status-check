package ustatus.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//			plugin= {
//					"pretty",
//					"html:target/default-cucumber-reports",
//					"json:target/cucumber.json"
//					
//			},
			tags="@status",
			features= "src/test/resources/com/status/features",
			glue= "ustatus.step_definitions"
			
//			,dryRun =true
			
			)

public class CukesRunner {

	
	
}
