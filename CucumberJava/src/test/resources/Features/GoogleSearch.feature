Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on search page
    When user enters a text in search box
    And clicks enter
    Then use is navigated to search results
