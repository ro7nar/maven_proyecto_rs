package ejercicio.nomacces.staticos;

public class Paciente {

	private String nombre;
	private int edad;
	private static String nacionalidad="ECUATORIANO";
	private static int edadlimite;
	
	
	public void registrarse(String nombre) {
		
		System.out.println("Se registra el pasciente "+ nombre);
		
	}
	
	private static void consultarNacionalidad() {
		System.out.println();
	}
	
	public static void consultarNacionalidadd() {
		System.out.println("La nacionalidad es "+ nacionalidad);
	}
	//Metodos Set y Get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
