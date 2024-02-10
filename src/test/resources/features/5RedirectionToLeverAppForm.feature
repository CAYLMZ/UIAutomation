@smoke
Feature: Redirection to the Lever Application form

  Scenario: User clicks on View Role button and verifies that related form is opened
    Given the user navigates to QA careers page
    When the user clicks on See all QA jobs
    Then verifies open positions page is displayed
    And the user selects Istanbul Turkey as the location
    Then the user should see a list of jobs matching the selected filters
    When the user clicks on the View Role button
    Then the user should be redirected to the Lever Application form page
