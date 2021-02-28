@regression
Feature: Ebay Cart Functionality

 Scenario: Add product to cart 
   Given Open Ebay Website
   When Search for shirts
   And  Select first shirt product on item list
   And  Select colour on shirts 
   And  Select size on shirts 
   And  Go to cart
   Then Validate item is in cart
   
   
 