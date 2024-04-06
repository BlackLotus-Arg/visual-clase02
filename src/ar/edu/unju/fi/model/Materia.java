package ar.edu.unju.fi.model;

public class Materia {
	private String Codigo;
	private String nombre;
	
	public Materia(String codigo, String nombre) {
		super();
		Codigo = codigo;
		this.nombre = nombre;
	}
	
	

	@Override
	public String toString() {
		return "Materia: [Codigo: " + Codigo + ", nombre: " + nombre + "]";
	}



	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
