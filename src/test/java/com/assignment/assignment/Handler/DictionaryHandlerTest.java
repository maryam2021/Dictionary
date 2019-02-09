package com.assignment.assignment.Handler;

import com.assignment.assignment.Service.DictionaryService;
import com.assignment.assignment.Service.DictionaryServiceImpl;
import com.assignment.assignment.Transformer.DictionaryTransformer;
import com.assignment.assignment.ViewModel.DictionaryViewModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static junit.framework.TestCase.assertTrue;

@SpringBootTest
public class DictionaryHandlerTest {

     private DictionaryHandler dictionaryHandler;
     private DictionaryServiceImpl dictionaryService;
     private DictionaryTransformer dictionaryTransformer;

    @Before
    public void setup(){
        dictionaryService = new DictionaryServiceImpl();
        dictionaryTransformer = new DictionaryTransformer();
        dictionaryHandler = new DictionaryHandler(dictionaryService,dictionaryTransformer);
    }

    @Test
    public void givenUserEnterWordthenWordInformationShouldGenerate() throws IOException {
         String responseEntity = getStringResponseEntity();
        DictionaryViewModel dictionaryViewModel =  dictionaryTransformer.transform(responseEntity);
        assertTrue(dictionaryViewModel.equals(verifyWordInformation()));
    }

    private String getStringResponseEntity() {
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.set("app_id","5dfe19cb");
        header.set("app_key","63e13cabe8c70d484a32e489d8ce38a8");
        HttpEntity<String> entity = new HttpEntity<>(header);
        String wordInformation = restTemplate.exchange("https://od-api.oxforddictionaries.com/api/v1/entries/en/" + "cloud", HttpMethod.GET,entity, String.class).getBody();
        return  wordInformation;
    }
    private DictionaryViewModel verifyWordInformation(){
      DictionaryViewModel dictionaryViewModel = new DictionaryViewModel("Noun","a visible mass of condensed watery vapour floating in the atmosphere, typically high above the general level of the ground","the sky was almost free of cloud");
       return  dictionaryViewModel;
    }

}