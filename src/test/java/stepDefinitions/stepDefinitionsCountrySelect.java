package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import Automation.BDDFramework.Base;
import pageObjects.CountrySelectionPage;

@RunWith(Cucumber.class)
public class stepDefinitionsCountrySelect extends Base{	
	// define all the required page object for various pages in one single place
	CountrySelectionPage countryselectionpage = new CountrySelectionPage(driver);
	
	 @And("^User selects country (.+)$")
	    public void user_selects_country(String country) throws Throwable {
		 	countryselectionpage.getCountrySelect().click();
	        Thread.sleep(waitTimer);
	        
			// take screen shot
			if (wantScreenShot) {
				takeSnapShot(driver, imgFile(imgPath));
			}        
	        
			countryselectionpage.setCountry(country).click();
	        Thread.sleep(waitTimer);
	        
			// take screen shot
			if (wantScreenShot) {
				takeSnapShot(driver, imgFile(imgPath));
			}        
	    }

	    @And("^User ticks Terms and Conditions$")
	    public void user_ticks_terms_and_conditions() throws Throwable {
	    	countryselectionpage.getCheckAgree().click();
	        Thread.sleep(waitTimer);
	        
			// take screen shot
			if (wantScreenShot) {
				takeSnapShot(driver, imgFile(imgPath));
			}        
	    }

	    @And("^User clicks Proceed button$")
	    public void user_clicks_proceed_button() throws Throwable {
	    	countryselectionpage.getProceedBtn().click();
	        Thread.sleep(waitTimer);
	        
			// take screen shot
			if (wantScreenShot) {
				takeSnapShot(driver, imgFile(imgPath));
			}        
	    }

}
