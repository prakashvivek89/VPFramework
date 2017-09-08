package com.VP.Framework.Adviser.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.VP.Framework.Adviser.SeleniumReusables.ReusableFunctions;

public class LoginPage extends ReusableFunctions{
    
	WebDriver driver;
	
	@FindBy(css="div[class*='headerTextCaption']")
	WebElement headerTitle;
	@FindBy(id = "LoginDetailModel_UserName")
	WebElement textBoxUserName;
	@FindBy(id = "LoginDetailModel_Password")
	WebElement textBoxPassword;
	@FindBy(id = "loginButton")
	WebElement buttonLogIn;
	
	public LoginPage() { 	
		driver = wDriver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean headerTitleIsDisplayed() {
		return isElementPresent(headerTitle);
	}
	
	public void enterUserName(String username) {
		waitForExpected(textBoxUserName).clear();
		waitForExpected(textBoxUserName).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		waitForExpected(textBoxPassword).clear();
		waitForExpected(textBoxPassword).sendKeys(password);
	}
	
	public void clickLogin() {
		elementToBeClickable(buttonLogIn).click();
	}
	
}
