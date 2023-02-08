package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		lista.add(cc);
		lista.add(cc2);
		
		//Cliente cliente = new Cliente();
		//lista.add(cliente);
		
		Cuenta obtenerCuenta = (Cuenta) lista.get(0);
		System.out.println(obtenerCuenta);
		
		for ( int i = 0 ; i < lista.size() ; i++) {
			System.out.println(lista.get(i));
		}
		
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);
		System.out.println(contiene ? "Si, es igual (equals)" : "No");
		
	
	}
}
