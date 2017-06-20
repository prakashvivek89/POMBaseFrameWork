package com.bdd.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.bdd.framework.helper.WebDriverHelper;

public class AutomationSuite extends WebDriverHelper{
	
	 protected WebDriver driver;
	 private String baseURL;
	 private String browser;
	
     public void setUp() {
    	 baseURL="https://10.13.1.205/nl/eur/";
           System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
           driver = new ChromeDriver();
          
     }
	 
	 
     public void homePage() {
    	driver.get(baseURL);
    	 driver.manage().window().maximize();
     }

     public void click(String login1) {
    	 if(driver.findElements(By.xpath(login1)).size() >0){
    			driver.findElement(By.xpath(login1)).click();
    			}
      }
     
     public void enterText(String pageId, String val) {
    	 if(driver.findElements(By.xpath(pageId)).size() >0){
    			driver.findElement(By.xpath(pageId)).sendKeys(val);
    			}
    	 else if(driver.findElements(By.id(pageId)).size() >0){
 			driver.findElement(By.id(pageId)).sendKeys(val);
 			}
      }
    
     public void tearDown() {
           driver.close();
     }

}
	