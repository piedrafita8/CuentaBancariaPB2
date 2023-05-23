package ar.edu.unlam.pb2.CuentaBancariaTest;

public class CajaAhorro extends CuentaBancaria{
	
	protected Integer cantExtracciones;
	private Double comision;
	
	public CajaAhorro() {
		super();
		this.cantExtracciones = 0;
		this.comision = 6.00;
	}
	
	public Boolean depositar(double monto) {
		if(monto <= 0) {
			return false;
		}
		
		super.saldo += monto;
		this.cantExtracciones = 0;
		return true;
	}

	@Override
	public Boolean extraer(Double monto) {
		// TODO Auto-generated method stub
		if(super.saldo < monto) {
			return false;
		}
		
		if(this.cantExtracciones >= 5) {
			if(super.saldo < monto + this.comision) {
				return false;
			}
			
		}
		
		super.saldo -= (monto + this.comision);
		this.cantExtracciones++;
		return true;
	}

}
