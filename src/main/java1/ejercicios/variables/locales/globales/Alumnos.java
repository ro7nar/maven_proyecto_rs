package ejercicios.variables.locales.globales;

public class Alumnos {

	private String nombre = "Jaramillo";
			
	private String apellido;
	private int cedula;
	public static String pais = "Ecuador";
	public static String provincia = "Pichincha";
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void datosEstudiante() {
		this.nombre = "Jorge";
		this.apellido = "Salome";
		this.cedula = 1500955234;
		String Colegio = "Alvaro Balladares";
		String Clase = "A1";
		
		
	}
}
