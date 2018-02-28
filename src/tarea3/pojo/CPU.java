package tarea3.pojo;

public class CPU {

	private int frecuencia;
	private int nucleos;
	
	public CPU(int frecuencia, int nucleos) {
		super();
		this.frecuencia = frecuencia;
		this.nucleos = nucleos;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public int getNucleos() {
		return nucleos;
	}

	@Override
	public String toString() {
		return "CPU [frecuencia=" + frecuencia + ", nucleos=" + nucleos + "]";
	}
	
	
	
}
