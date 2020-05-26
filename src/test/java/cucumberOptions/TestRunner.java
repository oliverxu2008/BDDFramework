package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions",
		
		// dryRun is mainly used to check whether the stepDefinition were done for the feature files.
//		dryRun = true,
		
		// monochrome is to generate a tidy output of plain text result
		monochrome = true,
		
		// if you don't want to pass the test when there is pending exception wo any implementation then set strict = true
		//strict = true,
		
		tags = "@SmokeTest",
		plugin = {"pretty", "html:target/htmlReport", "json:target/cucumber.json", "junit:target/cukes.xml"}
)
public class TestRunner {
	
}
