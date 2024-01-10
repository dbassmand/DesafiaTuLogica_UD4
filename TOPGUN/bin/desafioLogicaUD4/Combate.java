package desafioLogicaUD4;

import java.util.Scanner;

//Subclase o case hija de Avion llamada Combate

public class Combate extends Avion{
	
	private boolean furtivo;
	private String respuesta;

	//Instancio un elemento Scanner
	
	Scanner entrada = new Scanner(System.in);
	
	//metodo constructor de la subclase
	
	public Combate (int idAvion, String modAvion, int capAvion, Piloto piloto) {
		super(idAvion, modAvion, capAvion, piloto);
	}
	
	
	//metodo para comprobar si es furtivo o no
	
	public boolean esFurtivo() {
		
		do {
			System.out.println("El caza de combate es furtivo? s/n");
			respuesta = entrada.nextLine();
			if (respuesta != "s"|| respuesta!="n") {
				System.out.println("Introduce una opcion valida. s/n");
			}
			
		}while(respuesta != "s"|| respuesta!="n");

			if(respuesta=="s") {
				furtivo = true;
			}else {
				furtivo = false;
			}
		
		return furtivo;
	}
	
	//Metodo para añadir comentario en la definición del avion creado.
	//Este metodo se comporta de distinta forma segun la clase y sobre escribe al de la Superclase
	@Override
	public void mostrarTipo() {
        System.out.println("Este avión es de tipo Combate");
	}    
	
}
