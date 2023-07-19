package site.iwataku;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class Config implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		var user = Discriminate.user(Data.getUser());
		var mode = Discriminate.mode(Data.getMode());
		splitMenuButton_User.setText(user);
		splitMenuButton_Mode.setText(mode);
		if(Data.getEnableRecord())		splitMenuButton_EnableRecord.setText("Enable");
		else	splitMenuButton_EnableRecord.setText("Disable");
		textField_MaxRecordValue.setText(Integer.toString(Data.getMaxRecordValue()));
		if(Data.getEnableDebugMode())	splitMenuButton_EnableDebugMode.setText("Enable");
		else	splitMenuButton_EnableDebugMode.setText("Disable");
	}

	@FXML
	private MenuItem menuItem_Japanese, menuItem_Hiragana, menuItem_Visitor, menuItem_CollegeStudent, menuItem_Teacher, enableDebugMode_MenuItem_Enable, enableDebugMode_MenuItem_Disable, enableRecord_MenuItem_Enable, enableRecord_MenuItem_Disable;
	@FXML
	private SplitMenuButton splitMenuButton_User, splitMenuButton_Mode, splitMenuButton_EnableRecord, splitMenuButton_EnableDebugMode;
	@FXML
	private Button button_Close, button_Save_and_Close, button_RecordClear;
	@FXML
	private TextField textField_TimeValue, textField_MaxRecordValue;

	@FXML
	private void mouse_onClick_Close(ActionEvent e) {
		((Node)e.getSource()).getScene().getWindow().hide();
	}
	@FXML
	private void mouse_onClick_Button_Save_and_Close(ActionEvent e) {
		Data.setUser(Discriminate.user(splitMenuButton_User.getText()));
		Data.setMode(Discriminate.mode(splitMenuButton_Mode.getText()));
		if(splitMenuButton_EnableRecord.getText().equals("Enable")) Data.setEnableRecord(true);
		else Data.setEnableRecord(false);
		Data.setMaxRecordValue(Integer.parseInt(textField_MaxRecordValue.getText()));
		if(splitMenuButton_EnableDebugMode.getText().equals("Enable")) Data.setEnableDebugMode(true);
		else Data.setEnableDebugMode(false);
		FileClass.config();
		((Node)e.getSource()).getScene().getWindow().hide();
	}

	@FXML
	private void mouse_onClick_SplitMenuButton_Mode_MenuItem_Visitor(ActionEvent e) {
		splitMenuButton_User.setText(Discriminate.user("Visitor"));
	}
	@FXML
	private void mouse_onClick_SplitMenuButton_Mode_MenuItem_CollegeStudent(ActionEvent e) {
		splitMenuButton_User.setText(Discriminate.user("CollegeStudent"));
	}
	@FXML
	private void mouse_onClick_SplitMenuButton_Mode_MenuItem_Teacher(ActionEvent e) {
		splitMenuButton_User.setText(Discriminate.user("Teacher"));
	}

	@FXML
	private void mouse_onClick_SplitMenuButton_User_MenuItem_Japanese(ActionEvent e) {
		splitMenuButton_Mode.setText(Discriminate.mode("Japanese"));
	}
	@FXML
	private void mouse_onClick_SplitMenuButton_User_MenuItem_Hiragana(ActionEvent e) {
		splitMenuButton_Mode.setText(Discriminate.mode("Hiragana"));
	}

	@FXML
	private void mouse_onClick_SplitMenuButton_EnableDebugMode_MenuItem_Enable(ActionEvent e) {
		splitMenuButton_EnableDebugMode.setText("Enable");
	}
	@FXML
	private void mouse_onClick_SplitMenuButton_EnableDebugMode_MenuItem_Disable(ActionEvent e) {
		splitMenuButton_EnableDebugMode.setText("Disable");
	}

	@FXML
	private void mouse_onClick_splitMenuButton_EnableRecord_MenuItem_Enable(ActionEvent e) {
		splitMenuButton_EnableRecord.setText("Enable");
	}
	@FXML
	private void mouse_onClick_splitMenuButton_EnableRecord_MenuItem_Disable(ActionEvent e) {
		splitMenuButton_EnableRecord.setText("Disable");
	}

	@FXML
	private void mouse_onClick_button_RecordClear(ActionEvent e) {
		FileClass.clearRecord();
	}
}
