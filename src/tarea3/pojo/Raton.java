package tarea3.pojo;

public class Raton {

	private int dpi;
	private int numBotones;
	
	public Raton(int dpi, int numBotones) {
		super();
		this.dpi = dpi;
		this.numBotones = numBotones;
	}

	public int getDpi() {
		return dpi;
	}

	public int getNumBotones() {
		return numBotones;
	}

	@Override
	public String toString() {
		return "Raton [dpi=" + dpi + ", numBotones=" + numBotones + "]";
	}
	
	
	
}
