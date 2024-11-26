package com.thetestingacademy.PageObjectModel;

import com.thetestingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;

public class DashboardPage_POM extends CommonToAllPage {

    public DashboardPage_POM() {
    }

    private final By userNameOnDashboard = By.cssSelector("[data-qa='lufexuloga']");

    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }


}
