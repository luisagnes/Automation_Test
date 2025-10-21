@web @search
Feature: Product search
  As a visitor I want to search products to find what I need

  Background:
    Given I am on the home page

  Scenario Outline: Search by keyword
    When I search for "<term>"
    Then I should see results containing "<term>"

    Examples:
      | term    |
      | dress   |
      | shirt   |
