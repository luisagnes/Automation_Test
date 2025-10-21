@web @login
Feature: Login
  As a user I want to login so that I can access my account

  Background:
    Given I am on the home page

  Scenario: Valid login with default credentials
    When I navigate to the login page
    And I login with default credentials
    Then I should see I am logged in
