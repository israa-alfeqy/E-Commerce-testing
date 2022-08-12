Feature: Login
  #test scenario 1
  Scenario: login with valid email and password
    Given go to login page
    When login with "test17977@example.com" and "P@ssw0rd"
    And press on login button
    Then login to the system successfully

  #test scenario 2
  Scenario: login with invalid email and password
    Given go to login page
    When login with "wrong@example.com" and "P@ssw0rd"
    And press on login button
    Then user could not login to the system