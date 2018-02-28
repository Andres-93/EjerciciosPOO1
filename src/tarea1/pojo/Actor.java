package tarea1.pojo;

public class Actor {

	private String nombre;
	private int añoNacimiento;
	
	public Actor() {}
	
	public Actor(String nombre, int nacimiento) {		
		this.nombre = nombre;
		this.añoNacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNacimiento() {
		return añoNacimiento;
	}

	public void setNacimiento(int nacimiento) {
		this.añoNacimiento = nacimiento;
	}

	//Mostrar actor
	public void mostrarActor() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + ", nacimiento=" + añoNacimiento + "]";
	}
	
	
}
