package com.weborders.pages;

import com.weborders.common.Driver;
import com.weborders.common.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    private String pageUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    private By userNameLocator = By.id("ctl00_MainContent_username");
    private By passwordLocator = By.id("ctl00_MainContent_password");
    private By loginButtonLocator = By.id("ctl00_MainContent_login_button");
    private By statusTextLocator = By.xpath("//span[@id='ctl00_MainContent_status']");



    public void goToPage(){
        Driver.getDriver().get(pageUrl);
    }

    public void enterUserName(String userName){
        //Driver.getDriver().findElement(userNameLocator).sendKeys(userName);
        seleniumUtil.sendKeys(userNameLocator, userName);
    }

    public void enterPassword(String password){
        //Driver.getDriver().findElement(passwordLocator).sendKeys(password);
        seleniumUtil.sendKeys(passwordLocator, password);
    }
    public void clickLoginButton(){
        //Driver.getDriver().findElement(loginButtonLocator).click();
        seleniumUtil.click(loginButtonLocator);
    }
    public String getErrorMessageText(){
        //return Driver.getDriver().findElement(statusTextLocator).getText();
        return seleniumUtil.getText(statusTextLocator);
    }
    public void login(String userName, String password){
        goToPage();
        enterUserName(userName);
        enterPassword(password);
        clickLoginButton();
    }

    public boolean isLoginButtonDisplayed(){
        //return Driver.getDriver().findElement(loginButtonLocator).isDisplayed();
        return seleniumUtil.isDisplayed(loginButtonLocator);
    }

    @Override
    public void waitForPageToLoad() {

    }
}
