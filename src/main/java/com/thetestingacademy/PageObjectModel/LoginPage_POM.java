package com.thetestingacademy.PageObjectModel;

import com.thetestingacademy.base.CommonToAllPage;
import com.thetestingacademy.driver.DriverManagerTL;
import com.thetestingacademy.utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage_POM extends CommonToAllPage {

    public LoginPage_POM() {

        super();
    }

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    public LoginPage_POM loginToVwoPositive() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signButton);
        //DriverManager.getDriver().findElement(Password).click();
        //Pass the control the DashboardPage
        return this;
    }

    public void openURl(String url) {
        DriverManagerTL.getDriver().get(url);
    }

    public String loginToVwoNegative() throws Exception {
        enterInput(username, "admin");
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signButton);
        //error String
        visibilityOfElement(error_message);
       return getElement(error_message).getText();
    }

    public DashboardPage_POM afterLogin() {
        return new DashboardPage_POM();
    }


}
