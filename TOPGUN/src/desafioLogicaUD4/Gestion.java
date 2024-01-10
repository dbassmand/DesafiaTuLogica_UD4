package desafioLogicaUD4;

import java.util.Scanner;

//Case Main

public class Gestion {

	public static void main(String[] args) {
		
		//Se definen las variables a utilizar
		//Almaceno aviones y pilotos en arrays
		
		String nombre;
		String rango;
		String horasVuelo;
		Piloto[] piloto = new Piloto[5];
		Avion [] entrenamiento = new Avion [2];
		int idAvion;
		String modAvion;
		int capAvion;
		int idPiloto;
		Scanner entrada = new Scanner(System.in);
		
		//Se crean los tres pilotos definidos en el enunciado
		
		Piloto piloto1 = new Piloto(1, "Pete Maverick", "Capitan", "10.000 horas de vuelo");
		Piloto piloto2 = new Piloto(2, "Natasha Phoenix", "Teniente", "3.000 horas de vuelo");
		Piloto piloto3 = new Piloto(3, "Bradley Rooster", "Teniente", "3.500 horas de vuelo");
		
		// Se agregan los primeros tres pilotos al arreglo
        piloto[0] = piloto1;
        piloto[1] = piloto2;
        piloto[2] = piloto3;
	
		System.out.println("Introduce los datos de dos pilotos adicionales: ");
		
		//bucle for para crear nuevos pilotos. La idea de hacer un bucle es solo por ne repetir el mismo codido 2 veces, pudiendose escalar facilmente
		
		for(int i=0;i<2;i++) {
			
			System.out.println("Datos del piloto "+(i+4)+": Nombre, rango y horas de vuelo");
			System.out.print("\nNombre: ");
			nombre= entrada.nextLine();
			System.out.print("\nRango: ");
			rango= entrada.nextLine();
			System.out.print("\nHoras de vuelo: ");
			horasVuelo = entrada.nextLine();
			
			piloto[i+3] = new Piloto((i + 4), nombre, rango, horasVuelo);
			
		}
		
		//Se muestran los datos de Maverick y Rooster segun enunciado
		
		System.out.println("====================================");
		System.out.println("");
		piloto[0].mostrarPiloto();
		System.out.println("");
		piloto[1].mostrarPiloto();
		
		
		//se crean 3 objetos de la clase avion, 1 de entrenamiento y 2 de combate
		
		Avion entrenamiento1 = new Entrenamiento(11, "Cessna Skyhawk", 2, piloto2);
		Avion entrenamiento2 = new Entrenamiento(21, "Slingsby T-67 Firefly", 2, piloto[4]);
		Avion combate1 = new Combate(21, "Eurofighter Typhoon", 2, piloto1);
		
		System.out.println("\nEs necesario crear dos aviones de entrenamiento adicionales.");
		
		//otro bucle for para crear los aviones adicionales
		
		for(int i=0;i<2;i++) {
			do {
			System.out.println("\nIntroduce los datos del avion de entrenamiento "+(i+3)+": Identificador numerico, modelo, capacidad y piloto");
			//System.out.print("\nIdentificador numerico: ");
			do {
			    System.out.print("Identificador numerico: ");
			    while (!entrada.hasNextInt()) { // Verificar si la entrada es un entero
			        System.out.println("Introduce un identificador numerico valido.");
			        entrada.next(); // Limpiar el buffer de entrada
			    }
			    idAvion = entrada.nextInt();
			} while (idAvion <= 0);
			
			//idAvion= entrada.nextInt();
			 entrada.nextLine();
			System.out.print("\nModelo: ");
			modAvion= entrada.nextLine();
			System.out.print("Capacidad: ");
			capAvion= entrada.nextInt();
			System.out.print("Elige piloto 1-5: "); //selector de piloto
			idPiloto = entrada.nextInt();
				if(idPiloto<0&&idPiloto>6) { //estructura de control en caso de entrada fuera de rango
					System.out.println("Introduce un piloto correcto: 1-5");
				}
			}while(idPiloto<0&&idPiloto>6);
			
			
			
			switch(idPiloto) { //mediante un switch se asigna el piloto seleccionado al nuevo avion creado
				case 1: entrenamiento[i] = new Entrenamiento(idAvion, modAvion, capAvion, piloto[0]);
				break;
				case 2: entrenamiento[i] = new Entrenamiento(idAvion, modAvion, capAvion, piloto[1]);
				break;
				case 3: entrenamiento[i] = new Entrenamiento(idAvion, modAvion, capAvion, piloto[2]);
				break;
				case 4: entrenamiento[i] = new Entrenamiento(idAvion, modAvion, capAvion, piloto[3]);
				break;
				case 5: entrenamiento[i] = new Entrenamiento(idAvion, modAvion, capAvion, piloto[4]);
			}
			
		}
		
		//se muestra en consola los aviones con sus caracteristicas y pilotos correspondientes.
		
		System.out.println("\nResultados finales: ");
		System.out.println("");
		entrenamiento1.mostrarAvion();
		entrenamiento1.mostrarTipo();
		System.out.println("");
		entrenamiento2.mostrarAvion();
		entrenamiento2.mostrarTipo();
		System.out.println("");
		entrenamiento[0].mostrarAvion();
		entrenamiento[0].mostrarTipo();
		System.out.println("");
		entrenamiento[1].mostrarAvion();
		entrenamiento[1].mostrarTipo();
		System.out.println("");
		combate1.mostrarAvion();
		combate1.mostrarTipo();
		
		
		entrada.close();
	}

}
