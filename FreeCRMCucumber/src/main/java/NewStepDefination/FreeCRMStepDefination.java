package NewStepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRMStepDefination {
	
	@Given("^User is already in login page$")
    public void user_is_already_in_login_page() throws Throwable {
        System.out.println("Hello");
    }

    @When("^Title should be equal to FreeCRM$")
    public void title_should_be_equal_to_freecrm() throws Throwable {
      
    }

    @Then("^User enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
  
    }

    @And("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {

    }

}
