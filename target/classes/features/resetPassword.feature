@smoke
Feature: User could reset  password

  Scenario: SC3- User could reset  password successfully
    And user clicked on forgot password
    And user entered email for reset password
    And user clicked on recover button
    Then user should have a success message for recover