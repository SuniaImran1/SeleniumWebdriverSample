package Steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/cucumber/plan.feature", plugin = { "pretty",
		"html:target/cucumber-html-report", "json:cucumber.json" }, tags = { "@gmail" })
public class cucumberrunner {

}
