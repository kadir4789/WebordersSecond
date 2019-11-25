package com.weborders.tests;

import com.weborders.common.Driver;
import com.weborders.common.TestBase;
import com.weborders.pages.DashboardPage;
import com.weborders.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DashBoardTests extends TestBase {
    @Test

    public void verifyUsersNameOnDashboardMatches(){
        //LoginPage loginPage = new LoginPage();
        //loginPage.login("Tester","test");
        new LoginPage().login("Tester","test");


        //DashboardPage dashboardPage = new DashboardPage();
        //String usersNameOnDashboard = dashboardPage.getUsersNameFromDashboard();
        String usersNameOnDashboard = new DashboardPage().getUsersNameFromDashboard();
        Assert.assertTrue(usersNameOnDashboard.contains("Tester"));


    }
    @Test
    public void verifyUserCanLogout() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Thread.sleep(2000);
        Driver.getDriver().manage().window().maximize();
        Thread.sleep(2000);

        loginPage.login("Tester","test");
        Thread.sleep(2000);
        //new LoginPage().login("Tester","test");

        new DashboardPage().logout();

        boolean isLoginButtonDisplayed = loginPage.isLoginButtonDisplayed();
        Assert.assertTrue(isLoginButtonDisplayed);

    }
}
