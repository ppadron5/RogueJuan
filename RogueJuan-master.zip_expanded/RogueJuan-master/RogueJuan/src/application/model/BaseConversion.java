package application.model;

public class BaseConversion {
	
	int toBase;
	int fromBase;
	int num;
	
	public BaseConversion(int toBase, int fromBase, int num) {
		this.fromBase = fromBase;
		this.toBase = toBase;
		this.num = num;
	}
	
	public int getToBase() {
		return toBase;
	}
	
	public int getFromBase() {
		return fromBase;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setToBase(int toBase) {
		this.toBase = toBase;
	}
	public void setfromBase(int fromBase) {
		this.fromBase = fromBase;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String baseConvert(int toBase, int fromBase, String stringNum) {
		
		
		Integer result = Integer.valueOf(stringNum, fromBase); 
		//System.out.println(result);
		
		return Integer.toString( result , toBase );
		
		
	}
	
	public String toString() {
		
		
		return "";
		
	}

}
