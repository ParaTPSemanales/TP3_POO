package test;

import static org.junit.Assert.*;

import org.junit.Test;

import juego.Arquero;
import juego.Punial;
import juego.Soldado;
import juego.Unidad;

public class testPunial {

	@Test
	public void puedoAgregarAUnidadUnPunial() {
	Unidad soldado = new Soldado ("Soldado");
	Unidad arquero  = new Arquero ("Arquero");
	double saludDespuesArquero= arquero.getSalud()-soldado.getPoder()-3;
	double saludDespuesSoldado = soldado.getSalud()-arquero.getPoder()-3;
	soldado = new Punial (soldado);
	soldado.atacaA(arquero);
	arquero.moverPersonaje(3,0);
	arquero.atacaA(soldado);
	assertTrue(soldado.getSalud()==saludDespuesSoldado);
	assertTrue(saludDespuesArquero==arquero.getSalud());
	}

	@Test
	public void punialDaMasFuerza() {
	Unidad soldado = new Soldado ("Soldado");
	Unidad arquero  = new Arquero ("Arquero");
	double saludDespuesArquero= arquero.getSalud()-soldado.getPoder()-3;
	soldado = new Punial (soldado);
	soldado.atacaA(arquero);
	assertTrue(saludDespuesArquero==arquero.getSalud());
	}
	
	@Test
	public void punialBajaDefensa() {
		Unidad soldado = new Soldado ("Soldado");
		Unidad arquero  = new Arquero ("Arquero");
		double saludDespuesSoldado = soldado.getSalud()-arquero.getPoder()-3;
		soldado = new Punial (soldado);
		arquero.moverPersonaje(3,0);
		arquero.atacaA(soldado);
		assertTrue(soldado.getSalud()==saludDespuesSoldado);
	}
}
