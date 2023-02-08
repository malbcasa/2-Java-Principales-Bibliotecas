package com.bytebank.test;

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
		System.out.println("Caracter encontrado: " + letra);
		
		int indice = nombre.indexOf("E");
		System.out.println("Indice encontrado: " + indice);
	}
}
