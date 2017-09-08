package com.VP.Framework.Adviser.StepsDefination;

import org.testng.Assert;

import com.VP.Framework.Adviser.PageObjects.HomePage;

import cucumber.api.java.en.Then;

public class HomePageSteps {

	private HomePage homePage;
	
	public HomePageSteps(HomePage homePage) {
		this.homePage = homePage;
	}
	
	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	    Assert.assertTrue(homePage.linkLogoutIsDisplayed());
	}

	@Then("^Login text should be displayed$")
	public void login_text_should_be_displayed(){
		Assert.assertEquals(homePage.getHeaderTextLoggedIn(), "You are logged in as");
		Assert.assertEquals(homePage.getHeaderTextUsername(), "Vivek");
	}
}
