package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PageObjMod extends BaseClass {
	
	 public PageObjMod(WebDriver driver) {
	        super(driver);
	        PageFactory.initElements(driver, this);
	    }
	 
    @FindBy(id = "email")
    public WebElement username;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath ="//button[@name='login']")
    public WebElement loginBtn;
    
    @FindBy(xpath ="//button[@name='logi']")
    public WebElement loginBtnn;

   

    public void username(String user) throws InterruptedException {
        enterTheText(username, user);
    }

    public void password(String pass) throws InterruptedException {
        enterTheText(password, pass);
    }

    public void login() {
        accessClick(loginBtn);
    }
   
    
}