package com.assignment.assignment.Handler;

import com.assignment.assignment.Service.DictionaryServiceImpl;
import com.assignment.assignment.Transformer.DictionaryTransformer;
import com.assignment.assignment.ViewModel.DictionaryViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class DictionaryHandler {

    private DictionaryServiceImpl dictionaryService;

    private DictionaryTransformer dictionaryTransformer;

    @Autowired
    public DictionaryHandler(DictionaryServiceImpl dictionaryService, DictionaryTransformer dictionaryTransformer) {
        this.dictionaryService = dictionaryService;
        this.dictionaryTransformer = dictionaryTransformer;
    }

    public DictionaryViewModel getInformation(String word) throws IOException {
         String wordInformation =  dictionaryService.getWordInformation(word);
        return dictionaryTransformer.transform(wordInformation);


    }
}
