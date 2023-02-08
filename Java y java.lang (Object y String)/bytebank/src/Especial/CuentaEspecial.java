package Especial;
import com.bytebank.modelo.*;

public class CuentaEspecial extends Cuenta{

	@Override
	public void deposita(double valor) {
		this.saldo = valor;
	}
	 
	 
	

}
