package com.gwabs.learn_spring_framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    private Gaming_console game;
   public GameRunner(Gaming_console game){
        this.game = game;
    }

    public void runGame(){
       game.up();
       game.left();
       game.right();
       game.down();
    }
}
