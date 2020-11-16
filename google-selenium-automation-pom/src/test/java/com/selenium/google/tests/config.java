package com.selenium.google.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.selenium.google.common.Browser;

public class config {
	
	public static WebDriver driver;
	
	@BeforeSuite
    public void setUp(){
    	driver = Browser.getDriver();
    }
	
	@AfterSuite
    public void tearDown(){
		
		driver.close();
    }

}
