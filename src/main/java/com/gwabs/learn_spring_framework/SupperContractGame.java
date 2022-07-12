package com.gwabs.learn_spring_framework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SupperContractGame implements Gaming_console{

    @Override
    public void up(){
        System.out.println("moving up contra");
    }

    @Override
    public void down(){
        System.out.println("moving down contra");
    }
    @Override
    public void left(){
        System.out.println("moving left contra");
    }
    @Override
    public void right(){
        System.out.println("moving right contra");
    }
}
