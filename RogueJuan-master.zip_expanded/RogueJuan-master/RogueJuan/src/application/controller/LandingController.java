package application.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LandingController {
	
	
	@FXML
	private Button myBaseCalculatorButton;
	
	@FXML
	private Button myBaseConverterButton;
	
	
	public void setBaseCalculatorScene(MouseEvent event) throws IOException {
		
		Parent baseCalculatorRoot = FXMLLoader.load(getClass().getResource("/BaseCalculator.fxml"));
		Scene baseCalculatorScene = new Scene(baseCalculatorRoot);
		Stage baseCalculatorStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		baseCalculatorStage.setScene(baseCalculatorScene);
		baseCalculatorStage.show();	
		

		
		//System.out.println("Hello World");
	}
	
	
	public void setBaseConverterScene(MouseEvent event) throws IOException {
		
		Parent baseCalculatorRoot = FXMLLoader.load(getClass().getResource("/BaseConverter.fxml"));
		Scene baseCalculatorScene = new Scene(baseCalculatorRoot);
		Stage baseCalculatorStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		baseCalculatorStage.setScene(baseCalculatorScene);
		baseCalculatorStage.show();	
		

		
		//System.out.println("Hello World");
	}
	
	

}
