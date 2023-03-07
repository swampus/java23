package org.example;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.event.WeakEventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloFX extends Application {


    @Override
    public void start(Stage stage) {

        VBox rootVBox = new VBox();

        HBox hBox = new HBox();
        hBox.setSpacing(10);

        TextField textFieldA = new TextField();
        TextField textFieldB = new TextField();

        Label plus = new Label("+");
        Label equals = new Label("=");
        Label result = new Label();

        rootVBox.getChildren().add(hBox);
        rootVBox.setSpacing(15);

        hBox.getChildren().add(textFieldA);
        hBox.getChildren().add(plus);
        hBox.getChildren().add(textFieldB);
        hBox.getChildren().add(equals);
        hBox.getChildren().add(result);

        Button button = new Button("Calculate");

        Button clear = new Button("Clear");

        clear.setOnMouseClicked(t -> {
            textFieldA.setText("");
            textFieldB.setText("");
            result.setText("");
            clear.setDisable(true);

        });


        button.setOnMouseClicked(t -> {
            try {
                Long numberA = Long.parseLong(textFieldA.getText());
                Long numberB = Long.parseLong(textFieldB.getText());
                result.setText(String.valueOf(numberA + numberB));
            } catch (NumberFormatException e) {
                result.setText("ERROR wrong data");
            }
            clear.setDisable(false);
        });


        rootVBox.getChildren().add(button);
        rootVBox.getChildren().add(clear);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(rootVBox);
        Scene scene = new Scene(stackPane, 640, 480);
        stage.setScene(scene);

        stage.show();


        Stage newWindow = new Stage();
        newWindow.setTitle("Second Stage");

        Button showWindow = new Button("Show window");
        rootVBox.getChildren().add(showWindow);
        showWindow.setOnMouseClicked(t-> {
            newWindow.setFullScreen(true);
            newWindow.show();
        });

    }

    public static void main(String[] args) {
        Application.launch(HelloFX.class, args);
    }

}