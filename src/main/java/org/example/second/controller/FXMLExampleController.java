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
    private Button deleteButton;

    @FXML
    private ListView<Text> dataGrid;

    @FXML
    public void initialize() {
        DatabaseMock databaseMock = new DatabaseMock();

        deleteButton.setOnMouseClicked(t-> {
            Text text =
                    dataGrid.getSelectionModel().getSelectedItem();
            dataGrid.getItems().remove(text);

            //sql to database
        });

        bwmSearch.setOnMouseClicked(t -> {
            dataGrid.getItems().clear();
            List<Car> bmws = databaseMock.getBwm();
            for (Car bmw : bmws) {
                Text text = new Text();
                text.setText(bmw.getId() + " "
                                + bmw.getType() + " "
                                + bmw.getPrice());
                dataGrid.getItems().add(text);
            }
        });

        audiSearch.setOnMouseClicked(t -> {
            dataGrid.getItems().clear();
            List<Car> cars = databaseMock.getAudi();
            for (Car audi : cars) {
                Text text = new Text();
                text.setText(audi.getId() + " "
                        + audi.getType() + " "
                        + audi.getPrice());
                dataGrid.getItems().add(text);
            }
        });
    }


}
