package juego;

/**
 * La clase Escudo es un item. Agrega un Escudo a la unidad.
 * 
 * @author Grupo10
 * 
 */
public class Escudo extends Item {

	/**
	 * Constructor que añade un Escudo a la unidad.
	 * 
	 * @param personaje
	 *            al que se le dará un Escudo.
	 */
	public Escudo(Unidad personaje) {
		this.unidad = personaje;
	}

	/**
	 * Modifica los atributos de una unidad que posee un escudo luego de recibir
	 * un ataque.
	 */
	@Override
	public void recibirAtaque(double golpe) {
		this.unidad.recibirAtaque(golpe * 0.4);
	}

}
