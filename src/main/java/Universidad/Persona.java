package Universidad;

public class Persona {
	private String nombre;
	private String rut;
	private String estado_civil;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEstado_civil() {
		return this.estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public Persona(String nombre, String rut, String estado_civil) {
		this.nombre = nombre;
		this.rut = rut;
		this.estado_civil = estado_civil;
	}
}