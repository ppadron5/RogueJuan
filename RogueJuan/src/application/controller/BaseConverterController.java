package application.controller;

import java.io.IOException;

import application.model.BaseConversion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import application.Main;

public class BaseConverterController {
	
	
	@FXML
	private TextField myNumberTextField;
	
	@FXML
	private TextField myToBaseTextField;
	
	@FXML
	private TextField myFromBaseTextField;
	
	@FXML
	private TextArea myResultTextArea;
	
	
	public void handle(ActionEvent event) throws IOException {
		

		
		String stringToBase = myToBaseTextField.getText();
		String stringFromBase = myFromBaseTextField.getText();
		String stringNum = myNumberTextField.getText();
		
		try
	    {
	      // the String to int conversion
			
	
		  int num = Integer.parseInt(stringNum.trim());
	      int toBase = Integer.parseInt(stringToBase.trim());
	      int fromBase = Integer.parseInt(stringFromBase.trim());
	      
	      
	      BaseConversion base = new BaseConversion(toBase, fromBase, num);
	      String result = base.baseConvert(toBase, fromBase, stringNum);
	      
	     
			
		  myResultTextArea.setText(result);
	      
	    }
	    catch (NumberFormatException nfe)
	    {
	      //System.out.println("NumberFormatException: " + nfe.getMessage());
	      myResultTextArea.setText("Error: Please enter a valid input");
	    }
		
		
		
		

	}
	
	public void swap(MouseEvent event) throws IOException {
		
		
		String stringToBase = myToBaseTextField.getText();
		String stringFromBase = myFromBaseTextField.getText();
		
		myToBaseTextField.setText(stringFromBase);
		myFromBaseTextField.setText(stringToBase);

				
		//System.out.println("Hello World");
	}
	
	public void setBaseCalculatorScene(MouseEvent event) throws IOException {
		
		Parent baseCalculatorRoot = FXMLLoader.load(getClass().getResource("/BaseCalculator.fxml"));
		Scene baseCalculatorScene = new Scene(baseCalculatorRoot);
		Stage baseCalculatorStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		baseCalculatorStage.setScene(baseCalculatorScene);
		baseCalculatorStage.show();	
		

		
		//System.out.println("Hello World");
	}

}
