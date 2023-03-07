module org.example {
    requires javafx.fxml;
    requires javafx.controls;
    opens org.example to javafx.graphics;
    exports org.example;
}