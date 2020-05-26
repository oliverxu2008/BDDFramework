package Automation.BDDFramework;



//import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.FileInputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static String imgPath;  // the path to store the screenshot
	public static boolean wantScreenShot;
	public static Integer waitTimer;
	
	//BrowserStack
	public static final String USERNAME = "oliverxu2";
	public static final String AUTOMATE_KEY = "SRb3UqakNohyCGt5q53p";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";	
	
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
	
	public String imgFile(String imgPath) {
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
	
	public static Properties getConfig() throws IOException
	{
		prop=new Properties();		
		FileInputStream fis=new FileInputStream("src\\test\\java\\Automation\\BDDFramework\\global.properties");
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
		String edgeDriver;
		
		Boolean maxWindow;
		Boolean flagMobileEmulation;
		String mobileEmuDeviceName;
		Integer implicitWaitTime;
		
		url = prop.getProperty("url");
		browserType = prop.getProperty("browserType");
		chromeDriver = prop.getProperty("chromeDriver");
		geckoDriver = prop.getProperty("geckoDriver");
		edgeDriver = prop.getProperty("edgeDriver");
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
			}
	
			// maximize window
			if (maxWindow) {
				options.addArguments("--start-maximized");
			}
		
			System.setProperty("webdriver.chrome.driver", chromeDriver);			
		    driver=new ChromeDriver(options); 
		    
	    } else if (browserType.equals("Firefox")) {
	    	// set driver as Firefox
	    	System.setProperty("webdriver.gecko.driver", geckoDriver);
	    	driver = new FirefoxDriver();
	    	
	    	if (maxWindow) {
	    		driver.manage().window().maximize();
			}
	    } else if (browserType.equals("Edge")) {
	    	// set driver as Edge, not working!
	    	System.setProperty("webdriver.edge.driver", edgeDriver);
	    	driver = new EdgeDriver();
	    	
	    	driver.navigate().to(url);
	    	
	    } else if (browserType.equals("BrowserStack")) {
	        DesiredCapabilities caps = new DesiredCapabilities();
	        
	        // iOS common
	        
	        caps.setCapability("browserName", "iPhone");  // firefox, chrome, internet explorer, safari, opera, edge, iPad, iPhone, android
	        caps.setCapability("realMobile", "true");
	        //caps.setCapability("nativeWebTap", true); // to resolve the strange issue for iOS witness name text field.	        
	        
	        // iPhone 6
	        //caps.setCapability("os_version", "11");
	        //caps.setCapability("device", "iPhone 6");
	       
	        
	        // iPhone 7
	        caps.setCapability("os_version", "12");
	        caps.setCapability("device", "iPhone 7");
	        
	        
	        // iPhone 8 Plus
	        //caps.setCapability("os_version", "11");
	        //caps.setCapability("device", "iPhone 8 Plus");
	        
	        //ipad
	        //caps.setCapability("os_version", "13");
	        //caps.setCapability("device", "iPad 7th");
	        //caps.setCapability("device", "iPhone XS");
	        
	        
	        // android
	        /*
		    caps.setCapability("browserName", "android");
		    caps.setCapability("device", "Samsung Galaxy S8");
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", "7.0");
		   */

	        
	        // desktop Apple
		    /*
	        caps.setCapability("os", "OS X");
	        caps.setCapability("os_version", "Catalina");
	        //caps.setCapability("browser", "Safari");
	        //caps.setCapability("browser_version", "13.0");
	        caps.setCapability("browser", "Chrome");
	        caps.setCapability("browser_version", "80.0 beta");
	        */
	        
	        // common part
	        //caps.setCapability("browserstack.use_w3c", "true"); //Run your Selenium tests in W3C mode
	        caps.setCapability("browserstack.appium_version", "1.16.0");
	        caps.setCapability("browserstack.local", "true"); //local testing
		    caps.setCapability("project", "ISDO"); // project
		    caps.setCapability("build", "Sprint7"); // build
		    caps.setCapability("name", "iPhone-Sample"); // identifier for the test run
	        
	        driver = new RemoteWebDriver(new URL(URL), caps);
	    	
	    }	
	    
	    // set the implicit wait timer in the unit of SECONDS
	    driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);	    
   	 
	    // open the url
	    if (!browserType.equals("Edge")) {
	    	driver.get(url);
	    }
   	    
  	    return driver;		
	}
	
}

