package Universidad;
public class PersonalContratado extends Persona {
	private int yearIncorporacion;

	public PersonalContratado(String nombre, String rut, String estado_civil, int yearIncorporacion) {
		super(nombre, rut, estado_civil);
		this.yearIncorporacion = yearIncorporacion;
	}
}