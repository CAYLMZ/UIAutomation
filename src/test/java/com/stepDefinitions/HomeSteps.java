package com.stepDefinitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    WebDriver driver = Driver.getDriver();

    @Given("The user navigates to the Insider website")
    public void theUserNavigatesToTheInsiderWebsite() {
        driver.get(ConfigurationReader.getProperty("urlHome"));
    }

    @Then("The Insider home page should be displayed")
    public void theInsiderHomePageShouldBeDisplayed() {
        String title = driver.getTitle();
        BrowserUtils.verifyTitle("#1 Leader in Individualized, Cross-Channel CX — Insider");
    }
}
