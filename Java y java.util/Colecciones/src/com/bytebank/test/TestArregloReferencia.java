package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencia {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		cuentas[1] = cc;
		
		System.out.println(cc);
		System.out.println(cuentas[1]);
		
		cuentas[0] = new CuentaCorriente(11, 99);
		System.out.println(cuentas[0]);
		
		for(int i = 0; i < cuentas.length ; i++) {
			System.out.println(cuentas[i]);
		}
		
		Cuenta[] cuentas2 = new Cuenta[5];
		CuentaAhorros ca = new CuentaAhorros(44,55);
		cuentas2[3] = ca;
		cuentas2[1] = cc;
		cuentas[0] = new CuentaCorriente(11, 99);
		//Cast
		CuentaCorriente cuenta = (CuentaCorriente) cuentas2[1];
		System.out.println(cuenta);
		
		Object[] referencias = new Object[5];
		referencias[1] = cc;
		
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		
		for (int i = 0; i < referencias.length ; i++) {
			System.out.println(referencias[i]);
		}
		
		Cliente obtenido = (Cliente) referencias[4];
		System.out.println(obtenido);
	}
}
