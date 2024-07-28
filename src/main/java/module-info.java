module org.example.updatertest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires org.controlsfx.controls;
    requires java.desktop;

    opens org.example.updatertest to javafx.fxml;
    exports org.example.updatertest;

    exports org.example.updatertest.xr3playerupdater.application to javafx.graphics;

    opens org.example.updatertest.xr3playerupdater.presenter to javafx.fxml;
}