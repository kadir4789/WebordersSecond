package com.weborders.tests;

import com.weborders.common.Driver;
import com.weborders.common.TestBase;
import com.weborders.pages.DashboardPage;
import com.weborders.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test

    public void verifyUserCanLoginWithCorrectCredentials(){

        LoginPage loginPage = new LoginPage();
        loginPage.login("Tester","test");
        new DashboardPage().waitForPageToLoad();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl()
                ,"http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
    }

    @Test

    public void verifyUserWithIncorrectPasswordIsShownErrorMessage(){

        LoginPage loginPage = new LoginPage();
        loginPage.login("Tester","dsggdsdgs");
        String errorMessageText = loginPage.getErrorMessageText();
        Assert.assertEquals(errorMessageText,"Invalid Login or Password.");
    }
}
