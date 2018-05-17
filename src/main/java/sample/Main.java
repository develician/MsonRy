package sample;

import com.jfoenix.controls.JFXMasonryPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Random r = new Random();
        JFXMasonryPane root = new JFXMasonryPane();
        for(int i = 0; i < 100;i++){
            Label lbl = new Label();
            lbl.setPrefSize(r.nextInt(200), r.nextInt(200));
            lbl.setStyle("-fx-background-color: rgb(" + r.nextInt(255)+  ", " + r.nextInt(255) + ", " + r.nextInt(255) + ")");
            root.getChildren().add(lbl);

        }

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
