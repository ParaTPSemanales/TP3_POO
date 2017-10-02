package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Lancero;

public class testLancero {
	

	Lancero lancero1 = new Lancero ("Lancero 1");
	Lancero lancero2 = new Lancero ("Lancero 2");

	@Before
	
	@Test
	public void crearArqueroHeredandoDePersonaje() {
	Lancero lancero1 = new Lancero ("Lancero 1");
	Assert.assertEquals(lancero1.getSalud(),150,0);
	}
	
	@Test
	public void ataque() {
	double salud=lancero2.getSalud()-25;
	lancero2.moverPersonaje(2, 0);
	lancero1.atacaA(lancero2);
	Assert.assertEquals(lancero2.getSalud(),salud,0);
	}

}