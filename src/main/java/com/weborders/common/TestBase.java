package com.weborders.common;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase extends Base {

    @BeforeSuite
    public void beforeSuite(){

    }
    @BeforeMethod
    public void beforeMethod(){

    }
    @AfterMethod
    public void afterMethod(){

    }
    @AfterSuite
    public void afterSuite(){

    }
}
