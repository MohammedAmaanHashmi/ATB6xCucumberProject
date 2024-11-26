package com.thetestingacademy.basetest;

import com.thetestingacademy.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

public class BaseTest {

    //To call the Start the WebDriver
    //Down the WebDriver

    @BeforeMethod
    protected void setUp() {
        DriverManager.init();
    }

    @AfterMethod
    protected void tearDown() {
        DriverManager.down();
    }

}
