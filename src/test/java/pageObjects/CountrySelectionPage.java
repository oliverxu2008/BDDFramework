package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CountrySelectionPage {
	public WebDriver driver;
	
	public CountrySelectionPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// select country
	By countrySelect = By.xpath("//div[@class='wrapperTwo']//div//select");
	public WebElement getCountrySelect()
	{
		return driver.findElement(countrySelect);
	}
	
	// Australia of selection list
	// <option value="Australia" xpath="1">Australia</option>
	public WebElement setCountry(String country)
	{
		// //option[@value='Australia']
		
		String countryXpath;
		countryXpath = "//option[@value='" + country + "']";	
		return driver.findElement(By.xpath(countryXpath));
	}
	
	// check agree
	By checkAgree = By.xpath("//input[@class='chkAgree']");
	public WebElement getCheckAgree()
	{
		return driver.findElement(checkAgree);
	}
	
	// Proceed button
	By proceedBtn = By.xpath("//button[contains(text(),'Proceed')]");
	public WebElement getProceedBtn()
	{
		return driver.findElement(proceedBtn);
	}
	

	

	
	
}
