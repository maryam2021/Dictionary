package com.assignment.assignment.IntegrationTest.StepDefination;

import com.assignment.assignment.Handler.DictionaryHandler;
import com.assignment.assignment.ViewModel.DictionaryViewModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;


public class DictionaryStepDefination {
    private final DictionaryViewModel dictionaryViewModel;
    private final DictionaryHandler dictionaryHandler;

    public DictionaryStepDefination(DictionaryViewModel dictionaryViewModel, DictionaryHandler dictionaryHandler) {
        this.dictionaryViewModel = dictionaryViewModel;
        this.dictionaryHandler = dictionaryHandler;
    }
    String word = "cloud";

    @Given("^the user add word$")
    public void theUserAddWord()  {
        dictionaryViewModel.setType("");
        dictionaryViewModel.setMeaning("");
        dictionaryViewModel.setUsage("");
    }
    @When("^the user press button$")
    public void theUserPressButton() throws IOException {
        dictionaryHandler.getInformation(word);
    }
    @Then("^the user is able to view word related information")
    public void theUserIsAbleToViewordRelatedInformation() throws IOException {
        dictionaryHandler.getInformation(word);
        dictionaryViewModel.getType("");
        dictionaryViewModel.getMeaning("");
        dictionaryViewModel.getUsage("");


    }

}

