package br.com.alura;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

import modelo.Alumno;
import modelo.Curso;


public class Clase19 {
	
	// TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
	// TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Historia",30);
		
		Alumno alumno1 = new Alumno("Luis Miguel","001");
		Alumno alumno2 = new Alumno("Pepito los palotes","002");
		Alumno alumno3 = new Alumno("Juan Carlos","003");
		Alumno alumno4 = new Alumno("Pedro Pedrito","004");
		Alumno alumno5 = new Alumno("Gustavo Sanchez","005");
		Alumno alumno6 = new Alumno("Marcia Maria","006");
		Alumno alumno7 = new Alumno("Gustavo Sanchez","007");
		
		
		Collection<Alumno> listaAlumnos = new HashSet<>();//  ArrayList<>();
		
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		curso1.addAlumno(alumno7);
		
		//curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
		
		Alumno alumnoMap = curso1.getAlumnoMap().get("003");
		
//		curso1.getAlumnoMap().forEach((codigo,alumno) -> {
//			System.out.println(alumno);
//		});
		
		curso1.getAlumnoMap().put("008", new Alumno("Juan Miguel", "008") );
		curso1.getAlumnoMap().put("009", new Alumno("Maria Jose", "009") );
		curso1.getAlumnoMap().put("010", new Alumno("Luis Pedro", "010") );

		curso1.getAlumnoMap().forEach((codigo, alumno) -> {
		    System.out.println(alumno);
		});
		
		//System.out.println(alumnoMap);
	}
}
