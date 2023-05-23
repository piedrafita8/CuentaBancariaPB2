package ar.edu.unlam.pb2.CuentaBancariaTest;

public class CuentaSueldo extends CuentaBancaria{
	public CuentaSueldo() {
		super();
	}
	
	public Boolean extraer(Double montoAExtraer) {
		if(this.saldo < montoAExtraer) {
			return false;
		}
		
		this.saldo -= montoAExtraer;
		
		return true;
	}
}
