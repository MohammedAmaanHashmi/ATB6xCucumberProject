package com.thetestingacademy.base;

import com.thetestingacademy.driver.DriverManager;
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
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    //Common Functions
    public void clickElement(By by) {
        DriverManager.getDriver().findElement(by).click();
    }

    public WebElement presenceOfElement(By by) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement visibilityOfElement(By by) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void enterInput(By by, String text) {
        DriverManager.getDriver().findElement(by).sendKeys(text);
    }

    public WebElement getElement(By by) {
        return DriverManager.getDriver().findElement(by);
    }

    //Common Assertion Code here



}
