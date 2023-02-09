package com.bytebank.test;


import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {

	public static void main(String[] args) {
		
		int[] numeros = new int[20];
		
		int numero = 40;
		// WRAPPER
		// Integer numeroObj = new Integer(40); Deprecado
		Integer numeroObj = Integer.valueOf(40);
		
		// No puede haber lista de primitivos
		List<Integer> lista = new ArrayList<Integer>();
		// primitivo != Object
		lista.add(numero); // autoboxing
		lista.add(numeroObj);
		
		// unboxing
		int valorPrimitivo = numeroObj.intValue();
		
		byte byteInteger = numeroObj.byteValue();
		double doubleInteger = numeroObj.doubleValue();
		float floatInteger = numeroObj.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE); //bits
		System.out.println(Integer.BYTES); //bytes
	}
}
