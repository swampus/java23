module org.example {
    requires javafx.fxml;
    requires javafx.controls;
    opens org.example to javafx.fxml;
    opens org.example.second to javafx.fxml;
    opens org.example.second.controller to javafx.fxml;
    exports org.example;
    exports org.example.second;
    exports org.example.second.controller;
}