package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.OverviewPage;
import io.cucumber.java.en.Then;

public class OverviewStep extends BaseClass{

	
	
	@Then("User click on Finish button and capture thankyou message")
	public void user_click_on_finish_button_and_capture_thankyou_message() {
	   
		OverviewPage overviewpage=new OverviewPage();
		overviewpage.Ocerviewfunctionality();
		
	}
}
