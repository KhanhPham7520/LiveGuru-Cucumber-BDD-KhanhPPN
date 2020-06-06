@editAccountInformation
Feature: Edit information of account
	As a professional product test,
	I would like to update information account
	so that I can verify account information functionality works well

  Scenario: Edit account information
    Given I open application
    When I click to Login link
		And I input to Email Address textbox with "phamphannhatkhanh7520@gmail.com"
		And I input to Password textbox with "foster1994"
		And I click to Login button
		Then verify "My Dashboard" is displayed
		And verify "My Account" is displayed
		When I click to Account Information link
		And 
		


