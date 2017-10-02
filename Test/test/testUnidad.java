package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Arquero;
import juego.Caballero;
import juego.Lancero;
import juego.Soldado;
import juego.Unidad;


public class testUnidad {
	
	Unidad soldado = new Soldado ("Soldado 1");
	Unidad arquero = new Arquero ("Arquero 1");
	Unidad lancero = new Lancero ("Lancero 1");
	Unidad caballero = new Caballero ("Lancero 1");
	
	@Before
	
	@Test
	public void DistanciaEntrePersonajes() {
    Assert.assertEquals(arquero.distanciaEntrePersonajes(arquero), 0);
	}
	
	@Test
	public void puedoMoverPersonaje(){
	arquero.moverPersonaje(4,0);
	Assert.assertEquals(arquero.getPosicionX(),4,0);
	}
	
	@Test
	public void puedeAtacarAOtroPersonaje() {
	soldado.moverPersonaje(4,0);
	double distancia=arquero.distanciaEntrePersonajes(soldado);
	Assert.assertTrue((distancia>=arquero.getDistanciaMinima() && distancia<=arquero.getDistanciaMaxima()) && arquero.puedeAtacar());	
	}
	
	@Test
	public void NopuedeAtacarAOtroPersonaje() {
	soldado.moverPersonaje(4,0);
	double distancia=arquero.distanciaEntrePersonajes(soldado);
	Assert.assertFalse((distancia>=soldado.getDistanciaMinima() && distancia<=soldado.getDistanciaMaxima()) && soldado.puedeAtacar());	
	}
		
	@Test
	public void puedeAtacarSoldadoAArquero() {
	double saludDespues = arquero.getSalud() - soldado.getPoder();
	soldado.atacaA(arquero);
	Assert.assertTrue(arquero.getSalud()==saludDespues);
	}
	
	@Test
	public void puedeAtacarArqueroASoldado() {
	arquero.moverPersonaje(3, 0);
	double saludDespues = soldado.getSalud() - arquero.getPoder();
	arquero.atacaA(soldado);
	Assert.assertTrue(soldado.getSalud()==saludDespues);
	}
	
	@Test
	public void informaQueNoPuedeAtacar() {
		double saludInicialSoldado=soldado.getSalud();
		System.out.println("****Control De Error*****(Debe seguir un mensaje): ");
		arquero.atacaA(soldado);
		Assert.assertTrue(soldado.getSalud()==saludInicialSoldado);
	}
	
	@Test
	public void UnidadMuere() {
		soldado.moverPersonaje(3,0);
		while (soldado.getSalud()>0) {
			arquero.atacaA(soldado);
			arquero.recibeFlechas();
		}
		Assert.assertTrue(!soldado.estaVivo());
	}
	
	
}
