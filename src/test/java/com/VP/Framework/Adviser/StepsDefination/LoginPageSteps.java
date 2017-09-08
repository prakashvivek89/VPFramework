package com.VP.Framework.Adviser.StepsDefination;

import java.util.List;
import com.VP.Framework.Adviser.PageObjects.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginPage;
	
	public LoginPageSteps(LoginPage loginPage) {
		this.loginPage = loginPage;
	}

	@When("^User logs in with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void use_logs_in_with_valid_credentials(String username, String password) {
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
	}
	
	@When("^Use logs in with valid credentials$")
	public void use_logs_in_with_valid_credentials_background(DataTable usercredentials) {
		List<List<String>> data = usercredentials.raw();
		loginPage.enterUserName(data.get(0).get(0));
		loginPage.enterPassword(data.get(0).get(1));
		loginPage.clickLogin();
	}
}
