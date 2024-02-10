@smoke
Feature: Verify navigation to the Careers page and its sections

  Scenario: Navigating to the Careers page and verifying its sections
    Given The user navigates to the Insider website
    When The user clicks the Company menu link
    When The user clicks the Careers
    Then The user should be on the Careers page
    And The user verifies the Locations, Teams, and Life at Insider sections are visible
