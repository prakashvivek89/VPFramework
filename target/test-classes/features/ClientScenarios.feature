@client
Feature: Client functionality 

Background: 
	Given User is on SSP adviser portal 
	When Use logs in with valid credentials
    |sutapa|Testing@11| 
	
Scenario: Client Creation - Personal Client 
	When User is on "Personal Client" creation page 
	#   And User creates the personal client with mandatory valid details
	#   Then Newly created client is displayed in client section 
	
#Scenario: Client Creation - Corporate Client 
#	When User is on "Corporate client" creation page 
#	
#Scenario: Edit Client 
#	When user clicks on link "Clients" at header