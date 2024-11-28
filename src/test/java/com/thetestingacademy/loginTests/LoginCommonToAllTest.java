package com.thetestingacademy.loginTests;

import com.thetestingacademy.PageObjectModel.DashboardPage_POM;
import com.thetestingacademy.PageObjectModel.LoginPage_POM;
import com.thetestingacademy.basetest.commonToAllTest;
import com.thetestingacademy.utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginCommonToAllTest extends commonToAllTest {


    @Test
    public void testLoginPositive() throws Exception {

        //How to enter the user, pass and go to the Dashboard and verify
        LoginPage_POM pagePom = new LoginPage_POM();
        pagePom.openURl(PropertyReader.readKey("url"));
        DashboardPage_POM dashboardPagePom = pagePom.loginToVwoPositive().afterLogin();
        String expected_username = dashboardPagePom.loggedInUserName();
        Assertions.assertThat(expected_username)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("expected_username"));
    }

}
