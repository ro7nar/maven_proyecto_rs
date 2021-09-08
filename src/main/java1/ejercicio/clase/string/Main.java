package ejercicio.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 contains
		
		
		
		Scanner lector = new Scanner(System.in);
		String Frase = "Programacion metodo II";
		
		System.out.println("Ingrese el nombre del libro");
		String palabras = lector.nextLine();

		boolean resultado = Frase.contains(palabras);
		System.out.println("Contiene la palabra"+resultado);
// 2 equals
		
		System.out.println("**************************");
		String cadena1= "Carlos";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2= lector.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("las cadenas son iguales: "+resultado2);
		
		// 3. y 4. Upper Lower
		System.out.println("*********************");
		String nombre = "juanito";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en Mayuscu: "+nombreEnMayuscula );
		 String nombre2 = "JOSE";
		 String nombreEnMinuscula = nombre2.toLowerCase();
		 System.out.println("Nombre en minuscula: "+nombreEnMinuscula);
		
	}

}

