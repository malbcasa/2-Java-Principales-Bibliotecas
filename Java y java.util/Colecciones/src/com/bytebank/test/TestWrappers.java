package com.bytebank.test;

public class TestWrappers {

	public static void main(String[] args) {
		Double numDouble = 33.0 ; // autoboxing
		Boolean verdadero = true ; // autoboxing
	
		Double numDouble2 = Double.valueOf(33);
		System.out.println(numDouble2);
		
		String numStr = "43"; // autoboxing
		
		Double strToDouble = Double.valueOf(numStr);
		Integer strToInt = Integer.valueOf(numStr);
		
		System.out.println(strToDouble);
		System.out.println(strToInt);
		
		Number numero = Integer.valueOf(5);
		double numDoublePrim = numero.doubleValue(); //unboxing
		
		Boolean falso = Boolean.FALSE;
	}
	
}
