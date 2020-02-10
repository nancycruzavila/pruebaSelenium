#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Page
  As a user I should be able to login to the page.
  so I can buy the product

  @tag1
  Scenario: The user should be able to log in
    Given The user enter to login page
    When The user enter username as "test800@hotmail.com"
    And The user enter password as "test123"
    And The user click on sign in button
    Then the user should be logged correctly

