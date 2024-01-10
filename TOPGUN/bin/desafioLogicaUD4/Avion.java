package desafioLogicaUD4;

//Superclase o clase padre Avion
public class Avion {
	
	protected int idAvion;
	protected String modAvion;
	protected int capAvion;
	protected Piloto piloto;
	
	//Metodo constructor
	
	public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}

	//Metodos Getters y Setters para los atributos
	
	public int getIdAvion() {
		return idAvion;
	}


	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}


	public String getModAvion() {
		return modAvion;
	}


	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}


	public int getCapAvion() {
		return capAvion;
	}


	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}


	public Piloto getPiloto() {
		return piloto;
	}


	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	public void mostrarTipo() {
        System.out.println("Avion genérico");
    }
	
	//metodo para mostrar los datos del avión, así como el piloto asignado
	
	public void mostrarAvion() {
		
		
		System.out.println("Los datos del avion son: ");
		System.out.println("Identificador: "+idAvion);
		System.out.println("Modelo: "+modAvion);
		System.out.println("Capacidad: "+capAvion);
		piloto.mostrarPiloto();
		
		
	}
	
	

}
