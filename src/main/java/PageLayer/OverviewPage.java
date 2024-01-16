package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtliesLayer.Wait;

public class OverviewPage extends BaseClass {
	
	@FindBy(id="finish")
	private WebElement Finish;
	
	@FindBy(xpath="//h2[contains(text(),'Thank you')]")
	private WebElement thankyoumessage;

	public OverviewPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public String Ocerviewfunctionality()
	{
		Wait.click(Finish);
		
		return thankyoumessage.getAttribute("value");
		
		
	}
}
