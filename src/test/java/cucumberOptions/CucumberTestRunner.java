package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = { "bankGuru.stepDefinitions",
		"liveGuru.stepDefinitions" }, monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
				"html:target/site/cucumber-report-default", "json:target/site/cucumber.json" }, tags = { "@liveguru" })
public class CucumberTestRunner {

}
