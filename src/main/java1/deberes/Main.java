package deberes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		int opcion;
		int Vector[] = new int[5];
		do {
			System.out.println("******************************************\r\n"

					+ "1.       Ingresar Estudiante\r\n" + "\r\n" 
					+ "2.       Buscar Estudiante\r\n" + "\r\n"
					+ "3.       SALIR\r\n" + "\r\n"

					+ "******************************************");
			opcion = lector.nextInt();

			Datos cedula = new Datos();

			if (opcion == 1) {

				for (int i = 0; i <= 4; i++) {

					System.out.println("Ingrese la cedula del estudiante " + i);
					int Ncedula = lector.nextInt();
					Vector[i] = Ncedula;

				}

			} else if (opcion == 2) {

				System.out.println("Ingrese el numero de cedula que desa buscar");
				int Bcedula = lector.nextInt();
				
				boolean resultado = Vector.equals(Bcedula);
				if (resultado == true) {

					System.out.println("Si se encuentra registrado" + " el estudiante con numero de cedula: " + Bcedula);
				} else if (resultado == false) {
					System.out.println("No se encuentra" + " al estudiante con numero de cedula: " + Bcedula);

				}

			} else {

				System.out.println("No existe esa opcion");
			}

		} while (opcion != 3);

		System.out.println("Gracias por su visita");

	}

}
