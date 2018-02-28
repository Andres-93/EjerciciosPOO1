package tarea1.pojo;

public class Actor {

	private String nombre;
	private int a�oNacimiento;
	
	public Actor() {}
	
	public Actor(String nombre, int nacimiento) {		
		this.nombre = nombre;
		this.a�oNacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNacimiento() {
		return a�oNacimiento;
	}

	public void setNacimiento(int nacimiento) {
		this.a�oNacimiento = nacimiento;
	}

	//Mostrar actor
	public void mostrarActor() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + ", nacimiento=" + a�oNacimiento + "]";
	}
	
	
}
