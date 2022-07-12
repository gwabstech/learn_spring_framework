package com.gwabs.learn_spring_framework.enterPflow;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// Business logic
@Component
class BusinessService {
    @Autowired
    private DataService dataService;

    public int calculate() throws JSONException {
        List<Integer> retrieveData = dataService.integers();
        return retrieveData.stream().reduce(Integer::sum).get();
    }


}
