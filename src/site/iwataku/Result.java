package site.iwataku;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Result implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		label_Score.setText(String.format("%.0f", Main.control.score) + " 点");
		label_ValueofTypesForSeconds.setText(String.format("%.2f", Main.control.correctTypes / Main.control.time) + " 回");
		label_CorrectAnswerRate.setText((String.format("%.0f", Main.control.correctAnswerRate) + " %"));
		label_Time.setText((String.format("%.0f", Main.control.time) + " 秒"));
	}

	@FXML
	Label label_Score, label_ValueofTypesForSeconds, label_CorrectAnswerRate, label_Time;

	@FXML
	Button button_playAgain, button_Finish;

	@FXML
	private void mouseOnClick_Button_PlayAgain(ActionEvent e) {
		Main.control.gameStart(Main.control.gameType);
		((Node)e.getSource()).getScene().getWindow().hide();
	}

	@FXML
	private void mouseOnClick_Button_Finish(ActionEvent e) {
		((Node)e.getSource()).getScene().getWindow().hide();
	}

}
