package test;

import static org.junit.Assert.*;

import org.junit.Test;

import juego.Capa;
import juego.Soldado;
import juego.Unidad;

public class testCapa {

	@Test
	public void puedoAgregarAUnidadUnaCapa() {
		Unidad soldado1 = new Soldado ("Soldado1");
		double poderDespues= soldado1.getPoder()/1.1;
		double energiaDespues=200;
		soldado1 = new Capa (soldado1);
		assertEquals(soldado1.getEnergia(),energiaDespues,0);
		assertEquals(soldado1.getPoder(),poderDespues,0);
	}
	
}
