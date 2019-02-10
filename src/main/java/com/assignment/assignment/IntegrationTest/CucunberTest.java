package com.assignment.assignment.IntegrationTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/com.assignment.assignment/IntegrationTest/FeatureFile/DictionaryFeature",
        glue = "com.assignment.assignment/IntegrationTet/StepDefination")
public class CucunberTest {
}
