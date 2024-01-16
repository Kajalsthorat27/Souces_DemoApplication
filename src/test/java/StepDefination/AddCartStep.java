package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.AddCartPage;
import io.cucumber.java.en.Then;

public class AddCartStep extends BaseClass {
	
	protected static AddCartPage page;
	
	@Then("user click on add to cart for pack pack and bike light button")
	public void user_click_on_add_to_cart_for_pack_pack_and_bike_light_button() {
		
		 page= new AddCartPage();
		page.AddToCart();
	    
	}
	@Then("user click on cart symbol")
	public void user_click_on_cart_symbol() {
		page.cartIcon();
		
	}

}
