package com.thetestingacademy.base;

import com.thetestingacademy.driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonToAllPage {

    //This is common to all pages

    public CommonToAllPage() {
        // If you want to call something before every Object Class call, put your code here
        // Open file, Open Data Base Connection you can write code here
    }

    //Driver call

    public void implicitWait() {
        //waits
        DriverManagerTL.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    //Common Functions
    public void clickElement(By by) {
        DriverManagerTL.getDriver().findElement(by).click();
    }

    public WebElement presenceOfElement(By by) {
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement visibilityOfElement(By by) {
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void enterInput(By by, String text) {
        DriverManagerTL.getDriver().findElement(by).sendKeys(text);
    }

    public WebElement getElement(By by) {
        return DriverManagerTL.getDriver().findElement(by);
    }

    //Common Assertion Code here



}
