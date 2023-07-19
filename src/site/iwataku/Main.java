package site.iwataku;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	static DensanTyping control = null;

	static StringBuilder fulltext = new StringBuilder();

	static int typeNumber = 1;

	public static void main(String[] args) throws FileNotFoundException {
		FileClass.initialize();
		Conversion.initialize();
		launch(args);
	}

	public DensanTyping getControl() {
		return control;
	}

	public void keyPressed(KeyEvent e) {
		if (!Data.getStartGame()) return;
		var tmpStr = e.getText();
		switch(tmpStr) {
			case "a":
			case "b":
			case "c":
			case "d":
			case "e":
			case "f":
			case "g":
			case "h":
			case "i":
			case "j":
			case "k":
			case "l":
			case "m":
			case "n":
			case "o":
			case "p":
			case "q":
			case "r":
			case "s":
			case "t":
			case "u":
			case "v":
			case "w":
			case "x":
			case "y":
			case "z":
			case "-":
				fulltext.append(tmpStr);

				for (int i = 0; i < control.getRomaAnswer().size(); i++) {
					if (control.getRomaAnswer(i).length() >= typeNumber && fulltext.toString().equals(control.getRomaAnswer(i).substring(0, typeNumber))) {
						typeNumber += 1;
						control.setTextField_Answer(Conversion.toJapanese(fulltext.toString()));
						control.correctTypes += 1.0;
						if (fulltext.toString().equals(control.getRomaAnswer(i))) {
							typeNumber = 1;
							fulltext.delete(0, fulltext.length());
							control.correctAnswer();
							break;
						}
						break;
					} else if (i + 1 == control.getRomaAnswer().size()) {
						fulltext.setLength(fulltext.length() - 1);
						control.missTypes += 1.0;
						control.setTextField_ValueofMissTypes(control.missTypes);
					}
				}
				break;
			default:
				break;
		}
		System.out.println();

		if (control.missTypes == 0) control.correctAnswerRate = 100;
		else control.correctAnswerRate = control.correctTypes / (control.correctTypes + control.missTypes) * 100;
		var tmpStr2 = "";
		if (control.correctAnswerRate == 0 | control.correctAnswerRate == 100) tmpStr2 = String.format("%.0f", control.correctAnswerRate);
		else tmpStr2 = String.format("%.2f", control.correctAnswerRate);
		control.setTextField_CorrectAnswerRate(tmpStr2 + " %");

	}

	@Override
	public void start(Stage stage) {
		try {
			var loader = new FXMLLoader(getClass().getResource("DensanTyping.fxml"));
			var root = (BorderPane) loader.load();
			control = loader.getController();
			var scene = new Scene(root, 800, 600);
			stage.setScene(scene);
			stage.show();
			stage.setTitle("[" + Data.getTrueConfigVersion() + "] Typing Soft for Densan");
			scene.setOnKeyPressed(this::keyPressed);
		} catch(Exception e) {}
	}
}
