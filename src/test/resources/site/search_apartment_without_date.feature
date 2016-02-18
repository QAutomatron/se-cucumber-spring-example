Feature: User can search for an apartment without specific check-in and check-out date

  Scenario: Search apartment without dates
    Given user is on the main page
    And location is set to "London, United Kingdom"
    And check-in date is ""
    And check-out date is ""
    When user press the Search button
    Then user should be on the result page
    And form header should be "London, United Kingdom"
    And on result form check-in date is ""
    And on result form check-out date is ""