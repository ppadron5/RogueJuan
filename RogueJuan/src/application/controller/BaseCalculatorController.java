package application.controller;

import java.io.IOException;

import application.model.BaseCalculator;
import application.model.BaseConversion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class BaseCalculatorController {
	
	 	
	@FXML
	private TextField myNumber1TextField;
	
	@FXML
	private TextField myNumber2TextField;
	
	@FXML
	private TextField myBaseTextField;
	
	@FXML
	private TextArea myResultTextArea;
	
	@FXML
	private TextField myOperatorTextField;

	 
	
	
	
	
	public void calculate(MouseEvent event) throws IOException {
		
		String stringNum1 = myNumber1TextField.getText();
		String stringNum2 = myNumber2TextField.getText();
		String stringOp = myOperatorTextField.getText();
		String stringBase = myBaseTextField.getText();
		
		
		
		
		if(stringOp.isEmpty() || stringOp == null) {
			myResultTextArea.setText("Error: Please enter a valid operator");		
		}
		else
		{
			if(stringOp.charAt(0) == '+' || stringOp.charAt(0) == '-' || stringOp.charAt(0) == '*' || stringOp.charAt(0) == '/') {
				char op = stringOp.charAt(0);
				
				try
			    {
					
					
					
					int myBase = Integer.parseInt(stringBase.trim());
					
					
					BaseCalculator base = new BaseCalculator();
					
					
					String result = base.calculate(stringNum1,stringNum2,op,myBase);
					myResultTextArea.setText(result);
			      
			    }
			    catch (NumberFormatException nfe)
			    {
			      //System.out.println("NumberFormatException: " + nfe.getMessage());
			      myResultTextArea.setText("Error: Please enter a valid input");
			    }
				
			}
			else
			{
				myResultTextArea.setText("Error: Please enter a valid operator");		
			}
		}
		
		
	}
	
	
	
	public void setBaseConverterScene(MouseEvent event) throws IOException {
		
		Parent baseConverterRoot = FXMLLoader.load(getClass().getResource("/BaseConverter.fxml"));
		Scene baseConverterScene = new Scene(baseConverterRoot);
		Stage baseConverterStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		baseConverterStage.setScene(baseConverterScene);
		baseConverterStage.show();	
		

		
		//System.out.println("Hello World");
	}

}
