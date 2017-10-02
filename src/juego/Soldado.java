package juego;

/**
 * La clase Soldado es una unidad.
 * 
 * @author Grupo10
 *
 */
public class Soldado extends Unidad {

	public Soldado(String Nombre) {
		this.setNombre(Nombre);
		this.setSalud(200);
		this.setEnergia(100);
		this.setPoder(10);
		this.setPosicionX(0);
		this.setPosicionY(0);
		this.setDistanciaMinima(0);
		this.setDistanciaMaxima(0);
	}

	/**
	 * Verifica si el soldado puede recibir paquete
	 * 
	 * @return True: puede recibir paquete False: no puede recibir paquete
	 */
	public boolean recibePaquete() {
		return true;
	}

	/**
	 * Verifica si el soldado puede atacar. 
	 * El soldado puede atacar si posee energía.
	 */
	@Override
	public boolean puedeAtacar() {
		if (this.getEnergia() > 0)
			return true;
		return false;
	}

	/**
	 * Actualiza los atributos del soldado luego de atacar.
	 */
	@Override
	public void ataque(Unidad personaje) {
		this.setEnergia(this.getEnergia() - 10);
		if (this.getEnergia() < 0)
			this.setEnergia(0);
	}
	
	/**
	 * Actualiza los atributos del soldado luego de recibir agua.
	 */
	@Override
	public void recibeAgua() {
		this.setEnergia(100);
	}

	/**
	 * El soldado recibe flechas
	 */
	@Override
	public void recibeFlechas() {

	}

}
