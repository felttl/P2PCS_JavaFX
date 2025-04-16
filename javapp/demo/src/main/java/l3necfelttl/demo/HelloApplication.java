package l3necfelttl.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        System.out.println("Lancement de l'application");
        Label label = new Label("Hello, JavaFX!");
        Scene scene = new Scene(new StackPane(label), 300, 200);
        stage.setScene(scene);
        stage.setTitle("Demo");
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Avant launch()");
        launch(args);
        System.out.println("Après launch()"); // ne s'affichera jamais normalement
    }
}
