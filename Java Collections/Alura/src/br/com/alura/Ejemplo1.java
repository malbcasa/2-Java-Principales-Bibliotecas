package br.com.alura;

import java.util.ArrayList;

public class Ejemplo1 {
	
	public static void main(String[] args) {
		String var1 = "Ejemplo 1";
		String var2 = "Ejemplo 2";
		String var3 = "Ejemplo 3";
		String var4 = "Ejemplo 4";
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(var1);
		lista.add(var2);
		lista.add(var3);
		lista.add(var4);
		
		System.out.println(lista);
		
		lista.set(2,"Ejemplo alterado");
		
		System.out.println(lista);
		
		System.out.println(lista.size());
	}

}
