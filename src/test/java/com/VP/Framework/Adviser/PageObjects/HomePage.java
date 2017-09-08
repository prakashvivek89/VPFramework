package com.VP.Framework.Adviser.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.VP.Framework.Adviser.SeleniumReusables.ReusableFunctions;

public class HomePage extends ReusableFunctions{

	WebDriver driver;
	
	@FindBy(css = "div[class*='headerTextLoggedIn']")
	WebElement headerTextLoggedIn;
	
	@FindBy(css = "div[class*='headerTextUsername']")
	WebElement headerTextUsername;
	
	@FindBy (css = ".headerText.headerTextLogout>a")
	WebElement linkLogout;
	
	@FindBy (id ="Type_Personal")
	WebElement rdoBtnPersonalClient;
	
	@FindBy(id="Type_Corporate")
	WebElement rdoBtnCorporateClient;

	@FindBy (id="addNewClient")
	WebElement btnAddNewClient;
	
	public HomePage() { 	
		driver = wDriver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHeaderTextLoggedIn() {
		return waitForExpected(headerTextLoggedIn).getText().trim();
	}
	
	public String getHeaderTextUsername() {
		return waitForExpected(headerTextUsername).getText().trim();
	}
	
	public boolean linkLogoutIsDisplayed() {
		return isElementPresent(linkLogout);
	}
	
	public void clickRadioButtonClient(String clientType) {
		if(clientType.equalsIgnoreCase("Personal Client")) {
			elementToBeClickable(rdoBtnPersonalClient).click();
		}
		else if(clientType.equalsIgnoreCase("Corporate Client")) {
			elementToBeClickable(rdoBtnCorporateClient).click();
		}
	}
	
	public void clickButtonAddNewClientt() {
		elementToBeClickable(btnAddNewClient).click();
	}
}
