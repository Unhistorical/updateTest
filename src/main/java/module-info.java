module org.example.updatertest {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.updatertest to javafx.fxml;
    exports org.example.updatertest;
}