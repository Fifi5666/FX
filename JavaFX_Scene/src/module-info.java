module JavaFX_Scen {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
