@regression
Feature: Ebay Search Functionality
 
  Scenario: Search for Shirts
    Given Open Ebay Website
    When search for shirts
    Then Item list should have only shirt related products
    
    Scenario Outline: Search for items with Brand
    Given Open Ebay Website
    When Search for "<Items>"
    Then Filter by "<Brand>"
    Then Item list should have product of "<Brand>"
    
    Examples:
    |Items |Brand    |
    |Shirts|Adidas   |
    |Pants |Nike     |
    |Shoes |Unbranded|
   