package Universidad;

public class Administrativo extends PersonalContratado {
	public Administrativo(String nombre, String rut, String estado_civil, int yearIncorporacion) {
		super(nombre, rut, estado_civil, yearIncorporacion);
	}

	public String toString(){
		System.out.println("administrativo: "+super.getNombre()+" rut: "+super.getRut());
		return null;
	}
}