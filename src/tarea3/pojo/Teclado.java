package tarea3.pojo;

public class Teclado {

	private String idioma;
	private int numTeclas;
	
	public Teclado(String idioma, int numTeclas) {
		super();
		this.idioma = idioma;
		this.numTeclas = numTeclas;
	}

	public String getIdioma() {
		return idioma;
	}

	public int getNumTeclas() {
		return numTeclas;
	}

	@Override
	public String toString() {
		return "Teclado [idioma=" + idioma + ", numTeclas=" + numTeclas + "]";
	}
	
	
	
	
	
}
