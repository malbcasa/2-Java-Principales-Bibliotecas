package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

public class TestString {

	public static void main(String[] args) {
		String nombre = "Alura";
		
		// String nombre2 = new String("Alura"); No utilizado
		
		System.out.println("Antes de replace 1 " + nombre);
		nombre.replace("A","a");
		nombre.concat(" cursos online");
		System.out.println("Despues de replace 1 " + nombre);
		
		System.out.println("Antes de replace 2 " + nombre);
		nombre = nombre.replace("A","a");
		nombre = nombre.concat(" cursos online");
		nombre = nombre.toUpperCase();
		System.out.println("Despues de replace 2 " + nombre);
		
		char letra = nombre.charAt(3);
		printLine("Caracter encontrado: " + letra);
		
		int indice = nombre.indexOf("E");
		printLine("Indice encontrado: " + indice);
		
		printLine(new CuentaAhorros(200,300));
	}
	
	public static void printLine(Object valor) {
		System.out.println(valor);
	}
	
	/*
	public static void printLine(int valor) {
		System.out.println(valor);
	}
	
	public static void printLine(String valor) {
		System.out.println(valor);
	}
	
	public static void printLine(char valor) {
		System.out.println(valor);
	}
	
	public static void printLine(CuentaAhorros valor) {
		System.out.println(valor);
	}*/
}
