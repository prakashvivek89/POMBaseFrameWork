package com.bdd.framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

		plugin = {"pretty",

				"html:target/cucumber-html-report",

				"junit:target/cucumber-junit-report/allcukes.xml"},

				tags = {"@Runm"},
				
				features = {"src/test/resources"}

)

public class testrunner {

}