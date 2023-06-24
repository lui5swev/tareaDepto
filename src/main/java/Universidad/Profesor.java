package Universidad;

public class Profesor extends PersonalContratado {
	private String curso;

	public Profesor(String nombre, String rut, String estado_civil, int yearIncorporacion, String curso) {
		super(nombre, rut, estado_civil, yearIncorporacion);
		this.curso = curso;
	}
	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString(){
		System.out.println("profesor: "+super.getNombre()+" rut: "+super.getRut()+" curso: "+ getCurso());
		return null;
	}
}