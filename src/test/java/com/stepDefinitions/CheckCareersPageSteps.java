package com.stepDefinitions;

import com.pages.CareersPage;
import com.pages.HomePage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CheckCareersPageSteps {
    WebDriver driver = Driver.getDriver();

    @When("The user clicks the Company menu link")
    public void theUserClicksTheCompanyMenuLink() {
        driver.findElement(HomePage.companyMenuLink).click();
    }

    @When("The user clicks the Careers")
    public void theUserClicksTheCareers() {
        driver.findElement(HomePage.careersLink).click();
    }

    @Then("The user should be on the Careers page")
    public void theUserShouldBeOnTheCareersPage() {
        String title = driver.getTitle();
        BrowserUtils.verifyTitle("Ready to disrupt? | Insider Careers");
    }

    @And("The user verifies the Locations, Teams, and Life at Insider sections are visible")
    public void theUserVerifiesTheLocationsTeamsAndLifeAtInsiderSectionsAreVisible() {

        BrowserUtils.verifyElementDisplayed(CareersPage.teamsSection);
        BrowserUtils.verifyElementDisplayed(CareersPage.ourLocationsSection);
        BrowserUtils.verifyElementDisplayed(CareersPage.lifeAtInsiderSection);
    }
}
