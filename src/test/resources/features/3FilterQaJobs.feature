@smoke
Feature: Filter and verify QA job listings on Insider Careers

  Scenario: User filters QA jobs by location and department on the Insider Careers page
    Given the user navigates to QA careers page
    When the user clicks on See all QA jobs
    Then verifies open positions page is displayed
    And the user selects Istanbul Turkey as the location
    Then the user should see a list of jobs matching the selected filters
