package org.test.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
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
        this.serviceUrl = "http://MY-SERVICE";
    }

    public Map<String, String> getTest() {

        Map<String, String> vars = new HashMap<>();
        vars.put("id", "1");

        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());

        return restTemplate.postForObject(serviceUrl+"/test", "", Map.class, vars);
    }
}
