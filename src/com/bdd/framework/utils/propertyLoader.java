package com.bdd.framework.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class propertyLoader {
	static Properties prop;
	static 
	{
		loadEnvironmentProperties();
	  	}
	
	
	private static void loadEnvironmentProperties(){
		prop = new Properties();
	 InputStream in = propertyLoader.class.getResourceAsStream("/test/properties/environment.properties");
	    try {
	        prop.load(in);
	        in.close();
	        } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	  }
	
	public static String getBrowse(){
		return prop.getProperty("BROWSER");
	}
	
	public static String getURL(){
		return prop.getProperty("URL");
	}
}
