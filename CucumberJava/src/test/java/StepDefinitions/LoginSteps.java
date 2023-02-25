package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Given step");
	}

	@When("user enters useername and password")
	public void user_enters_useername_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside When step");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside And step");
	}

//	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Then step");
	}

}
