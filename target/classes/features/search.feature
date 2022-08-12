@smoke
Feature:users will be able to search for products with different parameters

 #  scenario outline 1:
  Scenario Outline:  search using product name
    Given navigates to search page
    When  enters <productName>
    And  click search button
    Then search results contains <productName>
    Examples:
      | productName  |
      | adidas        |
      | macbook       |
      | camera         |

#  scenario outline 2:
  Scenario Outline:  search using product SKU
    Given navigates to search page
    When types product <sku>
    And click search button
    And click a result from search results
    Then search results <sku> match search criteria
    Examples:
      | sku       |
      | SM_900_PU |
      | APPLE_CAM |
      | SF_PRO_11 |
