package com.example.helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // Layouts ////
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layouts/gridpane.fxml"));
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layouts/hbox-layout.fxml"));
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layouts/borderpane-layout.fxml"));
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layouts/flowpane-layout.fxml"));
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layouts/vbox-layout.fxml"));
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layouts/tilepane-layout.fxml"));
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layouts/stackpane-layout.fxml"));

        // Controls
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("controls/controls.fxml"));

        // Events
        // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("events/events-handling.fxml"));

        // CSS with JavaFX
        // setUserAgentStylesheet(STYLESHEET_CASPIAN);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("styling/styling_css.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 500);
        stage.setTitle("JavaFX Tutorial!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}