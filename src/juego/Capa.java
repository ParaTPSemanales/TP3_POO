package juego;

/**
 * La clase Capa es un item. Agrega una capa a la unidad.
 * 
 * @author Grupo10
 * 
 */
public class Capa extends Item {
	/**
	 * Constructor que añade una capa a la unidad.
	 * @param personaje al que se le dará una capa.
	 */
	public Capa(Unidad personaje) {
		this.unidad = personaje;
		this.unidad.setEnergia(this.unidad.getEnergia() * 2);
		this.unidad.setPoder(this.unidad.getPoder() / 1.1);
	}

}
