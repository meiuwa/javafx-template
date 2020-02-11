package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class App extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(App.class.getResource("/com/example/app_layout.fxml"));
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root, bounds.getWidth(), bounds.getHeight());
        scene.getStylesheets().setAll("/com/example/app.min.css");
        primaryStage.setTitle("App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
