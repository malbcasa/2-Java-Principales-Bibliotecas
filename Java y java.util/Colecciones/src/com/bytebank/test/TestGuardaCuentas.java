package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuentas {

	public static void main(String[] args) {
		GuardaCuentas gc = new GuardaCuentas();
		Cuenta cc = new CuentaCorriente(11, 22);
		gc.adicionar(cc);
		
		Cuenta cc2 = new CuentaCorriente(22, 44);
		gc.adicionar(cc2);
		
		System.out.println(gc.getTamano());
		
		System.out.println(gc.obtener(0));
		System.out.println(gc.obtener(1));
	}
}
