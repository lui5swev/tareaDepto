package Universidad;

import java.util.ArrayList;

public class Departamento {
	private ArrayList<Estudiante> alumnos = new ArrayList<Estudiante>();
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();

	public void buscarPorCurso(String curso) {
		System.out.println("PERSONAL/ALUMNOS RELACIONADOS CON: "+"'"+curso+"'");
		for (Estudiante estudiante: alumnos) {
			if (curso == estudiante.getCurso()){
				estudiante.toString();
			}
		}
		for (Profesor profesor: profesores) {
			if (curso == profesor.getCurso()){
				profesor.toString();
			}
		}

	}

	public void mostrarPersonal() {
		System.out.println("PERSONAL DEL DEPARTAMENTO");
		try {
			for (Profesor profesor:profesores) {
				profesor.toString();
			}
		}catch (Exception e){}

		try {
			for (Administrativo administrativo:administrativos) {
				System.out.println("personal del departamento");
				administrativo.toString();
			}
		}catch (Exception e){}
	}

	public void anadirProfesor(Profesor p){
		profesores.add(p);
	}

	public void anadirAlumno(Estudiante e){
		alumnos.add(e);
	}

	public void anadirAdministrativo(Administrativo a){
		administrativos.add(a);
	}
}