package Automation.BDDFramework;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public static Properties getConfig() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\01_work\\TER\\TER_Java\\eclipse-workspace\\BDDFramework\\src\\test\\java\\Automation\\BDDFramework\\global.properties");		
	    prop.load(fis);
		
		return prop;		
	}
	
	public static WebDriver getDriver() throws IOException
	{
		prop = Base.getConfig();
		
		String url;
		String browserType;
		String chromeDriver;
		String geckoDriver;
		
		Boolean maxWindow;
		Boolean flagMobileEmulation;
		String mobileEmuDeviceName;
		Integer implicitWaitTime;
		
		url = prop.getProperty("url");
		browserType = prop.getProperty("browserType");
		chromeDriver = prop.getProperty("chromeDriver");
		geckoDriver = prop.getProperty("geckoDriver");
		mobileEmuDeviceName = prop.getProperty("mobileEmuDeviceName");
		
		maxWindow = Boolean.parseBoolean(prop.getProperty("maxWindow"));
		flagMobileEmulation = Boolean.parseBoolean(prop.getProperty("flagMobileEmulation"));

	    implicitWaitTime = Integer.valueOf(prop.getProperty("implicitWaitTime"));
		
	    if (browserType.equals("Chrome")) {
	    	// set driver as Chrome
			ChromeOptions options = new ChromeOptions();
			
			// set Chrome mobileEmulation
			if (flagMobileEmulation) {
				Map<String, String> mobileEmulation = new HashMap<String, String>();
				mobileEmulation.put("deviceName", mobileEmuDeviceName);
				options.setExperimentalOption("mobileEmulation", mobileEmulation);
			} else if (maxWindow) {
				// maximize window
				options.addArguments("--start-maximized");
			}
		
			System.setProperty("webdriver.chrome.driver", chromeDriver);			
		    driver=new ChromeDriver(options);   
	    }
	    else  {
	    	// set driver as Firefox
	    	System.setProperty("webdriver.gecko.driver", geckoDriver);
	    	driver = new FirefoxDriver();
	    	
	    	if (maxWindow) {
	    		driver.manage().window().maximize();
			}
	    } 
	    
	    // set the implicit wait timer in the unit of SECONDS
	    driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);	    
   	 
	    // open the url
  	    driver.get(url);
   	    return driver;		
	}
	
}
