package desafioLogicaUD4;

//Clase piloto

public class Piloto {

	private int idPiloto;
	private String nomPiloto;
	private String rangoPiloto;
	private String horasVuelo;
	
	//Metodo constructor
	
	public Piloto(int idPiloto, String nomPiloto, String rangoPiloto, String horasVuelo) {
		
		this.idPiloto = idPiloto;
		this.nomPiloto = nomPiloto;
		this.rangoPiloto = rangoPiloto;
		this.horasVuelo = horasVuelo;
	}

	//Metodos Getters y setters
	
	public int getIdPiloto() {
		return idPiloto;
	}


	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}


	public String getNomPiloto() {
		return nomPiloto;
	}


	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}


	public String getRangoPiloto() {
		return rangoPiloto;
	}


	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}


	public String getHorasVuelo() {
		return horasVuelo;
	}


	public void setHorasVuelo(String horasVuelo) {
		this.horasVuelo = horasVuelo;
	}
	
	//Metodo para mostrar los datos del piloto
	
	public void mostrarPiloto() {
		System.out.println("Los datos del piloto son: ");
		System.out.println("Identificador: "+ idPiloto);
		System.out.println("Nombre: "+nomPiloto);
		System.out.println("Rango: "+rangoPiloto);
		System.out.println("Hora de vuelo: "+horasVuelo);
		
	}
	
	
}
