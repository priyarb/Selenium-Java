package stepDefinition;

import cucumber.api.java.en.Given;

public class TestApp {
	
	@Given ("^I want to write a step with precondition$")
	public void test() {
		System.out.println("hello");
	}

}
