@login
Feature: Buy a New Product
  As a user I should be able to login to the page and buy some product

  @tag1
  Scenario: The user should be able to login and buy a product
    Given The user enter to login page of buy
    When The user of buy enter username as "test800@hotmail.com"
    And The user of buys enter password as "test123"
    And The user click on sign in button in the buys page
    And The user goes to women items
    And Select a dress from the list
    And Click on the add to cart button
    Then Do the checkout of the items
    And The user enters the information of address
    And The accept terms and conditions
    And The user complete the order
    And The user confirm the order
    And The user accept the check payment
    Then The user logout

