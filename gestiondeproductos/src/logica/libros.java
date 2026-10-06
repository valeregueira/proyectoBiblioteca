package logica;

import java.util.ArrayList;

public class libros {
	private ArrayList <libros>libros = new ArrayList<>();


	 


	public libros(String nombre, String precio) {
		
	}





	public void cargarlibros(String nombre, String precio) {


	libros nuevolibro = new libros (nombre , precio);


	libros.add(nuevolibro);


	}


	 


	/*public void mostrarlibro() {


	for (int i = 0; i < libros.size(); i++) {


	System.out.println("Nombre: " + u.getNombre() + " - precio: " + u.getprecio());


	}


	}*/
}
	