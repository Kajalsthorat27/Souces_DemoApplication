package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtliesLayer.Wait;

public class CheckoutPage extends BaseClass {
	
	@FindBy(name="checkout")
	private WebElement Checkout;
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(name="postalCode")
	private WebElement postalCode;
	
	@FindBy(name="continue")
	private WebElement Continue;
	
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void checkout()
	{
		Wait.click(Checkout);
	}
	public void checkoutFunctionality(String fName,String lname,String pcode)
	{
		Wait.sendKeys(firstName, fName );
		Wait.sendKeys(lastName, lname);
		Wait.sendKeys(postalCode, pcode);
		
	}
	public void cont()
	{
		Wait.click(Continue);
	}
	
	

}
