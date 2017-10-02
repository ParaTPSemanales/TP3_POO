package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Soldado;

public class testSoldado {
	

	Soldado soldado1 = new Soldado ("Soldado 1");
	Soldado soldado2 = new Soldado ("Soldado 2");

	@Before
	
	@Test
	public void crearArqueroHeredandoDePersonaje() {
	Soldado soldado1 = new Soldado("Soldado 1");
	Assert.assertEquals(soldado1.getSalud(),200,0);
	}
	
	@Test
	public void ataque() {
	double salud=soldado2.getSalud()-10;
	double energia=soldado1.getEnergia()-10;
	soldado1.atacaA(soldado2);
	Assert.assertTrue(soldado1.getEnergia()==energia);
	Assert.assertTrue(soldado2.getSalud()==salud);
	}
	
	@Test
	public void recibeAgua(){
	soldado1.setEnergia(20);
	soldado1.recibeAgua();
	Assert.assertEquals(soldado1.getEnergia(),100,0);
	}
	
	@Test
	public void NoPuedeAtacar(){
	double saludInicial = soldado2.getSalud();
	soldado1.moverPersonaje(5,0);
	soldado1.atacaA(soldado2);
	Assert.assertTrue(soldado2.getSalud()==saludInicial);
	}

}