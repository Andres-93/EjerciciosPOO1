package tarea3.pojo;

public class GestorOrdenador {

	public static void main(String[] args) {
		
		CPU cpu = new CPU(20,700);
		Pantalla pantalla = new Pantalla (1080, 50);
		Raton raton = new Raton(30,30);
		Teclado teclado = new Teclado("español", 20);
		
		
		Ordenador ordenador = new Ordenador(cpu,teclado,pantalla,raton);
	}

}
