package ejercicios.variables.locales.globales;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		//En funcion de su clase
		//Globales: se declaran a nivel de clase, se subdividen en 2 ( instancia y las estaticas 
		//Variables globales de instancia: son variables que pertenecen a la instancia.
		//Variables globales estaticas; Son variables que pertenecen a la clase
		//Locales se declaran a nivel de métodos
		//Insatancia de la clase Alumnos 
		Alumnos Juan = new Alumnos();
		System.out.println("Valor del atributo estatico: "+ Alumnos.pais);
		System.out.println("Valor del atributo de instancia: "+ Juan.getNombre());
		System.out.println("Valor del atributo estatico:" + Alumnos.provincia);
		
	}

}
