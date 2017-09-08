package com.VP.Framework.Adviser.StepsDefination;

import org.testng.Assert;

import com.VP.Framework.Adviser.PageObjects.Clients;
import com.VP.Framework.Adviser.PageObjects.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ClientSteps {

	private HomePage homePage;
	private Clients clients;
	private Clients.Details clientsDetails;
	private Clients.Employment clientsEmployment;
	
	public ClientSteps(HomePage homePage, Clients clients, Clients.Details clientsDetails, Clients.Employment clientsEmployment) {
		this.homePage = homePage;
		this.clients = clients;
		this.clientsDetails = clientsDetails;
		this.clientsEmployment = clientsEmployment;
	}
	
	@When("^User is on \"(.*)\" creation page$")
	public void user_is_on_personal_client_creation_page(String clientType){
		homePage.clickRadioButtonClient(clientType);
		homePage.clickButtonAddNewClientt();
		Assert.assertTrue(clients.getClientHeaderName().equalsIgnoreCase("New "+clientType));
	}
	
	@And("^User creates the personal client with mandatory valid details$")
	public void user_creates_personal_client_with_mandatory_valid_details() {
		clientsDetails.clickClientDetailsTabAndVerify();
		clientsDetails.enterClientTitle();
		clientsDetails.enterClientFirstName();
		clientsDetails.enterClientLastName();
		clientsDetails.clickSaveSummaryButton();
		clientsEmployment.clickEmploymentTab();
		clientsEmployment.clickEmployment_Occupation_Search();
		Assert.assertTrue(clientsEmployment.findOccupationPopUpIsDisplayed());
		clientsEmployment.selectOccupation();
		clientsEmployment.clickSaveEmploymentButton();
	}
	
	@When("^user clicks on link \"(.*)\" at header$")
	public void user_clicks_link_At_Header(String link){
		clients.clickLinkAtHeader(link);
	}
}