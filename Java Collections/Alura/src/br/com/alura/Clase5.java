package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import modelo.Curso;

public class Clase5 {

	public static void main(String[] args) {
		Curso curso2 = new Curso("Ruby",10);
		Curso curso1 = new Curso("PHP",30);
		Curso curso3 = new Curso("JavaScript",20);
		Curso curso4 = new Curso("Java",50);
				
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		
		//Collections.sort(cursos);
		
		//cursos.sort(Comparator.comparing(Curso::getNombre));
		
		//List<Curso> cursoList = cursos.stream().sorted(Comparator.comparing(Curso::getTiempo)).collect(Collectors.toList());
		
		List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparing(Curso::getTiempo)).collect(Collectors.toList());
		
		System.out.println(cursoList);
				
	}
}
