package com.selenium.google.pages;

import com.selenium.google.common.BasePage;

import com.selenium.google.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage {

	/** The home page. */
	HomePage homePage;

	/**
	 * Instantiates a new login.
	 *
	 * @param driver the driver
	 */
	public Home(WebDriver driver) {
		this.driver = driver;
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	/**
	 * Perform.
	 *
	 * @param username the username
	 * @param password the password
	 */
	public void perform(String username, String password) {
		openUrl("http://book.theautomatedtester.co.uk/");
//        fillIn(homePage.txtEmail, username);
//        fillIn(homePage.txtPassword, password);
//        click(homePage.btnLogin);
	}

	/**
	 * Gets the error msg.
	 *
	 * @return the error msg
	 */
	public String getErrorMsg() {
		return getText(homePage.lblLoginErrorMsg);
	}
	
	public void ClickText(WebElement ele) {
		click(ele);
	}
	
	public WebElement getElement(String xpath) {
		return ge
		
	}
	
}
