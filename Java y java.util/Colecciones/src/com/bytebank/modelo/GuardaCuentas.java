package com.bytebank.modelo;

public class GuardaCuentas {

	private Cuenta[] cuenta;
	private int indice;
	
	public GuardaCuentas() {
		this.cuenta =  new Cuenta[10];
		this.indice = 0;
	}

	public void adicionar(Cuenta cc) {
		this.cuenta[this.indice] = cc;
		this.indice++;
	}
	
	public Cuenta obtener(int indice) {
		return this.cuenta[indice];
	}

	public int getTamano() {
		return this.indice;
	}
}
