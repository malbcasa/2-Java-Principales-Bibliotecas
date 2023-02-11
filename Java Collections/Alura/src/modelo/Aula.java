package modelo;

public class Aula { //implements Comparable<Curso>

	private String nombre;
		
	public Aula(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
