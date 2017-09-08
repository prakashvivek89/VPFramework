package com.VP.Framework.Adviser.SeleniumReusables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.VP.Framework.Adviser.Helper.WebdriverHelper;

public class ReusableFunctions {

	final int TIMEOUT = 10;
	public WebDriver wDriver;
	public WebDriverWait wait;
	public JavascriptExecutor js;

	public ReusableFunctions() {
		wDriver = WebdriverHelper.getWebDriver();
		wait = new WebDriverWait(wDriver, TIMEOUT);
		js = (JavascriptExecutor) wDriver;
	}

	public WebElement elementToBeClickable(WebElement ele) {
		return wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public WebElement elementToBeClickable(By by) {
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void invisibilityOfElement(WebElement ele) {
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}

	public WebElement waitForExpected(WebElement ele) {
		return wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public boolean isElementPresent(WebElement ele) {
		return wait.until(ExpectedConditions.visibilityOf(ele)).isDisplayed();
	}
	
	public void executeJavaScript(String Script, WebElement ele) {
		js.executeScript(Script, ele);
	}

	public void highLightElement(WebElement ele) {
		for (int i = 0; i < 1; i++) {
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", ele,
					"color: black; border: 3px solid red;");
		}
	}

}
