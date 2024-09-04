package com.stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hooks.Hooks;
import com.pages.PageObjMod;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
	
	 PageObjMod pg = Hooks.getPageObjMod();
    @Given("App is launched")
    public void app_is_launched() {
        System.out.println("URL launched");
    }

    @When("user enter the username on the App option {string} {string}")
    public void user_enter_the_username_on_the_app_option(String username, String password) throws InterruptedException {
       
        pg.username(username);
        pg.password(password);
    }

    @Then("user click the login button on the App option")
    public void user_click_the_login_button_on_the_app_option() {
       
        pg.login();
    }
    
    @Then("user click the login button on the homepage")
    public void user_click_the_login_button_on_the_homepage() {
       pg.loginbt();
    }
}

