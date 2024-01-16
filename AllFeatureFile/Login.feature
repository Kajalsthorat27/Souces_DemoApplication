Feature: Swag Labs Login Application

  # kajal repo
  Scenario: Login Functionality
    Given User is on souces Demo Login Page
    When User enter UserName and Password
    Then User click on Login button

  #Santosh
  Scenario: AddCart functionality
    Then user click on add to cart for pack pack and bike light button
    And user click on cart symbol

  #Shailesh
  Scenario: To check functionality of Checkout page
    When User click on Checkout button
    When User Enter All information firstname lastname and zipcode
    Then Click on Continue button
