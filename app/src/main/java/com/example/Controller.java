package com.example;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Controller implements Initializable {
    @FXML Label clock;

    @Override public void initialize(URL location, ResourceBundle resources) {
        Timeline clockTimeline = new Timeline(
            new KeyFrame(Duration.ZERO, event -> {
                LocalTime time = LocalTime.now();
                clock.setText(String.format("%s:%s:%s", time.getHour(), time.getMinute(), time.getSecond()));
            }),
            new KeyFrame(Duration.seconds(1)));
        clockTimeline.setCycleCount(Animation.INDEFINITE);
        clockTimeline.play();

        FadeTransition clockFadeTransition = new FadeTransition();
        clockFadeTransition.setNode(clock);
        clockFadeTransition.setFromValue(1);
        clockFadeTransition.setToValue(0);
        clockFadeTransition.setDuration(Duration.seconds(1));
        clockFadeTransition.setCycleCount(Animation.INDEFINITE);
        clockFadeTransition.setAutoReverse(true);
        clockFadeTransition.play();
    }
}
