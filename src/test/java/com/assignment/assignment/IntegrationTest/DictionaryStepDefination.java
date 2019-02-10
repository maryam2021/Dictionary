package com.assignment.assignment.IntegrationTest;

import com.assignment.assignment.Handler.DictionaryHandler;
import com.assignment.assignment.Service.DictionaryServiceImpl;
import com.assignment.assignment.Transformer.DictionaryTransformer;
import com.assignment.assignment.ViewModel.DictionaryViewModel;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


public class DictionaryStepDefination  {

        private DictionaryServiceImpl dictionaryService;
        private DictionaryHandler dictionaryHandler;
        private DictionaryTransformer dictionaryTransformer;


      @Autowired
        public DictionaryStepDefination() {
                this.dictionaryService = new DictionaryServiceImpl();
                this.dictionaryHandler = new DictionaryHandler(dictionaryService,new DictionaryTransformer());
                this.dictionaryTransformer = new DictionaryTransformer();

        }

        String word ="cloud";
        String wordInformation = "";
        DictionaryViewModel wordInformations;

        @Before
        public void setup(){
        }

        @Given("^user has already word information$")
        public void theUserAddWord()  {
                RestTemplate restTemplate = new RestTemplate();
                HttpHeaders setHeader = new HttpHeaders();
                setHeader.add("app_id","5dfe19cb");
                setHeader.add("app_key","63e13cabe8c70d484a32e489d8ce38a8");
                HttpEntity<String> entity = new HttpEntity<String>(setHeader);
                wordInformation = restTemplate.exchange("https://od-api.oxforddictionaries.com/api/v1/entries/en/" + "cloud", HttpMethod.GET,entity,String.class).getBody();

        }
        @When("^the user press button$")
        public void theUserPressButton() throws IOException {
                wordInformations =  dictionaryTransformer.transform(wordInformation);
        }
        @Then("^the user is able to view word related type")
        @And("^the user is able to view word related meaning/usage")
        public void theUserIsAbleToViewordRelatedInformation() throws IOException {
             wordInformations.equals(verifyWordInformation());

        }
        private DictionaryViewModel verifyWordInformation(){
                DictionaryViewModel dictionaryViewModel = new DictionaryViewModel("Noun","a visible mass of condensed watery vapour floating in the atmosphere, typically high above the general level of the ground","the sky was almost free of cloud");
                return  dictionaryViewModel;
        }
    }



