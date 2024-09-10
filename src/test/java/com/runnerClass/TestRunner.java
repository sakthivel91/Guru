package com.runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			
			features = "src/test/resources/Feature",
			glue = { "com.stepDef","com.hooks"},
			tags= "@sanity and @smoke",
			plugin= {"pretty", "json:target/cucumber.json"},
			monochrome = true, 
			publish = true,
			dryRun = false
			)


	public class TestRunner extends AbstractTestNGCucumberTests {
		
		
		
		
}
