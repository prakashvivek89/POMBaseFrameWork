package com.bdd.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.bdd.framework.helper.WebDriverHelper;

import lombok.Getter;

public class WebdriverAction {
	
	private static final long DRIVER_WAIT_TIME = 10;

    @Getter
    protected WebDriverWait wait;
    @Getter
    private WebDriver driver;


    protected WebdriverAction() {
        this.driver = WebDriverHelper.getDriver();
        this.wait = new WebDriverWait(driver, DRIVER_WAIT_TIME);
    }
     
   
}
