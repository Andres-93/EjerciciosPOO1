package tarea4.pojo;

import java.util.ArrayList;

public class Libro {

	private String titulo;
	private long isbn;
	private String autor;
	private int aņoPublicacion;
	private ArrayList<Pagina> paginas;
	
	public Libro(String titulo, long isbn, String autor, int aņoPublicacion) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.aņoPublicacion = aņoPublicacion;
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

	public int getAņoPublicacion() {
		return aņoPublicacion;
	}

	public void setAņoPublicacion(int aņoPublicacion) {
		this.aņoPublicacion = aņoPublicacion;
	}


	public void aņadirPagina(Pagina pagina){
		paginas.add(pagina);
	}
	
	
	
	
}
