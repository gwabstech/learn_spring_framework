package com.gwabs.learn_spring_framework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements Gaming_console{

    @Override
    public void up(){
        System.out.println("moving up");
    }
    @Override
    public void down(){
        System.out.println("moving down");
    }
    @Override
    public void left(){
        System.out.println("moving left");
    }
    @Override
    public void right(){
        System.out.println("moving right");
    }
}
