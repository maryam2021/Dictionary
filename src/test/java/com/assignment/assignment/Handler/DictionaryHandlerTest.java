package com.assignment.assignment.Handler;

import com.assignment.assignment.Service.DictionaryService;
import com.assignment.assignment.Service.DictionaryServiceImpl;
import com.assignment.assignment.Transformer.DictionaryTransformer;
import com.assignment.assignment.ViewModel.DictionaryViewModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
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
        String word ="cloud";
        dictionaryHandler.getInformation(word);
       DictionaryViewModel dictionaryViewModel =  dictionaryTransformer.transform(word);
        assertTrue(dictionaryViewModel.equals(verifyWordInformation()));

    }
    private DictionaryViewModel verifyWordInformation(){
      DictionaryViewModel dictionaryViewModel = new DictionaryViewModel("Noun","a visible mass of condensed watery vapour floating in the atmosphere, typically high above the general level of the ground","the sky was almost free of cloud");
       return  dictionaryViewModel;

    }

}