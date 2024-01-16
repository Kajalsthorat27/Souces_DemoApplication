package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtliesLayer.Wait;

public class AddCartPage extends BaseClass{
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement backpack;
	
	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	private WebElement bikeLight;

	@FindBy(className="shopping_cart_container")
	private WebElement CartButton;
	
	
	public AddCartPage () {
		
		PageFactory.initElements(driver, this);
	}
	
	public void AddToCart() {
		
		Wait.click(backpack);
		Wait.click(bikeLight);
		
	}
	public void cartIcon() {
		Wait.click(CartButton);
	}
}
