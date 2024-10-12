module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires okhttp3;
    requires mysql.connector.j;
    requires org.json;
    requires java.sql;
    requires java.desktop;


    opens org.example.demo to javafx.fxml;
    exports org.example.demo;
}