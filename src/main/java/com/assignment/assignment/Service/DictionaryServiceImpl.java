package com.assignment.assignment.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Value("${app_id}")
    private String id;
    @Value("${app_key}")
    private String key;

    @Override
    public String getWordInformation(String word) {
        HttpHeaders setHeader = new HttpHeaders();
        setHeader.add("app_id",id);
        setHeader.add("app_key",key);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = new HttpEntity<String>(setHeader);
        String wordInfo = restTemplate.exchange("https://od-api.oxforddictionaries.com/api/v1/entries/en/" + word, HttpMethod.GET,entity,String.class).getBody();
        return wordInfo;
    }
}
