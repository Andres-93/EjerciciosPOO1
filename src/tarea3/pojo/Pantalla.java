package tarea3.pojo;

public class Pantalla {

	private int resolucion;
	private int pulgadas;
	
	public Pantalla(int resolucion, int pulgadas) {
		super();
		this.resolucion = resolucion;
		this.pulgadas = pulgadas;
	}

	public int getResolucion() {
		return resolucion;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	@Override
	public String toString() {
		return "Pantalla [resolucion=" + resolucion + ", pulgadas=" + pulgadas + "]";
	}
	
	
	
}
