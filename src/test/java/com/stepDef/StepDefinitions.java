package com.stepDef;

import com.hooks.Hooks;
import com.pages.PageObjMod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
    
   
}

