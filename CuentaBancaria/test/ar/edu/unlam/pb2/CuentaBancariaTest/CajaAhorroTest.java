package ar.edu.unlam.pb2.CuentaBancariaTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaAhorroTest {

	@Test
	public void queAlCrearLaCajaTengaSaldoCero() {
		Double valorEsperado = 0.00D;
		CajaAhorro caja = new CajaAhorro();
		Double valorActual = caja.getSaldo();
		assertEquals(valorEsperado,valorActual, 0.01);
	}
	
	@Test
	public void queSePuedaDepositar() {
		CajaAhorro caja = new CajaAhorro();
		Boolean valorEsperado = caja.depositar(2_340.5);
		assertTrue(valorEsperado);
	}
	
	@Test
	public void queSePuedaExtraer() {
		CajaAhorro caja = new CajaAhorro();
		Double depositado = 5_000D;
		Double extraido = 4_000D;
		
		caja.depositar(depositado);
		Boolean valorEsperado = caja.extraer(extraido);
		
		assertTrue(valorEsperado);
	}

}
