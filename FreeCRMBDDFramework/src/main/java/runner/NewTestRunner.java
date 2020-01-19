package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "/home/hussain/eclipse-workspace/Cucumberprojects/CucumberBddTest/src/main/java/com/gyanweiser/"
					+ "cucumber/starter/features/LoginFeature.feature", //the path of the feature files
			glue={"stepDefination"}, //the path of the step definition files
			plugin = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} //to generate different types of reporting
			//monochrome = true, //display the console output in a proper readable format
			//strict = true, //it will check if any step is not defined in step definition file
			//dryRun = true //to check the mapping is proper between feature file and step definition file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 

public class NewTestRunner {


}
