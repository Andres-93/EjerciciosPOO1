package tarea2.pojo;

import java.util.ArrayList;

public class Atleta {

	private String nombre;
	private long nacimiento;
	private ArrayList<Carrera> carreras;   //Carreras que ha corrido el atleta
	
	
	
	public Atleta(String nombre, long nacimiento) {
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		carreras = new ArrayList<Carrera>();
	}

	public String getNombre() {
		return nombre;
	}

	public long getNacimiento() {
		return nacimiento;
	}
	
	
}
