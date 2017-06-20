package com.bdd.framework.helper;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.bdd.framework.utils.*;

public class WebDriverHelper {
	 private static WebDriver driver;
	 private static String baseURL;
	 private static String browser;
	 
	 public static void setup(){	
    	 browser = propertyLoader.getBrowse();
    	 baseURL = propertyLoader.getURL();
    	 System.out.println("BROWSER ::" +browser);
    	 if (browser!= null && browser.equalsIgnoreCase("googlechrom"))
    	 {
    		 startChromeDriver();
    	 
    	 }
    	 else if (browser!= null && browser.equalsIgnoreCase("iexplore"))
    	 {
        	 // to-do
         }
    	 else if (browser!= null && browser.equalsIgnoreCase("firefox")){
        	// to-do
        	 
    	 }
   	 }
	 
	 public static WebDriver getDriver(){
		 return driver;
	 }
	 
	 public static WebDriver startChromeDriver(){
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		 DesiredCapabilities desiredCapabilities = getChromeDriverCapabilities();
			driver = new ChromeDriver(desiredCapabilities);
			return driver;
	 }
	 
	 public static DesiredCapabilities getChromeDriverCapabilities(){
		 DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
			desiredCapabilities = DesiredCapabilities.chrome();
			desiredCapabilities.setCapability("chrome.switches", Arrays.asList("--disable-print-preview"));
			desiredCapabilities.setCapability("chrome.switches", Arrays.asList("--disable-print-preview"));
			return desiredCapabilities;
	 }
	 
	 public void tearDown() {
         driver.quit();
   }
	
}
