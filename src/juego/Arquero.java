package juego;

/**
 * La clase arquero es una unidad.
 * @author Grupo10 
 */
public class Arquero extends Unidad {
		private int cantidadDeFlechas;
			
	/**
	 * Constructor del Arquero.
	 * Inicializa los atributos del arquero con
	 * con los valores iniciales
	 * @param nombre del Arquero
	 */
	public Arquero (String nombre) {
		this.setNombre(nombre);
		this.setSalud(50);
		this.setEnergia(100);
		this.setPoder(5);
		this.setPosicionX(0);
		this.setPosicionY(0);
		this.setDistanciaMinima(2);
		this.setDistanciaMaxima(5);
		this.setCantidadDeFlechas(20);
	}

	/**
	 * Obtiene el atributo cantidadDeFlechas.
	 * @return retorna la cantidadDeFlechas del Arquero.
	 */
	public int getCantidadDeFlechas() {
		return cantidadDeFlechas;
	}
	
	/**
	 * Modifica el atributo cantidadDeFlechas.
	 * @param cantidadDeFlechas
	 */
	public void setCantidadDeFlechas(int cantidadDeFlechas) {
		this.cantidadDeFlechas = cantidadDeFlechas;
	}
	
	/** 
	 * Verifica si el arquero puede atacar.
	 * El arquero puede atacar si poseen suficientes flechas. 
	 */
	@Override
	public boolean puedeAtacar() {
		if(this.getCantidadDeFlechas()>0)
			return true;
		return false;
	}
	
	/** 
	 * Actualiza los atributos del arquero luego de atacar.
	 */
	@Override
	public void ataque (Unidad personaje) {
			this.setCantidadDeFlechas(this.getCantidadDeFlechas()-1);
	}

	/** 
	 * Recarga el carcaj del arquero con 6 flechas.
	 */
	@Override
	public void recibeFlechas() {
		this.setCantidadDeFlechas(this.getCantidadDeFlechas()+6);
	}

	/** 
	 * El arquero consume una poción de agua
	 */
	@Override
	public void recibeAgua() {
	}	
	
}
