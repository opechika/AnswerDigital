Feature:Student Registration Form
  As a Student
  I want the ability to enter my details into the registration form
  So that I can submit it

  Scenario Outline: Student can successfully submit Registration Form
    Given I am on Practice Form page
    When I enter my "<FirstName>" into  first name field
    And I enter my "<LastName>" into  last name field
    And I enter my "<Email>" into email field
    And I click on "<Gender>" as my gender
    And I enter my "<MobileNumber>" into Mobile Number field
    And I enter my "<DateOfBirth>" into Date of Birth field
    And I click on "<Hobbies>" as my hobbies
    And I "<Optional>" upload picture
    And I enter my "<Address>" into current address field
    And I submit the form with the details above
    Then the details entered above are confirmed in a popup

    Examples: Form Data
      | FirstName     | LastName     | Email     | Gender | MobileNumber     | DateOfBirth | Hobbies | Optional | Address     |
      | fakeFirstName | fakeLastName | fakeEmail | Male   | fakeMobileNumber |             |         |          |             |
      | fakeFirstName | fakeLastName | fakeEmail | Other  | fakeMobileNumber | 4 May 1979  | Sports  | False    | fakeAddress |
      | fakeFirstName | fakeLastName | fakeEmail | Female | fakeMobileNumber | 2 May 1979  | Sports  | True     | fakeAddress |



