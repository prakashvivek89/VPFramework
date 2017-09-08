@login
Feature: login functionality

	Background:
	Given User is on SSP adviser portal 
	
  Scenario Outline: Login with a valid user
    When User logs in with valid "<username>" and "<password>"
    Then User should be able to login 
    And Login text should be displayed 
    
    Examples:
    |username|password|
    |vivek|Testing@11|
