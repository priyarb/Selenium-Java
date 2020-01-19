package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//The import cucumber.api.junit cannot be resolved
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="G:\\Priya\\Softwares\\Eclipse 2\\Selenium\\Test\\src\\main\\java\\features\\test.feature",
		glue= {"StepDefinition"},
		dryRun = true
		)

public class TestRunner {

}
