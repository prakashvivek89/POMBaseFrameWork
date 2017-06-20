package com.bdd.framework;

import java.sql.Driver;

import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class StepDefinition extends AutomationSuite {
	
	private AutomationSuite script;
	
	
	public void setUpWebDriver() throws Exception {
		
		script = new AutomationSuite();
		 script.setUp();
	}
	
	public void tidyUp() {
		script.tearDown();
		}
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		setUpWebDriver();
		script.homePage();
		Thread.sleep(15000);
	}

	@When("^I click on \"([^\"]*)\" link$")
	public void i_click_on_link(String login) throws Throwable {
	   		System.out.println("------>" +login);
			script.click(login);
	 }

	@Then("^I verify \"([^\"]*)\" is present on home page\\.$")
	public void the_page_title_is_as_expected() throws Throwable {
	}

	@Then("^I verify \"([^\"]*)\" text is present$")
	public void i_verify_text_is_present(String text) throws Throwable {
	    throw new PendingException();
	}
	
	@When("^I enter \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter(String arg1, String arg2) throws Throwable {
		Thread.sleep(20000);
		System.out.println("===============>" +arg1);
		System.out.println("===============>" +arg2);
		script.enterText(arg1, arg2);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String button) throws Throwable {
		script.click(button);
	}


}
