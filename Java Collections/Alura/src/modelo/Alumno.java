package modelo;

public class Alumno { //implements Comparable<Curso>

	private String nombre;
	private String codigo;
		
	public Alumno(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
	@Override
	public boolean equals(Object obj) {
		Alumno alumno = (Alumno) obj;
		return this.nombre.equals(alumno.getNombre());
	}
	
	@Override
		public int hashCode() {
			return this.nombre.hashCode();
		}
}
