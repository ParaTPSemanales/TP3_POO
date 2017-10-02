package juego;

/**
 * La clase Punial es un item. Agrega un Puñal a la unidad.
 * 
 * @author Grupo10
 * 
 */
public class Punial extends Item {

	/**
	 * Constructor que añade un Puñal a la unidad.
	 * 
	 * @param personaje
	 *            al que se le dará un Puñal.
	 */
	public Punial(Unidad personaje) {
		this.unidad = personaje;
		this.unidad.setPoder(this.unidad.getPoder() + 3);
	}

	/**
	 * Modifica los atributos de una unidad que posee un Puñal luego de recibir
	 * un ataque.
	 */
	@Override
	public void recibirAtaque(double golpe) {
		this.unidad.recibirAtaque(golpe + 3);
	}

}
