@Login
Feature: Login to LiveGuru Website
	As a Professional Product Test
	I would like to login 
	so that I can verify login functionality work well
	
	
  Scenario: Register new user and login to system
    Given I open application
    When I click to Register Link
    And I input to First Name textbox with "Nhat Khanh"
    And I input to Middle Name / Initial textbox with "Pham Phan"
    And I input to Last Name textbox with "David"
    And I input to Email Address textbox with "phamphannhatkhanh7520@gmail.com"
    And I input to Password textbox with "foster1994"
    And I input to Confirm Password textbox with "foster1994"
    And I click to Register button
    Then I verify Home page displayed message "Thank you for registering with Main Website Store."
    
    
   

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
