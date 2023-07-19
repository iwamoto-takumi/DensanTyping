package site.iwataku;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DensanTyping implements Initializable {

	private List<String> romaAnswer = null;
	double time = 0;
	protected double missTypes = 0;
	protected double correctTypes = 0;

	protected double correctAnswerRate = 0;

	private int correctAnswerNumber = 0;
	private boolean startGame = false;
	protected double score = 0;

	@FXML
	private MenuItem menuItem_Lesson1, menuItem_Lesson2, menuItem_Lesson3, menuItem_Lesson4, menuItem_Lesson5, menuItem_Begineer, menuItem_Intermediate, menuItem_Advanced, menuItem_Master, menuItem_Expart, menuItem_FinishGame, menuItem_Close, menuItem_AdvancedSetting, splitMenuButton_User_MenuItem_Japanese, splitMenuButton_User_MenuItem_Hiragana;

	@FXML
	private ToggleGroup user, mode;
	@FXML
	private RadioMenuItem radioMenuItem_Visitor, radioMenuItem_CollegeStudent, radioMenuItem_Teacher, radioMenuItem_Japanese, radioMenuItem_Hiragana;

	@FXML
	private TextField textField_Score, textField_CorrectAnswerRate, textField_ValueofTypesForSeconds, textField_ValueofMistypes, textField_Question, textField_Answer, textField_Time;

	@FXML
	TextField textField_1th, textField_2th, textField_3th;

	private Map<String, String> map = new HashMap<>();
	private List<String> array;
	private List<String> subArray;
	private Timeline timer;
	private boolean firstTimerSet = false;
	int correctAnswer;
	String gameType = "";

	public void correctAnswer() {
		if (correctAnswerNumber == map.size() - 1) {
			gameFinish(true);
			return;
		}
		correctAnswerNumber += 1;
		setTextField_Question(array.get(correctAnswerNumber));
		setTextField_Answer("");
		var mode = Data.getMode();
		if (mode.equals("Japanese")) setRomaAnswer(Conversion.toRoma(subArray.get(correctAnswerNumber)));
		else if (mode.equals("Hiragana")) setRomaAnswer(Conversion.toRoma(array.get(correctAnswerNumber)));
	}

	public void gameFinish(boolean b) {
		setTextField_Question("");
		setTextField_Answer("");
		Main.fulltext = new StringBuilder();
		Main.typeNumber = 1;
		if (timer != null) timer.stop();
		Data.setStartGame(false);
		if (b) {
			score = score + correctTypes / time * 10 * correctAnswerRate / 100;
			textField_Score.setText(String.format("%.0f", score) + " 点");
			var stage = new Stage();
			try {
				stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Result.fxml"))));
			} catch(IOException e) {}
			stage.show();
			stage.setTitle("Record");
			if (Data.getEnableRecord()) {
				int[] array = FileClass.getRecord();
				textField_1th.setText(array[0] + " 点");
				textField_2th.setText(array[1] + " 点");
				textField_3th.setText(array[2] + " 点");
				FileClass.record(Data.getUser(), gameType, score);
			}
		}
		textField_Score.setText("0 点");
		textField_CorrectAnswerRate.setText("0 %");
		textField_ValueofTypesForSeconds.setText("0 回");
		textField_ValueofMistypes.setText("0 回");
		textField_Time.setText("0 秒");
	}

	public void gameStart(String str) {
		textField_Score.setText("0 点");
		textField_CorrectAnswerRate.setText("0 %");
		textField_ValueofTypesForSeconds.setText("0 回");
		textField_ValueofMistypes.setText("0 回");
		textField_Time.setText("0 秒");
		gameType = str;
		Main.fulltext.setLength(0);
		setTextField_Answer("");
		Main.fulltext = new StringBuilder();
		Main.typeNumber = 1;
		missTypes = 0;
		score = 0;
		correctTypes = 0;
		correctAnswer = 0;
		correctAnswerNumber = 0;
		time = 0;
		if (firstTimerSet) timer.stop();
		else firstTimerSet = true;

		timer = new Timeline(new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				time += 1;
				textField_Time.setText(String.format("%.0f", time) + " 秒");
				textField_ValueofTypesForSeconds.setText((String.format("%.2f", correctTypes / time) + " 回"));
			}
		}));
		timer.setCycleCount(Timeline.INDEFINITE);
		timer.play();
		switch(str) {
			case "Lesson1":
				Dictionary.lesson1_Initialize();
				break;
			case "Lesson2":
				Dictionary.lesson2_Initialize();
				break;
			case "Lesson3":
				Dictionary.lesson3_Initialize();
				break;
			case "Lesson4":
				Dictionary.lesson4_Initialize();
				break;
			case "Lesson5":
				Dictionary.lesson5_Initialize();
				break;
			case "Begineer":
				Dictionary.begineer_Initialize();
				break;
			case "Intermediate":
				Dictionary.intermediate_Initialize();
				break;
			case "Advanced":
				Dictionary.advanced_Initialize();
				break;
			case "Master":
				Dictionary.master_Initialize();
				break;
			case "Expart":
				Dictionary.expart_Initialize();
				break;
		}
		map = Data.getHashMap(str);
		var mode = Data.getMode();
		if (mode.equals("Japanese")) {
			array = new ArrayList<>(map.keySet());
			subArray = new ArrayList<>(map.values());
			setRomaAnswer(Conversion.toRoma(subArray.get(0)));
		} else if (mode.equals("Hiragana")) {
			array = new ArrayList<>(map.values());
			setRomaAnswer(Conversion.toRoma(array.get(0)));
		}
		setTextField_Question(array.get(0));
		Data.setStartGame(true);
	}

	public List<String> getRomaAnswer() {
		return romaAnswer;
	}

	public String getRomaAnswer(int i) {
		return romaAnswer.get(i);
	}

	public boolean getStartGame() {
		return startGame;
	}

	public TextField getTextField_Answer() {
		return textField_Answer;
	}

	public String getTextField_Question() {
		return textField_Question.getText();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		int[] array = FileClass.getRecord();
		textField_1th.setText(array[0] + " 点");
		textField_2th.setText(array[1] + " 点");
		textField_3th.setText(array[2] + " 点");
	}

	@FXML
	private void mouse_onClick_MenuItem_Advanced(ActionEvent e) {
		gameStart("Advanced");
	}

	@FXML
	private void mouse_onClick_MenuItem_AdvancedSetting(ActionEvent e) {
		try {
			var stage = new Stage();
			stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Config.fxml"))));
			stage.show();
			stage.setTitle("AdvancedConfig");
		} catch(IOException ie) {}
	}

	@FXML
	private void mouse_onClick_MenuItem_Begineer(ActionEvent e) {
		gameStart("Begineer");
	}

	@FXML
	private void mouse_onClick_MenuItem_Close(ActionEvent e) {
		Platform.exit();
		System.exit(0);
	}

	@FXML
	private void mouse_onClick_MenuItem_Expart(ActionEvent e) {
		gameStart("Expart");
	}

	@FXML
	private void mouse_onClick_MenuItem_FinishGame(ActionEvent e) {
		gameFinish(false);
	}

	@FXML
	private void mouse_onClick_MenuItem_Intermediate(ActionEvent e) {
		gameStart("Intermediate");
	}

	@FXML
	private void mouse_onClick_MenuItem_Lesson1(ActionEvent e) {
		gameStart("Lesson1");
	}

	@FXML
	private void mouse_onClick_MenuItem_Lesson2(ActionEvent e) {
		gameStart("Lesson2");
	}

	@FXML
	private void mouse_onClick_MenuItem_Lesson3(ActionEvent e) {
		gameStart("Lesson3");
	}

	@FXML
	private void mouse_onClick_MenuItem_Lesson4(ActionEvent e) {
		gameStart("Lesson4");
	}

	@FXML
	private void mouse_onClick_MenuItem_Lesson5(ActionEvent e) {
		gameStart("Lesson5");
	}

	@FXML
	private void mouse_onClick_MenuItem_Master(ActionEvent e) {
		gameStart("Master");
	}

	@FXML
	private void mouse_onClick_RadioMenuItem_CollegeStudent(ActionEvent e) {
		Data.setUser("CollegeStudent");
	}

	@FXML
	private void mouse_onClick_radioMenuItem_Hiragana(ActionEvent e) {
		Data.setMode("Hiragana");
	}

	@FXML
	private void mouse_onClick_radioMenuItem_Japanese(ActionEvent e) {
		Data.setMode("Japanese");
	}

	@FXML
	private void mouse_onClick_RadioMenuItem_Teacher(ActionEvent e) {
		Data.setUser("Teacher");
	}

	@FXML
	private void mouse_onClick_RadioMenuItem_Visitor(ActionEvent e) {
		Data.setUser("Visitor");
	}

	public void setRomaAnswer(List<String> list) {
		romaAnswer = list;
	}

	public void setTextField_Answer(String str) {
		textField_Answer.setText(str);
	}

	public void setTextField_Answer(TextField textField) {
		textField_Answer = textField;
	}

	public void setTextField_CorrectAnswerRate(String str) {
		textField_CorrectAnswerRate.setText(str);
	}

	public void setTextField_Question(String str) {
		textField_Question.setText(str);
	}

	public void setTextField_ValueofMissTypes(double d) {
		textField_ValueofMistypes.setText((String.format("%.0f", d) + " 回"));
	}

	public void setTextField_ValueofMistypes(String str) {
		textField_ValueofMistypes.setText(str);
	}

}
