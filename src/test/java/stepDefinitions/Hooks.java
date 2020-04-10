package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Automation.BDDFramework.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{

	
	@Before()
	public void beforevaldiation()
	{
		// System.out.println("Before Mobile  hook");
	}
	
	@After("@SmokeTest")
	public void Aftervaldiation()
	{
		driver.close();
        driver.quit();
	}
		
	}

