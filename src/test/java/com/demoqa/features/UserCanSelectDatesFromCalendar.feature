Feature: Date Picker

  Scenario: User can use calendar to pick a given dates
    Given I am on date picker page
    When I click on date field
    And I select a date that is a month away from today
    Then the correct date selected above is displayed