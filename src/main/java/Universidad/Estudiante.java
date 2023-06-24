package Universidad;
public class Estudiante extends Persona {
	private String curso;

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Estudiante(String nombre, String rut, String estado_civil, String curso) {
		super(nombre, rut, estado_civil);
		this.curso = curso;
	}

	public String toString(){
		System.out.println("estudiante: "+super.getNombre()+" rut: "+super.getRut()+" curso: "+ getCurso());
		return null;
	}
}