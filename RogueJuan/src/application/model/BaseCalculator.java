package application.model;

public class BaseCalculator {
	
	public BaseCalculator() {
		
	}

	public String calculate(String num1, String num2, char op, int base) {
		
		String num1Base10 = Integer.toString(Integer.parseInt(num1, base), 10); 
		String num2Base10 = Integer.toString(Integer.parseInt(num2, base), 10);
		
		 
		
		try
	    {
			int result = 0;
			
			switch (op) {
			
			case '+':
				result = Integer.parseInt(num1Base10) + Integer.parseInt(num2Base10);
				break;
			case '-':
				result = Integer.parseInt(num1Base10) - Integer.parseInt(num2Base10);
				break;
			case '*':
				result = Integer.parseInt(num1Base10) * Integer.parseInt(num2Base10);
				break;
			case '/':
				result = Integer.parseInt(num1Base10) / Integer.parseInt(num2Base10);
				break;
			
			}
			
			
			
			
			return Integer.toString(result, base); 
			
	    }
		catch(ArithmeticException e) {
	    	return "Error cannot divide by zero";
	    }
		
	   		
		
	}
	
	
	

}
