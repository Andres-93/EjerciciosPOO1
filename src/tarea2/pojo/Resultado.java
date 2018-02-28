package tarea2.pojo;

public class Resultado {

	
	private double tiempo;
	private int posicion;
	private Carrera carrera;  //Carrera a la que pertenece el resultado
	private Atleta atleta;
	
	
	public Resultado(double tiempo, int posicion, Carrera carrera, Atleta atleta) {
		this.tiempo = tiempo;
		this.posicion = posicion;
		this.carrera = carrera;
		this.atleta = atleta;
	}


	public double getTiempo() {
		return tiempo;
	}


	public int getPosicion() {
		return posicion;
	}
	
	
}

