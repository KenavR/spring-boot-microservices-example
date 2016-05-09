package org.test.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.test.api.services.MyServiceService;

import java.util.Map;


@Controller
@RequestMapping(value = "/service")
public class MyServiceController {

    @Autowired
    MyServiceService service;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, String> getTest() {
        return service.getTest();
    }

}
