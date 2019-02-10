package com.assignment.assignment.IntegrationTest.StepDefination;


import com.assignment.assignment.Handler.DictionaryHandler;
import com.assignment.assignment.Service.DictionaryService;
import com.assignment.assignment.Service.DictionaryServiceImpl;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;


public class DictionaryStepDefination {

@Autowired
private DictionaryServiceImpl dictionaryService;

@Autowired
private DictionaryHandler dictionaryHandler;

   String word ="cloud";
   String wordInformation = "";

    @Before
    public void setup(){
    }

    @Given("^user has already word information$")
    public void theUserAddWord()  {
         wordInformation = dictionaryService.getWordInformation(word);
    }
    @When("^the user press button$")
    public void theUserPressButton() throws IOException {
       dictionaryHandler.getInformation(wordInformation);
    }
    @Then("^the user is able to view word related type")
    @And("^the user is able to view word related meaning/usage")
    public void theUserIsAbleToViewordRelatedInformation() throws IOException {


    }

}

