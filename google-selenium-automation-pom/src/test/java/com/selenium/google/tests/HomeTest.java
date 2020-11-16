package com.selenium.google.tests;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;
import com.selenium.google.common.Browser;
import com.selenium.google.pageobjects.HomePage;
import com.selenium.google.pages.Home;

import javax.xml.xpath.XPath;

import org.apache.http.message.BasicListHeaderIterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomeTest extends config {
	static ExtentTest test;
	static ExtentReports report;
	@Test 
	public void Home_Chapter1_Test(){
		
		Home home = new Home(driver);
		String xpath = "//a[contains(text(), 'chapter1')]";
		WebElement chapter1 = home.g
		home.perform("", "rightpassword");
		home.ClickText(chapter1);
		Assert.assertTrue(true);
		
	}
	
}
