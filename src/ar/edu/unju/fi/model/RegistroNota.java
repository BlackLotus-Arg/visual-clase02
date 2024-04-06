package ar.edu.unju.fi.model;

public class RegistroNota {
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private Float nota_final;
	
	public RegistroNota(String codigo, Alumno alumno, Materia materia, Float nota_final) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.nota_final = nota_final;
	}
	
	

	@Override
	public String toString() {
		return "Registro Nota \n-codigo: " + codigo + ", \n-" + alumno + ", \n-" + materia + ", \n-nota_final: "
				+ nota_final;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Float getNota_final() {
		return nota_final;
	}

	public void setNota_final(Float nota_final) {
		this.nota_final = nota_final;
	}
	
	
}
