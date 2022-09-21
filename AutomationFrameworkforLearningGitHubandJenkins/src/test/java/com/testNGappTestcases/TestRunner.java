package com.testNGappTestcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
                 glue={"com.testNGappTestcases"},
                 
               tags ="@Login",
               plugin= {"pretty","json:target/MyReports/report.json","junit:target/MyReports/report.xml"},
                 monochrome=true,
                 //dryRun=true,
                 publish=true
                 
                 
)

public class TestRunner {
	
	

}
