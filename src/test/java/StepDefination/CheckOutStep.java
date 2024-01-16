package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutStep extends BaseClass {

	protected static CheckoutPage checkoutpage;

	@When("User click on Checkout button")
	public void user_click_on_checkout_button() {

	 checkoutpage = new CheckoutPage();
	 checkoutpage.checkout();
	}

	@When("User Enter All information firstname lastname and zipcode")
	public void user_enter_all_information_firstname_lastname_and_zipcode() {
		
		 checkoutpage.checkoutFunctionality("Shailesh", "gawali", "411014");

	}

	@Then("Click on Continue button")
	public void click_on_continue_button() {
		
		checkoutpage.cont();
	}

}
