package org.example.second.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import org.example.second.model.Car;
import org.example.second.model.DatabaseMock;

import java.util.List;

public class FXMLExampleController {

    @FXML
    private Button bwmSearch;

    @FXML
    private Button audiSearch;

    @FXML
    private ListView<Text> dataGrid;

    @FXML
    public void initialize() {
        DatabaseMock databaseMock = new DatabaseMock();

        bwmSearch.setOnMouseClicked(t -> {
            List<Car> bmws = databaseMock.getBwm();
            Text text = new Text();
            for (Car bmw : bmws) {
                text.setText(
                        text.getText() + " "
                                + bmw.getId() + " "
                                + bmw.getType() + " "
                                + bmw.getPrice());
            }
            dataGrid.getItems().clear();
            dataGrid.getItems().add(text);
        });
    }


}
