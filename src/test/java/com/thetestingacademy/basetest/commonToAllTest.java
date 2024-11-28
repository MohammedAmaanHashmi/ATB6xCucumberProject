package com.thetestingacademy.basetest;

import com.thetestingacademy.driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class commonToAllTest {

    //To call the Start the WebDriver
    //Down the WebDriver


    //Who will start the Webdriver?
    @BeforeMethod
    protected void setUp() {
        DriverManagerTL.init();
    }

    //Who will close the Webdriver
    @AfterMethod
    protected void tearDown() {
        DriverManagerTL.down();
    }

}
