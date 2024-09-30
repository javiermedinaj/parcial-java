package recuperatorio;

import java.util.ArrayList;
import java.util.Optional;

public class Curso {

	private ArrayList<Alumno> curso;

	public Curso() {
		curso = new ArrayList<>();
	}

	public boolean estaCompleto() {
		return curso.size() >= 40;
	}

	public boolean matriculaAlumno(Alumno a) {
		boolean matriculado = false;
		if (buscaPorDni(a.getDni()).isEmpty() && !estaCompleto()) {
			curso.add(a);
			matriculado = true;
		}
		return matriculado;
	}

	public Optional<Alumno> buscaPorDni(int dni) {
		return curso.stream().filter(alumno -> alumno.getDni() == dni).findFirst();
	}

	public String datoAlumnos() {
		StringBuilder s = new StringBuilder();
		for (Alumno alumno : curso) {
			s.append(alumno).append("\n");
		}
		return s.toString();
	}
}