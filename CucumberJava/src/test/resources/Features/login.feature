@Smoketest
Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters useername and password
    And clicks on login button
    Then user is navigated to home page
