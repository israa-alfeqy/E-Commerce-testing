@smoke
Feature:User can register with valid data

  Scenario: User register with valid username and password
    Given go to registration page
    When select gender type
    And enter first name "tester" and last name "tester"
    And enter date of birth
    And enter email "test@example.com" field
    And fill Password fields "P@ssw0rd" "P@ssw0rd"
    And click on register button
    Then success message is displayed
