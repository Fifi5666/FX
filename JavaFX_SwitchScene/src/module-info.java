module JavaFX_SwitchScene {
	requires javafx.controls;
	requires javafx.fxml;		// fxml 묘듈 추가
	
	opens application to javafx.graphics, javafx.fxml;
}
