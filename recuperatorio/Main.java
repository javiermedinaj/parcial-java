package recuperatorio;

public class Main {
	public static void main(String[] args) {
		Alumno a = new Alumno("pepe", 123456789, "123-4567");
		Alumno b = new Alumno("juan", 987654321, "987-1234");
		Curso c = new Curso();
		if (c.matriculaAlumno(a))
			System.out.println(a + " matriculado");
		else
			System.out.println("no se pudo matricular");
		if (c.matriculaAlumno(b))
			System.out.println(b + " matriculado");
		else
			System.out.println("no se pudo matricular");
		System.out.println(c.datoAlumnos());
	}
}