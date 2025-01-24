package org.example.testfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Калькулятор");
        stage.setScene(scene);
        stage.show();
        System.out.println("пуш на сервер");
    }

    public static void main(String[] args) {
        launch();
    }
}