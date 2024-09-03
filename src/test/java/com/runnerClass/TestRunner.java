package com.runnerClass;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			
			features = "src/test/resources/Feature",
			glue = { "com.stepDef","com.hooks"},
			//tags="@tag2",
			plugin= {"pretty", "json:target/cucumber.json"},
			monochrome = true, 
			publish = true,
			dryRun = false
			)


	public class TestRunner extends AbstractTestNGCucumberTests {
		
		
		
		
}
