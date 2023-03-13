module org.example {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.naming;
    requires java.sql;
    requires java.xml.bind;
    requires org.hibernate.orm.core;
    requires java.persistence;
    opens org.example to javafx.fxml;
    opens org.example.second to javafx.fxml, javafx.graphics;
    opens org.example.second.controller to javafx.fxml;
    opens org.example.second.model to org.hibernate.orm.core;
    exports org.example.second;
    exports org.example;
    exports org.example.second.controller;
}