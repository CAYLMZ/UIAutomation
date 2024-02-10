package com.pages;

import org.openqa.selenium.By;

public class CareersPage {

    public static By lifeAtInsiderSection = By.xpath("//section[.//h2[text()='Life at Insider']]");
    public static By ourLocationsSection = By.xpath("//h3[contains(text(), 'Find your calling')]/ancestor::section");
    public static By teamsSection = By.xpath("//h3[contains(text(), 'Find your calling')]/ancestor::section");

}
