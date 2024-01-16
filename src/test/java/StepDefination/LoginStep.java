package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {
	protected static 	LoginPage loginpage;

	@Given("User is on souces Demo Login Page")
	public void user_is_on_souces_demo_login_page() {
		BaseClass.initialization();
		
	}

	@When("User enter UserName and Password")
	public void user_enter_user_name_and_password() {
		loginpage = new LoginPage();
		loginpage.LoginFunationality("standard_user", "secret_sauce");
	}

	@Then("User click on Login button")
	public void user_click_on_login_button() {
		loginpage.clickLogin();
	}

}
