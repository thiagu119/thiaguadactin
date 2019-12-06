package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.libglobal.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features" }, glue = { "com.stepdefinition" },dryRun=false,monochrome=true,
plugin= {"pretty","html:src/test/resources/Features","json:src/test/resources/Features/Reports.json"})

public class TestRunnerClass {
	
	@AfterClass
	public static void postReports() {
		JVMReports.generateCucumberReports("src/test/resources/Features/Reports.json");

	}

}
