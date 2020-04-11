package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	// search text box
	// By loginBtn= By.cssSelector("button.simpleButton-0-2-18");	
	By searchBox= By.xpath("//input[@class='search-keyword']");
	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}
	
	// addToCartBtn
	By addToCartBtn = By.xpath("//button[contains(text(),'ADD TO CART')]");
	public WebElement getAddToCartBtn() 
	{
		return driver.findElement(addToCartBtn);
	}
	
	// increment
	By increment = By.xpath("//a[@class='increment']");
	public WebElement getIncrement()
	{
		return driver.findElement(increment);
	}
	
	// decrement
	By decrement = By.xpath("//a[@class='decrement']");
	public WebElement getDecrement()
	{
		return driver.findElement(decrement);
	}
	
	// quantity
	By quantity = By.xpath("//input[@class='quantity']");
	public WebElement getQuantity()
	{
		return driver.findElement(quantity);
	}
	
	// shopping cart
	By cart = By.xpath("//a[@class='cart-icon']/img[@alt='Cart']");
	public WebElement getCart()
	{
		return driver.findElement(cart);
	}
	
	// Check Out Button
	By checkOutBtn = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	public WebElement getCheckOutBtn()
	{
		return driver.findElement(checkOutBtn);
	}
	
	// product-name in checkout summary table
	By productName = By.xpath("//p[@class='product-name']");
	public WebElement getProductName()
	{
		return driver.findElement(productName);
	}
			
	// Enter promo code
	By promoCode = By.xpath("//input[@placeholder='Enter promo code']");
	public WebElement getPromoCode()
	{
		return driver.findElement(promoCode);
	}
	
	// Apply button
	By applyBtn = By.xpath("//button[@class='promoBtn']");
	public WebElement getApplyBtn()
	{
		return driver.findElement(applyBtn);
	}
	
	// place order button
	By placeOrderBtn = By.xpath("//button[contains(text(),'Place Order')]");
	public WebElement getPlaceOrderBtn()
	{
		return driver.findElement(placeOrderBtn);
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
	
	// Message Text
	By messageTxt = By.xpath("//div[@class='wrapperTwo']/span");
	public String getMessageTxt() {
		return driver.findElement(messageTxt).getText();
	}
	
	// homepage contains a web element "//div[@class='products-wrapper']"
	// driver.findElements( By.id("...") ).size() != 0
	public List<WebElement> getProducts() {
		By productsWrapper = By.cssSelector(".products-wrapper");
		return driver.findElements(productsWrapper);
	}
	
	
}
