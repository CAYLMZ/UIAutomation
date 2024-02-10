package com.stepDefinitions;

import com.pages.OpenPositionsPage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckAllJobsContentSteps {

    WebDriver driver = Driver.getDriver();

    @Then("verifies that all jobs Position, Department contains Quality Assurance and Location contains Istanbul Turkey")
    public void verifiesThatAllJobsPositionDepartmentContainsQualityAssuranceAndLocationContainsIstanbulTurkey() {
        WebElement jobsListContainer = driver.findElement(OpenPositionsPage.jobsListContainer);
        BrowserUtils.verifyElementDisplayed(jobsListContainer);
        List<WebElement> jobListings = jobsListContainer.findElements(OpenPositionsPage.jobListings);

        for (WebElement job : jobListings) {
            String positionTitle = job.findElement(OpenPositionsPage.jobPositionTitle).getText();
            String department = job.findElement(OpenPositionsPage.jobDepartment).getText();
            String location = job.findElement(OpenPositionsPage.jobLocation).getText();

            Assertions.assertTrue(positionTitle.contains("Quality Assurance"), "Position does not contain 'Quality Assurance'");
            Assertions.assertTrue(department.contains("Quality Assurance"), "Department does not contain 'Quality Assurance'");
            Assertions.assertTrue(location.contains("Istanbul, Turkey"), "Location does not contain 'Istanbul, Turkey'");
        }
    }
}
