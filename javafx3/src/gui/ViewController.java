package gui;

import gui.utils.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btTest;

	public void onBtTestAction() {
		Alerts.showAlert("Alert title", "alert header", "hello", AlertType.INFORMATION);
	}

}
