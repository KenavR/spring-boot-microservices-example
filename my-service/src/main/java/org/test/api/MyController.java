package org.test.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class MyController {


    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Map<String, String> getTest(@RequestParam("id") Long id) {

        Map<String, String> response = new HashMap<>();

        response.put("name", "My Service");

        return response;
    }

}
