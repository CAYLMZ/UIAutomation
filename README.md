# Insider Automation Test Suite
This README outlines the automated test suite for the Insider website using Cucumber and Selenium. 
The suite tests various functionalities to ensure the website operates as expected. 

## Features Tested


1. Homepage Accessibility: Verifies the Insider homepage loads correctly.
2. Navigation and Career Page Verification: Checks navigation to the "Careers" page through the "Company" menu and validates the presence of specific blocks - Locations, Teams, and Life at Insider.
3. Quality Assurance Jobs Filtering: On the QA careers page, it tests the functionality of viewing all QA jobs, applying filters for location (Istanbul, Turkey) and department (Quality Assurance), and checks for the presence of job listings.
4. Job Listings Verification: Ensures that all listed jobs contain "Quality Assurance" in both the position and department fields and are located in "Istanbul, Turkey".
5. Application Redirection: Tests that clicking on a "View Role" button redirects to the Lever Application form page.


## Running Tests
- Ensure you have Maven installed.
- Run CukesRunner


## Reports
- After running tests, Cucumber Pretty Reports are generated in the target directory. These reports provide a detailed overview of test execution results.



## Note

- The website content is dynamic; results may vary with changes on the site. Always ensure your test environment is up to date with the latest version of the web driver and browser.
- Screenshots of the result and html report have been provided in the reports directory. 


