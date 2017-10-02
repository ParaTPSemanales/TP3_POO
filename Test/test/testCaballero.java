package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Caballero;

public class testCaballero {

	Caballero caballero1 = new Caballero ("caballero 1");
	Caballero caballero2 = new Caballero ("caballero 2");

	@Before
	
	@Test
	public void crearCaballeroHeredandoDePersonaje() {
	Caballero caballero1 = new Caballero ("Caballero 1");
	Assert.assertEquals(caballero1.getSalud(),200,0);
	}
	
	@Test
	public void puedoMoverCaballero() {
	caballero1.moverPersonaje(5,0);
	Assert.assertTrue(caballero1.getPosicionX()==5 && caballero1.getPosicionY()==0);
	}
	
	@Test
	public void puedeAtacar() {
	caballero2.moverPersonaje(2,0);
	double salud = caballero2.getSalud() - caballero1.getPoder();
	int cantAtaques = caballero1.getContadorDeAtaques() +1;
	caballero1.atacaA(caballero2);
	Assert.assertEquals(caballero1.getContadorDeAtaques(),cantAtaques);
	Assert.assertEquals(caballero2.getSalud(),salud,0);
	}
	
	@Test
	public void NopuedeAtacarConCaballoRebelde() {
	caballero2.moverPersonaje(2,0);
	double salud = caballero2.getSalud() - (caballero1.getPoder()*3);
	caballero1.atacaA(caballero2);
	caballero1.atacaA(caballero2);
	caballero1.atacaA(caballero2);
	Assert.assertEquals(caballero2.getSalud(),salud,0);
	caballero1.atacaA(caballero2);
	Assert.assertTrue(!caballero1.puedeAtacar());
	Assert.assertEquals(caballero2.getSalud(),salud,0);
	}
	
	@Test
	public void CaballoSePoneRebelde() {
	caballero2.moverPersonaje(2,0);
	int cantidadDeAtaques=3;
	caballero1.atacaA(caballero2);
	caballero1.atacaA(caballero2);
	caballero1.atacaA(caballero2);
	Assert.assertTrue(caballero1.isCaballoRebelde());
	Assert.assertTrue(caballero1.getContadorDeAtaques()==cantidadDeAtaques);
	}
	
	@Test
	public void recibeAgua() {
	caballero1.setCaballoRebelde(true);
	caballero1.recibeAgua();
	Assert.assertFalse(caballero1.isCaballoRebelde());
	Assert.assertEquals(caballero1.getContadorDeAtaques(),0);
	}
	

}
