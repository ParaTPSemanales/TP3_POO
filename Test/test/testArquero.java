package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Arquero;

public class testArquero {
	

	Arquero arquero1 = new Arquero ("Arquero 1");
	Arquero arquero2 = new Arquero ("Arquero 2");

	@Before
	
	@Test
	public void crearArqueroHeredandoDePersonaje() {
	Arquero arquero3 = new Arquero ("Arquero 3");
	Assert.assertTrue(arquero3.getEnergia()==100);
	}
	
	@Test
	public void puedoMoverArquero() {
	arquero1.moverPersonaje(5,0);
	Assert.assertTrue(arquero1.getPosicionX()==5 && arquero1.getPosicionY()==0);
	}
	
	@Test
	public void ataque() {
	arquero2.moverPersonaje(3,0);
	arquero1.atacaA(arquero2);
	Assert.assertEquals(arquero1.getCantidadDeFlechas(),19);
	Assert.assertTrue(arquero2.getSalud()==45);
	}
	
	@Test
	public void NoPuedeAtacarSinFlechas() {
	arquero2.moverPersonaje(3,0);
	
	for (int i = 0; i < 20; i++) {
		arquero1.atacaA(arquero2);
	}
	
	Assert.assertTrue(!arquero1.puedeAtacar());
	}
	
	@Test
	public void recibeFlechas() {
	int cantDeFlechas=arquero1.getCantidadDeFlechas()+6;
	arquero1.recibeFlechas();
	Assert.assertEquals(arquero1.getCantidadDeFlechas(),cantDeFlechas);
	}

}
