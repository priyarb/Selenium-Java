package NewRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="G:\\Priya\\Softwares\\Eclipse 2\\Selenium\\FreeCRMCucumber\\src\\main\\java\\Feature.",
		glue= {"NewStepDefination"}
		//dryRun = true
		)


public class NewTestRunner {

}
