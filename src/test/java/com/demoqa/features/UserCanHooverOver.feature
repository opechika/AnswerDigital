Feature: Hoover Over Elements


  @ignore
  Scenario: User can hoover over button and field
    Given I am on tool tip page
    When I hoover over tooltip button
    Then the button tooltip is displayed

  @ignore
  Scenario: User can hoover over button and field
    Given I am on tool tip page
    When I hoover over tooltip field
    Then the field tooltip is displayed