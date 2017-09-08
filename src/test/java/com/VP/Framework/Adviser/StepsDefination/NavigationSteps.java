package com.VP.Framework.Adviser.StepsDefination;

import com.VP.Framework.Adviser.Helper.PropReader;	
import com.VP.Framework.Adviser.SeleniumReusables.ReusableFunctions;
import cucumber.api.java.en.Given;

public class NavigationSteps extends ReusableFunctions {

	public String baseURL = PropReader.readWebdriverConfig("site.url");

	@Given("^User is on SSP adviser portal$")
	public void user_is_on_SSP_adviser_portal() {
		wDriver.navigate().to(baseURL);
		wDriver.manage().window().maximize();
	}
	
}
