package br.com.alura;

import java.util.ArrayList;

public class Clase2 {

	public static void main(String[] args) {
		String var1 = "Clase 1";
		String var2 = "Clase 2";
		String var3 = "Clase 3";
		String var4 = "Clase 4";
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(var1);
		lista.add(var2);
		lista.add(var3);
		lista.add(var4);
		
		System.out.println(lista);
				
//		for(int i = 0 ; i < lista.size() ; i++) {
//			System.out.println(lista.get(i));
//		}
		
//		for(String clase : lista) {
//			System.out.println(clase);
//		}
		
		lista.forEach(clase -> {
			System.out.println(clase);
		});
		
	}
}
