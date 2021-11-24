package com.example.template;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;

public class HelloController {
    @FXML
    private Label lblDisplay;
    @FXML
    private TextField txtInput;
    @FXML
    double startTime;
    @FXML
    protected void handleStart() {
        startTime = System.nanoTime();
        System.out.println(System.currentTimeMillis());

        start();

    }
    public void start() {

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                System.out.println(now);
                if(startTime>0){
//                    System.out.println(now);
                    int x = (int)(Math.floor(startTime/1000000000));
//                    System.out.println(x);
                    int y  = (int)(now/1000000000);
                    System.out.println(y-x);
                    double z = now-startTime;
//                    System.out.println(z);
                    lblDisplay.setText(z + "");


                }
            }
        }.start();
    }
}