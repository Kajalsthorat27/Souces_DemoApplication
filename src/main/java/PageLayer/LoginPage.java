package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtliesLayer.Wait;

public class LoginPage extends BaseClass
{
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

	public  void  LoginFunationality(String UserName, String PassWord)
	{
		Wait.sendKeys(username,UserName);
		Wait.sendKeys(Password, PassWord);
	
	}
	public void clickLogin()
	{
		Wait.click(loginbutton);
	}
	

}
