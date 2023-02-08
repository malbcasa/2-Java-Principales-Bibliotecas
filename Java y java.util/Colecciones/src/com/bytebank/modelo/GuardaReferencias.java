package com.bytebank.modelo;

public class GuardaReferencias {

	private Object[] referencia;
	private int indice;
	
	public GuardaReferencias() {
		this.referencia =  new Object[10];
		this.indice = 0;
	}

	public void adicionar(Object cc) {
		this.referencia[this.indice] = cc;
		this.indice++;
	}
	
	public Object obtener(int indice) {
		return this.referencia[indice];
	}

	public int getTamano() {
		return this.indice;
	}
}
