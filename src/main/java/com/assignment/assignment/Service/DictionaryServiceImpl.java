package com.assignment.assignment.Service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
@Service
public class DictionaryServiceImpl {

    public String getWordInformation(String word) throws IOException {
        HttpHeaders setHeader = new HttpHeaders();
        setHeader.add("app_id","5dfe19cb");
        setHeader.add("app_key","63e13cabe8c70d484a32e489d8ce38a8");
        final String uri = "https://od-api.oxforddictionaries.com/api/v1/entries/en/";
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = new HttpEntity<String>(setHeader);
        String wordInfo = restTemplate.exchange(uri+word, HttpMethod.GET,entity,String.class).getBody();
        return wordInfo;
    }
}
