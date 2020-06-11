@Login
Feature: Login to LiveGuru Website
  As a Professional Product Test
  I would like to login 
  so that I can verify login functionality work well

  Scenario: Login to system with registered username and registered password
    Given Open LiveGuru Application
    When Click to My Account
  	And Input to username with registered email
  	And Input to password with registered password
  	And Click Login button
    Then Verify My Dashboard is displayed
