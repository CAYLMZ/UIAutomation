package com.pages;

import org.openqa.selenium.By;

public class OpenPositionsPage {

    public static By filterByLocationDropdownArrow = By.xpath("(//span[@class='select2-selection__arrow'])[1]");
    public static By istanbulOption = By.xpath("//li[.='Istanbul, Turkey']");
    public static By jobsListContainer = By.cssSelector("section#career-position-list .position-list");
    public static By jobListings = By.cssSelector(".position-list-item");
    public static By jobPositionTitle = By.xpath(".//p[contains(@class,'position-title')]");
    public static By jobDepartment = By.xpath(".//span[contains(@class,'position-department')]");
    public static By jobLocation = By.xpath(".//div[contains(@class,'position-location')]");
    public static By viewRoleButton = By.xpath("//a[.='View Role']");
}
