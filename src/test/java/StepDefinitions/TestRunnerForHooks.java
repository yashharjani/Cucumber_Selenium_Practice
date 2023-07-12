package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/HooksDemoLogin.feature",
glue= {"StepDefinitionForHooks"},
monochrome = true,
plugin = {"pretty","html:target/HTMlReports/report.html", 
		"json:target/JSONReports/report.json"}
)

public class TestRunnerForHooks {

}
