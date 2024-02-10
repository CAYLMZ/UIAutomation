@smoke
Feature: Check all jobs contents

  Scenario: User checks job listings if they contains Quality Assurance and Istanbul, Turkey
    Given the user navigates to QA careers page
    When the user clicks on See all QA jobs
    Then verifies open positions page is displayed
    And the user selects Istanbul Turkey as the location
    Then the user should see a list of jobs matching the selected filters
    Then verifies that all jobs Position, Department contains Quality Assurance and Location contains Istanbul Turkey
