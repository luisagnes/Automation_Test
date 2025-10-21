@api
Feature: Trello public action
  As a QA I want to validate a public Trello action endpoint

  Scenario: Validate status and print list name
    When I GET the Trello action by id
    Then the response status should be 200
    And I print the list name from the payload
