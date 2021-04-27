package _02_gotta_catchem_all;

import java.util.ArrayList;

public class ExceptionMethods {
	
	
	public static double divide(double x, double y) throws IllegalArgumentException{
		if(y == 0.0){
			throw new IllegalArgumentException();
		}
		
		return x / y;
	}
	
	public static String reverseString(String s) throws IllegalArgumentException{
		String reversedSen = "";
		ArrayList<Character> letters = new ArrayList<>();
		
		
		if(s.equals("")){
			throw new IllegalArgumentException();
		}
		
		for(int i = s.length()-1; i >= 0; i--){
			reversedSen += s.charAt(i);
		}
		
		return reversedSen;
	}
	
	
	
}
