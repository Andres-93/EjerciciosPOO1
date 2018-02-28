package tarea3.pojo;

public class Ordenador {
	
	private CPU cpu;
	private Teclado teclado;
	private Pantalla pantalla;
	private Raton raton;
	
	
	public Ordenador(CPU cpu, Teclado teclado, Pantalla pantalla, Raton raton) {
		this.cpu = cpu;
		this.teclado = teclado;
		this.pantalla = pantalla;
		this.raton = raton;
	}

	public CPU getCpu() {
		return cpu;
	}


	public Teclado getTeclado() {
		return teclado;
	}


	public Pantalla getPantalla() {
		return pantalla;
	}


	public Raton getRaton() {
		return raton;
	}

	
	
	@Override
	public String toString() {
		return "Ordenador [cpu=" + cpu + ", teclado=" + teclado + ", pantalla=" + pantalla + ", raton=" + raton + "]";
	}
	
	
	
	
}
