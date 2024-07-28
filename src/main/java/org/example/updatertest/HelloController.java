package org.example.updatertest;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.updatertest.xr3playerupdater.application.Main;
import org.example.updatertest.xr3playerupdater.presenter.DownloadModeController;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}