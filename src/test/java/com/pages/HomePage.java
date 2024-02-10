package com.pages;

import org.openqa.selenium.By;

public class HomePage {

    public static By companyMenuLink = By.xpath("//a[@id='navbarDropdownMenuLink' and contains(text(), 'Company')]");
    public static By careersLink = By.xpath("//a[@href='https://useinsider.com/careers/' and @class='dropdown-sub']");

}
