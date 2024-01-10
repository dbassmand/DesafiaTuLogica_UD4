package desafioLogicaUD4;

import java.util.Scanner;

//Subclase o case hija de Avion llamada Combate

public class Entrenamiento extends Avion{
	
	private boolean dobleMando;
	private String respuesta;
	
	//Instancio un elemento Scanner
	
	Scanner entrada = new Scanner(System.in);

	//metodo constructor de la subclase
	
	
	public Entrenamiento (int idAvion, String modAvion, int capAvion, Piloto piloto) {
		super(idAvion, modAvion, capAvion, piloto);
	}
	
	//Metodo para comprobar si tiene o no doble mando
	
	public boolean tieneDobleMando() {
		do {
			System.out.println("Tiene doble mando? s/n");
			respuesta = entrada.nextLine();
			if (respuesta != "s"|| respuesta!="n") {
				System.out.println("Introduce una opcion valida. s/n");
			}
			
		}while(respuesta != "s"|| respuesta!="n");

			if(respuesta=="s") {
				dobleMando = true;
			}else {
				dobleMando = false;
			}
		
		return dobleMando;
	}
	
	@Override
	public void mostrarTipo() {
        System.out.println("Este avión es de tipo Entrenamiento");
    }


}
