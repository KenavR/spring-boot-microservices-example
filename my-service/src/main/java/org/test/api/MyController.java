package org.test.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class MyController {


    @RequestMapping(method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public @ResponseBody Map<String, String> getTest(@RequestBody Map<String, Long> params) {

        System.out.println("GET TEST: " + params.get("id"));

        Map<String, String> response = new HashMap<>();

        response.put("name", "My Service");

        return response;
    }

}
