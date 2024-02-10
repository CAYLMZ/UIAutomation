package com.stepDefinitions;

import com.pages.OpenPositionsPage;
import com.pages.QualityAssurancePage;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterQaJobsSteps {

    WebDriver driver = Driver.getDriver();

    @Given("the user navigates to QA careers page")
    public void theUserNavigatesToQACareersPage() {
        driver.get(ConfigurationReader.getProperty("urlQaJobs"));
    }

    @When("the user clicks on See all QA jobs")
    public void theUserClicksOnSeeAllQAJobs() {
        driver.findElement(QualityAssurancePage.seeAllQaJobsButton).click();
    }

    @Then("verifies open positions page is displayed")
    public void verifiesOpenPositionsPageIsDisplayed() {
        String title = driver.getTitle();
        Assertions.assertEquals("Insider Open Positions | Insider", title);
    }

    @And("the user selects Istanbul Turkey as the location")
    public void theUserSelectsIstanbulTurkeyAsTheLocation() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250);");

        BrowserUtils.waitFor(10); // Assuming this is a custom wait utility
        driver.findElement(OpenPositionsPage.filterByLocationDropdownArrow).click();
        driver.findElement(OpenPositionsPage.istanbulOption).click();
    }

    @Then("the user should see a list of jobs matching the selected filters")
    public void theUserShouldSeeAListOfJobsMatchingTheSelectedFilters() {
        WebElement jobsListContainer = driver.findElement(OpenPositionsPage.jobsListContainer);
        BrowserUtils.verifyElementDisplayed(jobsListContainer);

        List<WebElement> jobListings = jobsListContainer.findElements(OpenPositionsPage.jobListings);

        Assertions.assertTrue(jobListings.size() > 0, "No job listings found");
    }
}
