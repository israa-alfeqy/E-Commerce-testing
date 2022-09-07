@smoke
Feature: Wishlist | user could add different products to Wishlist


  Scenario: adding a product to wishlist displays a success message
    When user clicks add to  wishlist button
    Then a success message is displayed at the top of the page


  Scenario: adding a product to wishlist increases quantity value on wishlist page
    When user clicks add to  wishlist button
    And user goes on Wishlist page
    Then the quantity value is bigger than 0