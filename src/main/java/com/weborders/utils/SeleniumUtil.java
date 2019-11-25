package com.weborders.utils;

import com.weborders.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumUtil {

    public WebElement findElement(By locator){
        return Driver.getDriver().findElement(locator);
    }
    public void sendKeys(By locator, String text){
        findElement(locator).sendKeys(text);
    }
    public void click(By locator){
        findElement(locator).click();
    }
    public String getText(By locator) {
        return findElement(locator).getText();
    }
    public boolean isDisplayed(By locator){
        return findElement(locator).isDisplayed();

    }
}
