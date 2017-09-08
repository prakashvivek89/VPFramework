package com.VP.Framework.Adviser.PageObjects;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.VP.Framework.Adviser.SeleniumReusables.ReusableFunctions;

public class Clients extends ReusableFunctions {

	static WebDriver driver;

	private By linkHeader;

	@FindBy(className = "clientHeaderName")
	private WebElement clientHeaderName;
	
	@FindBy(id="loadingspinner")
	WebElement loadingSpinner;

	public Clients() {
		Clients.driver = wDriver;
		PageFactory.initElements(driver, this);
	}

	public String getClientHeaderName() {
		return waitForExpected(clientHeaderName).getText().trim();
	}

	public void clickLinkAtHeader(String link) {
		linkHeader = By.xpath("//a[@class='headerMenuOff'][text()='" + link + "']");
		elementToBeClickable(linkHeader).click();
	}
	
	public void waitForSpinnerToDisappear() {
		invisibilityOfElement(loadingSpinner);
	}

	// -------------**Personal Client Detail Section**-------------**//

	public static class Details extends ReusableFunctions {
		@FindBy(css = "a[href='#clientSummaryTab']")
		WebElement clientDetailsTab;
		@FindBy(css = "#Client_PersonalDetails_Title")
		WebElement clientTitle;
		@FindBy(id = "Client_PersonalDetails_FirstNames")
		WebElement clientFirstName;
		@FindBy(id = "Client_PersonalDetails_LastName")
		WebElement clientLastName;
		@FindBy(id = "saveSummaryButton")
		WebElement saveSummaryButton;

		public Details() {
			PageFactory.initElements(Clients.driver, this);
		}

		public void clickClientDetailsTabAndVerify() {
			elementToBeClickable(clientDetailsTab).click();
		}

		public void enterClientTitle() {
			waitForExpected(clientTitle).clear();
			waitForExpected(clientTitle).sendKeys("Mr");
		}

		public void enterClientFirstName() {
			waitForExpected(clientFirstName).clear();
			waitForExpected(clientFirstName).sendKeys(RandomStringUtils.randomAlphabetic(5));
		}

		public void enterClientLastName() {
			waitForExpected(clientLastName).clear();
			waitForExpected(clientLastName).sendKeys(RandomStringUtils.randomAlphabetic(5));
		}

		public void clickSaveSummaryButton() {
			elementToBeClickable(saveSummaryButton).click();
		}
	}

	 //-------------**Personal Client Employment Section**-------------**//

	public static class Employment extends ReusableFunctions {
		@FindBy(css = "a[href='#employmentTab']")
		WebElement employmentTab;
		@FindBy(id = "Client_Employment_Occupation_Search")
		WebElement btnEmployment_Occupation_Search;
		@FindBy(xpath = "//h4[text()='Find occupation']/../../..")
		WebElement findOccupationPopUp;
		@FindBy(className = "menu-link")
		WebElement selectOccupation;
		@FindBy(id = "saveEmploymentButton")
		WebElement saveEmploymentButton;
		Clients c = new Clients();
		public Employment() {
			PageFactory.initElements(Clients.driver, this);
		}

		public void clickEmploymentTab() {
			c.waitForSpinnerToDisappear();
			elementToBeClickable(employmentTab).click();
		}

		public void clickEmployment_Occupation_Search() {
			elementToBeClickable(btnEmployment_Occupation_Search).click();
		}

		public boolean findOccupationPopUpIsDisplayed() {
			return isElementPresent(findOccupationPopUp);
		}

		public void selectOccupation() {
			elementToBeClickable(selectOccupation).click();
		}

		public void clickSaveEmploymentButton() {
			elementToBeClickable(saveEmploymentButton).click();
		}
	}
}

