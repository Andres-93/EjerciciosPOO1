package tarea1.pojo;

public class Pelicula {

	static final int MAX_ACTORES = 15;
	
	private String titulo;
	private String director;
	private int duraccion;
	private Actor[] actores;
	private int numActores;
	

	public Pelicula() {
		actores = new Actor[MAX_ACTORES];
		numActores = MAX_ACTORES;	
	}
	
	public Pelicula(String titulo, String director, int duraccion) {
		this.titulo = titulo;
		this.director = director;
		this.duraccion = duraccion;
		actores = new Actor[MAX_ACTORES];
		numActores = MAX_ACTORES;
	}
	
	public static int getMaxActores() {
		return MAX_ACTORES;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuraccion() {
		return duraccion;
	}

	public void setDuraccion(int duraccion) {
		this.duraccion = duraccion;
	}

	public Actor[] getActores() {
		return actores;
	}

	public void setActores(Actor[] actores) {
		this.actores = actores;
	}
	
	public void mostrarPelicula() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Director: " + this.director);
		System.out.println("Duraccion: " + this.duraccion);
	}
	
}
