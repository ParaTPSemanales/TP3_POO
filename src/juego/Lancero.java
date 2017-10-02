package juego;

/**
 * La clase Lancero es una unidad.
 * @author Grupo10
 *
 */
public class Lancero extends Unidad {

	public Lancero(String nombre) {
		this.setNombre(nombre);
		this.setSalud(150);
		this.setEnergia(100);
		this.setPoder(25);
		this.setPosicionX(0);
		this.setPosicionY(0);
		this.setDistanciaMinima(1);
		this.setDistanciaMaxima(3);
	}

	/** 
	 * Verifica si el lancero puede atacar.
	 * El lancero siempre puede atacar. 
	 */
	@Override
	public boolean puedeAtacar() {
		return true;
	}
	
	/** 
	 * Actualiza los atributos del lancero luego de atacar.
	 */
	@Override
	public void ataque(Unidad personaje) {

	}
	
	/** 
	 * Actualiza los atributos del lancero luego de tomar agua.
	 */
	@Override
	public void recibeAgua() {

	}
	
	/** 
	 * El lancero recibe flechas.
	 */
	@Override
	public void recibeFlechas() {

	}

}
