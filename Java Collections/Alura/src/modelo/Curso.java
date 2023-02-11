package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso { //implements Comparable<Curso>

	private String nombre;
	private int tiempo;
	private List<Aula> aulaList = new LinkedList<>(); // new ArrayList<>()
		
	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	public Curso(String nombre, int tiempo,List<Aula> aulaList) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.aulaList = aulaList;
	}
	public List<Aula> getAulaList() {
		return Collections.unmodifiableList(aulaList);
	}
	public void setClaseList(List<Aula> claseList) {
		this.aulaList = claseList;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public void addAula(Aula clase) {
		this.aulaList.add(clase);
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
//	@Override
//	public int compareTo(Curso o) {
//		return this.nombre.compareTo(o.getNombre());
//	}
}
