import Universidad.*;
public class main {
    public static void main(String[] args) {
        Departamento ciencias = new Departamento();
        Profesor profe1 = new Profesor("raul", "20.345.643-3","viudo",2003, "programacion");
        Profesor profe2 = new Profesor("juan", "17.565.903-6","soltero",2023, "historia");
        Profesor profe3 = new Profesor("jojo", "6.345.675-8","es complicado",2013, "geografia");
        ciencias.anadirProfesor(profe1);
        ciencias.anadirProfesor(profe2);
        ciencias.anadirProfesor(profe3);

        Administrativo admin1 = new Administrativo("jeremias","19.890.394-4","casado", 2019);
        ciencias.anadirAdministrativo(admin1);

        Estudiante alumno1 = new Estudiante("andrea", "19.329.784-3", "casado", "programacion");
        Estudiante alumno2 = new Estudiante("claudia", "21.349.623-k", "soltero", "programacion");
        ciencias.anadirAlumno(alumno1);
        ciencias.anadirAlumno(alumno2);


        ciencias.mostrarPersonal();

        ciencias.buscarPorCurso("programacion");

    }
}
