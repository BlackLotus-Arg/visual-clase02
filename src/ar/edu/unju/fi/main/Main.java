package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Alumno alumno = generarAlumno();

		registrarNotas(alumno, 4);
			
		sc.close();
	}
	
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();		
		
		System.out.println("Ingrese el legajo del alumno:");
		Integer legajo = sc.nextInt();
		System.out.println("ingrese el apellido del alumno:");
		String apellido = sc.next();
		System.out.println("Ingrese el nombre del alumno;");
		String nombre = sc.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		System.out.println(alumno.toString());
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		int counter = 1;		
		do {
			System.out.println("\ningrese el codigo de la materia:");
			String codigo = sc.next();
			System.out.println("ingrese el nombre de la materia:");
			String nombreMateria = sc.next();
			
			Materia materia = new Materia(codigo, nombreMateria);
			
			System.out.println("\ningrese el codigo del registro:");
			String codigoMateria = sc.next();
			System.out.println("ingrese la nota final:");
			Float nota = sc.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoMateria, alumno, materia, nota);
			
			
			System.out.println(registroNota.toString()); 
			
			counter++;
		}while(counter<=numMaterias);
	}

}
