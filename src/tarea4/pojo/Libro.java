package tarea4.pojo;

import java.util.ArrayList;

public class Libro {

	private String titulo;
	private long isbn;
	private String autor;
	private int añoPublicacion;
	private ArrayList<Pagina> paginas;
	
	public Libro(String titulo, long isbn, String autor, int añoPublicacion) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		paginas = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}


	public void añadirPagina(Pagina pagina){
		paginas.add(pagina);
	}
	
	
	
	
}
