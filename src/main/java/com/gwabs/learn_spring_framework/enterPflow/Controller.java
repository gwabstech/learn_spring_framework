package com.gwabs.learn_spring_framework.enterPflow;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//send response
@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;
    @GetMapping("/sum")
    public int displaySum(){
        try {
            return businessService.calculate();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }



}

