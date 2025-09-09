package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:FeatureFiles/search.feature",
        glue = "com.tutorialsninja.automation.stepdef",
        plugin = {"html:target/cucumber-html-report"},
        monochrome = true
        // tags = "@Register or @One"  // Uncomment and modify as needed
)
public class TestRunner {
}
