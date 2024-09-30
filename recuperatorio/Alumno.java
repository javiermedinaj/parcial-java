package recuperatorio;

public class Alumno {
     private String nombre;
     private int dni;
     private String tel;
     public Alumno(String nom, int doc, String cel)
     {
    	 nombre = nom;
    	 dni = doc;
    	 tel = cel;
     }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
    public String toString()
    {
    	return nombre+" "+ dni + " " + tel;
    }
}
