package juego;

/**
 * La clase Caballero es una unidad
 * @author Grupo10
 *
 */
public class Caballero extends Unidad {

	public boolean caballoRebelde;
	public int contadorDeAtaques;

	/**
	 * Constructor del Caballero. 
	 * Inicializa los atributos del Caballero con los
	 * valores iniciales
	 * 
	 * @param nombre del Caballero
	 */
	public Caballero(String nombre) {
		this.setNombre(nombre);
		this.setSalud(200);
		this.setEnergia(100);
		this.setPoder(50);
		this.setPosicionX(0);
		this.setPosicionY(0);
		this.setDistanciaMinima(1);
		this.setDistanciaMaxima(2);
		this.setCaballoRebelde(false);
		this.setContadorDeAtaques(0);
	}

	/**
	 * Obtiene el atributo contadorDeAtaques.
	 * @return retorna la cantidad de ataques realizados por el caballero.
	 */
	public int getContadorDeAtaques() {
		return contadorDeAtaques;
	}
	
	/**
	 * Modifica el  atributo contadorDeAtaques.
	 * @param contadorDeAtaques
	 */
	public void setContadorDeAtaques(int contadorDeAtaques) {
		this.contadorDeAtaques = contadorDeAtaques;
	}	
	
	/**
	 * Verifica si el caballo está rebelde
	 * @return True: El caballo está rebelde
	 * 		   False: El caballo no está rebelde
	 */
	public boolean isCaballoRebelde() {
		return caballoRebelde;
	}

	/**
	 * Modifica el atributo caballoRebelde
	 * @param caballoRebelde
	 */
	public void setCaballoRebelde(boolean caballoRebelde) {
		this.caballoRebelde = caballoRebelde;
	}

	/** 
	 * Verifica si el caballero puede atacar.
	 * El caballero puede atacar si el caballo no está rebelde. 
	 */
	@Override
	public boolean puedeAtacar() {
		if (!caballoRebelde)
			return true;
		return false;
	}
	
	/** 
	 * Actualiza los atributos del caballero luego de atacar.
	 */
	@Override
	public void ataque(Unidad personaje) {
		this.contadorDeAtaques++;
		if (this.getContadorDeAtaques() == 3)
			caballoRebelde = true;
	}

	/**
	 * Modifica los atributos del caballero luego de recibir agua.
	 */
	@Override
	public void recibeAgua() {
		this.setCaballoRebelde(false);
		this.setContadorDeAtaques(0);
	}	
	
	/**
	 * El caballero recibe flechas.
	 */
	@Override
	public void recibeFlechas() {
	}

}
