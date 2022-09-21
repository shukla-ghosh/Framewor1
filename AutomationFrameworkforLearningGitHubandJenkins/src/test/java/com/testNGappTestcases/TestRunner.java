package com.testNGappTestcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
                 glue={"com.testNGappTestcases"},
                 plugin="pretty",
               tags ="not @Login",
                 monochrome=true,
                 dryRun=true
                 
                 
)

public class TestRunner {
	
	

}
