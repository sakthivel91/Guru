package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    protected  WebDriver driver;
    protected WebDriverWait wait;

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public static  void takeScreenshot(WebDriver driver, String filePath) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    public void enterTheText(WebElement element, String input) throws InterruptedException {
        element.sendKeys(input);
    }

    public void accessClick(WebElement element) {
        explicitWait(element);
        element.click();
    }

    public String getText(WebElement element) {
        explicitWait(element);
        return element.getText();
    }

    public void explicitWait(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}