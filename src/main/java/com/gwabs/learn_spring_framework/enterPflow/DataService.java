package com.gwabs.learn_spring_framework.enterPflow;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// getting data
@Component
class DataService {

    public List<Integer> integers() {
        return Arrays.asList(1, 2, 3, 4, 67, 56, 7, 88, 754, 9);
    }
}
