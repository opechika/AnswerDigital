Feature: Drag and element from one place to another

  Scenario: User can drag an element from one location to another
    Given I am on draggable page
    When I dragged and dropped the element from one location to another
    Then I can drag draggable element to droppable element