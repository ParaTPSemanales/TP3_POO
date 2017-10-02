package juego;

/**
 * Contiene las características comunes de todas las unidades.
 * 
 * @author Grupo10
 *
 */
public abstract class Unidad {

	private String nombre;
	private double energia;
	private double salud;
	private double poder;
	private int distanciaMinima;
	private int distanciaMaxima;
	private double posicionX;
	private double posicionY;

	/**
	 * Obtiene el atributo distanciaMinima.
	 * 
	 * @return retorna la distanciaMinima de la Unidad.
	 */
	public int getDistanciaMinima() {
		return distanciaMinima;
	}

	/**
	 * Modifica el atributo distanciaMinima.
	 * 
	 * @param distanciaMinima
	 */
	public void setDistanciaMinima(int distanciaMinima) {
		this.distanciaMinima = distanciaMinima;
	}

	/**
	 * Obtiene el atributo distanciaMaxima.
	 * 
	 * @return retorna la distanciaMaxima de la Unidad.
	 */
	public int getDistanciaMaxima() {
		return distanciaMaxima;
	}

	/**
	 * Modifica el atributo distanciaMaxima.
	 * 
	 * @param distanciaMaxima
	 */
	public void setDistanciaMaxima(int distanciaMaxima) {
		this.distanciaMaxima = distanciaMaxima;
	}

	/**
	 * Obtiene el atributo nombre.
	 * 
	 * @return retorna el nombre de la Unidad.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el atributo nombre.
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el atributo Energía.
	 * 
	 * @return retorna la Energía de la Unidad.
	 */
	public double getEnergia() {
		return energia;
	}

	/**
	 * Modifica el atributo Energia.
	 * 
	 * @param Energia
	 */
	public void setEnergia(double d) {
		this.energia = d;
	}

	/**
	 * Obtiene el atributo Salud.
	 * 
	 * @return retorna la Salud de la Unidad.
	 */
	public double getSalud() {
		return salud;
	}

	/**
	 * Modifica el atributo salud.
	 * 
	 * @param salud
	 */
	public void setSalud(double salud) {
		this.salud = salud;
	}

	/**
	 * Obtiene el atributo Poder.
	 * 
	 * @return retorna el Poder de la Unidad.
	 */
	public double getPoder() {
		return poder;
	}

	/**
	 * Modifica el atributo poder.
	 * 
	 * @param poder
	 */
	public void setPoder(double poder) {
		this.poder = poder;
	}

	/**
	 * Obtiene el atributo PosicionX.
	 * 
	 * @return retorna la Posicion X de la Unidad.
	 */
	public double getPosicionX() {
		return posicionX;
	}

	/**
	 * Modifica el atributo posicionX.
	 * 
	 * @param posicionX
	 */
	public void setPosicionX(double posicion) {
		this.posicionX = posicion;
	}

	/**
	 * Obtiene el atributo PosicionY.
	 * 
	 * @return retorna la Posicion Y de la Unidad.
	 */
	public double getPosicionY() {
		return posicionY;
	}

	/**
	 * Modifica el atributo posicionY.
	 * 
	 * @param posicionY
	 */
	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	/**
	 * Calcula la distancia entre personajes
	 * 
	 * @param personaje2
	 *            del cual calcula la distancia
	 * @return distancia entre personajes
	 */
	public int distanciaEntrePersonajes(Unidad personaje2) {
		int distancia = 0;
		distancia = (int) Math.sqrt(Math.pow(Math.abs(this.getPosicionX() - personaje2.getPosicionX()), 2)
				+ Math.pow(Math.abs(this.getPosicionY() - personaje2.getPosicionY()), 2));
		return distancia;
	}

	/**
	 * Mueve el personaje a una posición determinada
	 * 
	 * @param distanciaEnX
	 * @param distanciaEnY
	 */
	public void moverPersonaje(double distanciaEnX, double distanciaEnY) {
		this.setPosicionX(this.getPosicionX() + distanciaEnX);
		this.setPosicionY(this.getPosicionY() + distanciaEnY);
	}

	/**
	 * Realiza un ataque de una unidad a otra
	 * 
	 * @param Unidad
	 *            que es atacada.
	 */
	public void atacaA(Unidad personaje) {
		if ((this.estaVivo() && this.distanciaEntrePersonajes(personaje) >= this.getDistanciaMinima()
				&& this.distanciaEntrePersonajes(personaje) <= this.getDistanciaMaxima()) && this.puedeAtacar()) {
			this.ataque(personaje);
			personaje.recibirAtaque(this.getPoder());
		} else {
			System.out.println("ERROR! EL PERSONAJE NO PUEDE ATACAR!");
		}
	}

	/**
	 * Modifica la salud de la unidad luego de ser atacada.
	 * 
	 * @param golpe
	 *            (Daño recibido)
	 */
	public void recibirAtaque(double golpe) {
		if (this.estaVivo())
			this.setSalud(this.getSalud() - golpe);
	}

	/**
	 * Informa si la unidad esta viva o no
	 * 
	 * @return Si la unidad esta viva retorna true. Si la unidad esta muerta
	 *         retorna false
	 */
	public boolean estaVivo() {
		if (this.getSalud() > 0)
			return true;
		return false;
	}

	/**
	 * Realiza el ataque a otra unidad
	 * 
	 * @param personaje
	 *            que será atacado
	 */
	public abstract void ataque(Unidad personaje);

	/**
	 * Verifica si la unidad puede realizar el ataque o no
	 * 
	 * @return Si la unidad puede realizar el ataque retorna true. Si la unidad
	 *         no puede realizar el ataque retorna false
	 */
	public abstract boolean puedeAtacar();

	/**
	 * La unidad recibe agua
	 */
	public abstract void recibeAgua();

	/**
	 * La unidad recibe flechas
	 */
	public abstract void recibeFlechas();

}
