package juego;

/**
 * La clase abstracta Item extiende de la clase Unidad. 
 * Funciona como Decorador de dicha clase, ya que permite "equipar" a las
 * unidades con distintos ítems.
 * 
 * @author Grupo10
 * 
 */
public abstract class Item extends Unidad{
	protected Unidad unidad;
	
	/** 
	 * Actualiza los atributos de la unidad luego de atacar.
	 */
	@Override
	public void ataque(Unidad personaje) {
		this.unidad.ataque(personaje);		
	}
	
	/**
	 * Verifica si la unidad puede atacar
	 */
	@Override
	public boolean puedeAtacar() {
		return this.unidad.puedeAtacar();
	}
	
	/** 
	 * Actualiza los atributos de la unidad luego de recibir agua.
	 */
	@Override
	public void recibeAgua() {
		this.unidad.recibeAgua();
	}
	
	/** 
	 * Actualiza los atributos de la unidad luego de recibir flechas.
	 */
	@Override
	public void recibeFlechas() {
		this.unidad.recibeFlechas();
	}
		
	/** 
	 * Obtiene el nombre de la unidad
	 */
	@Override
	public String getNombre() {
		return this.unidad.getNombre();
	}
	
	/** 
	 * Obtiene la salud de la unidad
	 */
	@Override
	public double getSalud() {
		return this.unidad.getSalud();
	}
	
	/**
	 * Modifica la salud de la unidad luego de ser atacada.
	 */
	@Override
	public void recibirAtaque(double golpe) {
		this.unidad.recibirAtaque(golpe);
	}

	/** 
	 * Obtiene el poder de la unidad
	 */
	@Override
	public double getPoder() {
		return this.unidad.getPoder();
	}
	
	/** 
	 * Obtiene la energía de la unidad
	 */
	@Override
	public double getEnergia() {
		return this.unidad.getEnergia();
	}
	
	/** 
	 * Modifica la energía de la unidad
	 */
	@Override
	public void setEnergia(double d) {
		this.unidad.setEnergia (d);
	}
	
	/** 
	 * Modifica el poder de la unidad
	 */
	@Override
	public void setPoder(double poder) {
		this.unidad.setPoder(poder);
	}
	
	/** 
	 * Verifica si la unidad está viva 
	 */
	@Override
	public boolean estaVivo() {
		return this.unidad.estaVivo();
	}
}
