package com.runnerClass;

import org.testng.annotations.AfterClass;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			
			features = "src/test/resources/Feature",
			glue = { "com.stepDef","com.hooks"},
			tags= "@smoke or @sanity",
			plugin = {"pretty","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			monochrome = true, 
			publish = true,
			dryRun = false
			)


	public class TestRunner extends AbstractTestNGCucumberTests {
	
}
