package ar.edu.unlam.pb2.CuentaBancariaTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaSueldoTest {

	@Test
	public void queElSaldoSeaCero() {
		CuentaSueldo cuenta = new CuentaSueldo();
		Double valorEsperado = 0.00D;
		Double valorActual = cuenta.getSaldo();
		assertEquals(valorEsperado, valorActual, 0.01);
	}
	
	@Test
	public void queSePuedaDepositar() {
		CuentaSueldo cuenta = new CuentaSueldo();
		Boolean valorEsperado = cuenta.depositar(15000.00);
		assertTrue(valorEsperado);
	}
	
	@Test
	public void queSePuedaExtraer() {
		CuentaSueldo cuenta = new CuentaSueldo();
		Double depositado = 5_000D;
		Double aExtraer = 4_000D;
		
		cuenta.depositar(depositado);
		Boolean valorEsperado = cuenta.extraer(aExtraer);
		
		assertTrue(valorEsperado);
	}
	


}
