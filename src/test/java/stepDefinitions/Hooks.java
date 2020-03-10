package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Automation.BDDFramework.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{

	
	@Before("@MobileTest")
	public void beforevaldiation()
	{
		System.out.println("Before Mobile  hook");
	}
	
	@After("@SmokeTest")
	public void Aftervaldiation()
	{
		driver.close();
	}
	@After("@RegressionTest")
	public void AfterSeleniumTest()
	{
		//driver.close();
	}
	
	@After("@Selenium")
    public void killBrowser(Scenario scenario){
        if (scenario.isFailed()) {
         scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        //driver.close();
        //driver.quit();
    }	
		
	}

