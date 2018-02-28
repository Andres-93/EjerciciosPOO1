package tarea4.pojo;

import java.util.ArrayList;

public class Libro {

	private String titulo;
	private long isbn;
	private String autor;
	private int a�oPublicacion;
	private ArrayList<Pagina> paginas;
	
	public Libro(String titulo, long isbn, String autor, int a�oPublicacion) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.a�oPublicacion = a�oPublicacion;
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

	public int getA�oPublicacion() {
		return a�oPublicacion;
	}

	public void setA�oPublicacion(int a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}


	public void a�adirPagina(Pagina pagina){
		paginas.add(pagina);
	}
	
	
	
	
}
