package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.interactions.Action;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;


import Automation.BDDFramework.Base;

@RunWith(Cucumber.class)
public class stepDefinitions {

	public WebDriver driver;
	public Properties prop;
	JavascriptExecutor js;
	HomePage homepage;

	String imgPath;  // the path to store the screenshot
	boolean wantScreenShot;
	Integer waitTimer;
	
	public void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile=new File(fileWithPath);

        //Copy file at destination
        //FileUtils.copyFile(SrcFile, DestFile);
        FileHandler.copy(SrcFile, DestFile);
        
        // sleep 500 ms
        Thread.sleep(500);
    }
	
	String imgFile(String imgPath) {
		// to dynamically generate a unique file name for screenshot like: 
		// C:\01_work\TER\TER_Java\screenShot\TER_0130_07-13-56.jpg
		  
		LocalDateTime myDateObj = LocalDateTime.now();
		    
		//DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMdd_HH-mm-ss");
		String formattedDate = myDateObj.format(myFormatObj);
		    
		String fileName;
		    
		fileName = imgPath + "TER_"  + formattedDate + ".jpg";
		return fileName;
	}	

	@Given("^User is on Greencart Landing page$")
	public void user_is_on_Greencart_Landing_page() throws Throwable {
		driver = Base.getDriver();
		prop = Base.getConfig();
		js = (JavascriptExecutor) driver;
		
		waitTimer = Integer.valueOf(prop.getProperty("waitTimer"));
		imgPath = prop.getProperty("imgPath");
		wantScreenShot = Boolean.parseBoolean(prop.getProperty("wantScreenShot"));

		// define all the required page object for various pages in one single place
		homepage = new HomePage(driver);
		
		System.out.println("wantScreenShot: " + prop.getProperty("wantScreenShot"));
		System.out.println("imgPath: " + imgPath);
		System.out.println("imgFile: " + imgFile(imgPath));

		Thread.sleep(waitTimer);		
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}		
	}
	
    @And("^User searches (.+) Vegetable$")
    public void user_searches_vegetable(String name) throws Throwable {
        homepage.getSearchBox().clear();
        homepage.getSearchBox().sendKeys(name);
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @And("^User sets (.+) Kg$")
    public void user_sets_kg(String kilogram) throws Throwable {
        homepage.getQuantity().clear();
        Thread.sleep(waitTimer);
        
        homepage.getQuantity().sendKeys(kilogram);
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @And("^User clicks increase to add one Kg$")
    public void user_clicks_increase_to_add_one_kg() throws Throwable {
    	
    	homepage.getIncrement().click();
    	Thread.sleep(waitTimer);
    	
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}    	
    }

    @And("^User clicks decrease to remove one Kg$")
    public void user_clicks_decrease_to_remove_one_kg() throws Throwable {
        homepage.getDecrement().click();
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @And("^User clicks ADD TO CART$")
    public void user_clicks_add_to_cart() throws Throwable {
        homepage.getAddToCartBtn().click();
        Thread.sleep(waitTimer);
    }

    @And("^User clicks shopping cart$")
    public void user_clicks_shopping_cart() throws Throwable {
        homepage.getCart().click();
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @And("^User clicks PROCEED TO CHECKOUT$")
    public void user_clicks_proceed_to_checkout() throws Throwable {
        homepage.getCheckOutBtn().click();
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @And("^User enters promotion code (.+)$")
    public void user_enters_promotion_code(String promotioncode) throws Throwable {
        homepage.getPromoCode().clear();
        homepage.getPromoCode().sendKeys(promotioncode);
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
        
        homepage.getApplyBtn().click();
        Thread.sleep(waitTimer*2);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @And("^User clicks Place Order$")
    public void user_clicks_place_order() throws Throwable {
        homepage.getPlaceOrderBtn().click();
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @And("^User selects country (.+)$")
    public void user_selects_country(String country) throws Throwable {
        homepage.getCountrySelect().click();
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
        
        homepage.setCountry(country).click();
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @And("^User ticks Terms and Conditions$")
    public void user_ticks_terms_and_conditions() throws Throwable {
        homepage.getCheckAgree().click();
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @And("^User clicks Proceed button$")
    public void user_clicks_proceed_button() throws Throwable {
        homepage.getProceedBtn().click();
        Thread.sleep(waitTimer);
        
		// take screen shot
		if (wantScreenShot) {
			takeSnapShot(driver, imgFile(imgPath));
		}        
    }

    @Then("^User was navigated to final confirmation page with text \"([^\"]*)\"$")
    public void user_was_navigated_to_final_confirmation_page_with_text_something(String strArg1) throws Throwable {
        String messageTxt = homepage.getMessageTxt();
        Assert.assertTrue(messageTxt.contains(strArg1));
    }
	
    @And("^User was navigated to Greencart Landing page$")
    public void user_was_navigated_to_greencart_landing_page() throws Throwable {
    	int size = homepage.getProducts().size();
    	System.out.println(".products-wrapper size: " + size);
    	Assert.assertTrue(size>0);
    }

}