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
                            .filter(t -> t.getId() != null)
                            .filter(t -> t.getId().equals("name-Label"))
                            .findFirst().get();
                    label.setText("Text - changed (filter)");
                }
        );
    }

    @Override
    public void start(Stage stage) {

        VBox lVbox = new VBox();
        lVbox.setId("L-vBox");

        VBox mVbox = new VBox();

        VBox rVBox = new VBox();
        rVBox.setId("R-vBox");

        Label label1 = new Label("Label1");
        Label label2 = new Label("Label2");
        Label label3 = new Label("Label3");

        lVbox.getChildren().add(label1);
        rVBox.getChildren().add(label3);
        mVbox.getChildren().add(label2);

        HBox rootHBox = new HBox();
        rootHBox.setSpacing(100);
        rootHBox.getChildren().add(lVbox);
        rootHBox.getChildren().add(mVbox);
        rootHBox.getChildren().add(rVBox);

        Button button = new Button("Click me");
        button.setOnMouseMoved(t -> {
            if(lVbox.getChildren().contains(button)){
                rVBox.getChildren().add(button);
            }else{
                lVbox.getChildren().add(button);
            }
        });


        lVbox.getChildren().add(button);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(rootHBox);
        Scene scene = new Scene(stackPane, 640, 480);
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(HelloFX.class, args);
    }

}