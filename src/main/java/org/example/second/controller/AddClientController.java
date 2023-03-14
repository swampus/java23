package org.example.second.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.second.model.DatabaseMock;
import org.example.second.model.GymClient;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.UUID;

public class AddClientController {

    @FXML
    private TextField nameT;
    @FXML
    private TextField surnameT;
    @FXML
    private TextField idecodeT;
    @FXML
    private Button saveButton;

    @FXML
    public void initialize() {
        saveButton.setOnMouseClicked(t-> {

            GymClient gymClient = new GymClient();
            gymClient.setName(nameT.getText());
            gymClient.setIdcode(idecodeT.getText());
            gymClient.setSurname(surnameT.getText());
            gymClient.setId(System.currentTimeMillis());

            Session session = DatabaseMock
                    .getCurrentSessionFromConfig();

            Transaction trn = session.beginTransaction();
            session.save(gymClient);
            trn.commit();

            nameT.clear();
            idecodeT.clear();
            surnameT.clear();;
        });
    }
}
