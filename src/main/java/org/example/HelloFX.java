package org.example;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.event.WeakEventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFX extends Application {

    public void doOutput(VBox topVBox, Button button) {
        button.setOnMouseClicked(
                mouseEvent -> {
                    ObservableList<Node> list
                            = topVBox.getChildren();
                    //Find children from vBox by ID: ID = name-Label
                    Label label = (Label) list.stream()
                            .filter(t->t.getId() != null)
                            .filter(t->t.getId().equals("name-Label"))
                            .findFirst().get();
                    label.setText("Text - changed (filter)");
                }
        );
    }

    @Override
    public void start(Stage stage) {

        VBox topVBox = new VBox();
        Button button = new Button();
        button.setText("Our button");

        Label label1 = new Label();
        label1.setText("My Label!");


        topVBox.getChildren().add(button);
        topVBox.getChildren().add(label1);

        label1.setId("name-Label");

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(topVBox);
        Scene scene = new Scene(stackPane, 640, 480);
        stage.setScene(scene);

        doOutput(topVBox, button);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(HelloFX.class, args);
    }

}