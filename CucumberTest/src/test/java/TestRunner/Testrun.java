package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Home.feature", glue = "StepDefination", dryRun = false, plugin = {
		"html:target/cucumber-reports/cucumber.html" })
public class Testrun {
}
