package ch.fhnw.module06.ab3;

import ch.fhnw.module06.ab3.ApplicationUI;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Starter extends Application{

    public void start(javafx.stage.Stage stage) {

        Parent rootPanel = new ApplicationUI();
        Scene scene = new Scene(rootPanel);

        stage.setTitle("Arbeitsblatt 3");
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(300);
        stage.show();
        }

    public static void main(String[] args) {
        launch(args);
        }

}
