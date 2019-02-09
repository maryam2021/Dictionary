package com.assignment.assignment.Controller;

import com.assignment.assignment.Handler.DictionaryHandler;
import com.assignment.assignment.ViewModel.DictionaryViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DictionaryController {


    @Autowired
    private DictionaryHandler dictionaryHandler;

    @GetMapping(value = "/{word}/cloud")
    private DictionaryViewModel getInformation(@PathVariable String word) throws IOException {

        return dictionaryHandler.getInformation(word);

    }
}
