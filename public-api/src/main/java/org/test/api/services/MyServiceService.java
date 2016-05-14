package org.test.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyServiceService {

    @Autowired
    private RestTemplate restTemplate;

    private final String serviceUrl;

    public MyServiceService() {
        this.serviceUrl = "http://my-service";
    }

    public Map<String, String> getTest() {

        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());

        // Add converters
        // Note I use the Jackson Converter, I removed the http form converter
        // because it is not needed when posting String, used for multipart forms.
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        Map<String, Long> vars = new HashMap<>();
        vars.put("id", 1L);

        return restTemplate.postForObject(serviceUrl+"/test", vars, Map.class);
    }
}
