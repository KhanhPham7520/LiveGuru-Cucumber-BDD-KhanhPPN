@tag
Feature: Login to System
  I want to use this template for my feature file

  @valid
  Scenario: Login with valid email and password
  # Pre-condition
    Given I open liveguru application
    
   #Actions : click/sendkey/select/... 
    When Click to My Account page
    And Input to email textbox with ""
    And Input to password textbox with ""
    And Click to Login button
   
		# Verify / expected
		Then Verify error message displayed at email textbox
		And Verify error message displayed at password textbox

