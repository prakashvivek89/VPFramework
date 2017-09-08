package com.VP.Framework.Adviser.StepsDefination;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.VP.Framework.Adviser.SeleniumReusables.ReusableFunctions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends ReusableFunctions {

	@Before
	public void beforeScenario() {
		try {
			Runtime.getRuntime().exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
			Thread.sleep(5000);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wDriver.navigate().refresh();
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) wDriver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
	}
}
