package com.assignment.assignment.Transformer;

import com.assignment.assignment.ViewModel.DictionaryViewModel;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DictionaryTransformer {

    public DictionaryViewModel transform(String wordInformation) throws IOException {
        JsonNode jsonObj = createJsonNodeTree(wordInformation);
        String type= getType(jsonObj);
        String meaning= getDefination(jsonObj);
        String example= getExample(jsonObj);
        DictionaryViewModel dictionaryViewModel=new DictionaryViewModel(type,meaning,example);
        return dictionaryViewModel;
    }

    private String getExample(JsonNode jsonObj) {
        return jsonObj.get("results").get(0).get("lexicalEntries").get(0).get("entries").get(0).get("senses").get(0).get("examples").get(0).get("text").asText();
    }

    private String getDefination(JsonNode jsonObj) {
        return jsonObj.get("results").get(0).get("lexicalEntries").get(0).get("entries").get(0).get("senses").get(0).get("definitions").get(0).asText();
    }

    private String getType(JsonNode jsonObj) {
        return jsonObj.get("results").get(0).get("lexicalEntries").get(0).get("lexicalCategory").asText();
    }


    public JsonNode createJsonNodeTree(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonObj = mapper.readTree(json);
        return jsonObj;
    }
}
