package test;

import static org.junit.Assert.*;

import org.junit.Test;

import juego.Escudo;
import juego.Soldado;
import juego.Unidad;

public class testEscudo {

	
	@Test
	public void puedoAgregarAUnidadUnEscudo() {
		Unidad soldado1 = new Soldado ("Soldado1");
		Unidad soldado2 = new Soldado ("Soldado2");
		double saludDespues= 196;
		soldado1 = new Escudo (soldado1);
		soldado2.atacaA(soldado1);
		assertEquals(soldado1.getSalud(),saludDespues,0);
	}
	
	@Test
	public void aumentoDefensaConEscudo() {
		Unidad soldado1 = new Soldado ("Soldado1");
		Unidad soldado2 = new Soldado ("Soldado2");
		double saludDespues= 196;
		soldado1 = new Escudo (soldado1);
		soldado2.atacaA(soldado1);
		assertEquals(soldado1.getSalud(),saludDespues,0);
	}


}
