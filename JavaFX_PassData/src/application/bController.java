package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class bController {
	
	@FXML
	TextField tInput;
	
	public void toA(ActionEvent event) throws IOException {
//		FXMLLoader aFXML = new FXMLLoader(getClass().getResource("A.fxml"));
//		Parent aRoot = aFXML.load();
//		
//		aController aController = aFXML.getController();	// aController 가져오기
//		
//		String data = tInput.getText();		// B 화면의 텍스트필드 입력값 가져오기
//		aController.showData(data);			// B 에서 A화면으로 데이터 전달
		Main.setRoot("A");	// A로 이동
//		Main.setRoot(aRoot);
	}
	
	// 전달받은 데이터 텍스트 필드에 출력하기
	public void showData(String data) {
		tInput.setText(data);
	}

}
