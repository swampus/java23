package org.example.second;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.second.controller.FXMLExampleController;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainFormFX extends Application  {

    public static Stage mainStage;

    @Override
    public void start(Stage stage) throws Exception {

        mainStage = stage;

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml_example.fxml"));

        Scene scene = new Scene(root, 1200, 600);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();

        Parent addClientRoot = FXMLLoader.load(getClass().getClassLoader().getResource("add_client.fxml"));
        Scene clientScene = new Scene(addClientRoot, 400, 400);
        FXMLExampleController.stageAddClient = new Stage();
        FXMLExampleController.stageAddClient.setScene(clientScene);
    }

    public static void main(String[] args) {
        Application.launch(MainFormFX.class, args);
    }


}
