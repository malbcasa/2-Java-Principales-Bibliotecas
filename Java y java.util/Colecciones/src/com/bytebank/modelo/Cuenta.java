package com.bytebank.modelo;

/**
 * Este objeto se usa para instanciar objetos CuentaCorriente
 * y CuentaAhorros
 * @author Mauri
 *
 */

public abstract class Cuenta implements Comparable<Cuenta>{

    public double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public Cuenta() {

    }

    /**
     * Constructor para inicializar el objeto Cuenta a partir da agencia y numero
     * @param agencia
     * @param numero
     */
    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }

    public abstract void deposita(double valor);

    /**
     * valor necesita ser menor o igual al saldo
     * @param valor
     * @return
     */
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
    
    @Override
    public String toString() {
    	String cuenta = "Numero: " + this.numero + ", Agencia: " + this.agencia
    			+ ", Titular: " + this.titular.getNombre(); 
    	return cuenta;
    }
    
    @Override
    public boolean equals(Object obj) {
    	Cuenta cuenta = (Cuenta) obj;
    	return this.agencia == cuenta.getAgencia() &&
    			this.numero == cuenta.getNumero();
    }
    
    @Override
    public int compareTo(Cuenta o) {
    	// Orden natural: numero agencia
    	return Integer.compare(this.agencia, o.getAgencia());
    	// Orden natural: saldo
    	//return Double.compare(this.saldo, o.getSaldo());
    }
    

}
