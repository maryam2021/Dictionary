package com.assignment.assignment.IntegrationTest;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Feature/DictionaryFeature.feature")
public class CucumberTest {
}
