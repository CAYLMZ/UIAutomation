package com.stepDefinitions;

import com.pages.LeverAppFormPage;
import com.pages.OpenPositionsPage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RedirectionToLeverAppFormSteps {

    WebDriver driver = Driver.getDriver();

    @When("the user clicks on the View Role button")
    public void theUserClicksOnTheViewRoleButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");

        BrowserUtils.waitForClickablility(OpenPositionsPage.viewRoleButton, Duration.ofSeconds(5));
        driver.findElement(OpenPositionsPage.viewRoleButton).click();
    }

    @Then("the user should be redirected to the Lever Application form page")
    public void theUserShouldBeRedirectedToTheLeverApplicationFormPage() {

        String originalWindowHandle = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindowHandle.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        BrowserUtils.verifyURLContains("https://jobs.lever.co/useinsider/");
        BrowserUtils.verifyElementDisplayed(LeverAppFormPage.applyForThisJobButton);
    }
}
