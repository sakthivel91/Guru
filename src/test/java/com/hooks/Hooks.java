package com.hooks;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.base.BaseClass;
import com.pages.PageObjMod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    protected static WebDriver driver;
    protected static PageObjMod pg;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        pg = new PageObjMod(driver);
    }
   
  
    @After()
    public void takeScraenshotOnFailure(Scenario scenario) {

    if (scenario.isFailed()) {

    TakesScreenshot ts = (TakesScreenshot) driver;

    byte[] src = ts.getScreenshotAs(OutputType.BYTES);
    scenario.attach(src, "image/png", "screenshot");
    System.out.println("screenshot saved succesfully");
    }

    }
    @After(order=1)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    

    public static  WebDriver getDriver() {
        return driver;
    }

    public static PageObjMod getPageObjMod() {
        return pg;
    }
}
