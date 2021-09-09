package deberes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int opcion;
		int posicionGuardar = 0;

		Datos Estudiante1 = new Datos();
		Estudiante1.setCedula("2001");
		Datos Estudiante2 = new Datos();
		Estudiante2.setCedula("2002");
		Datos Estudiante3 = new Datos();
		Estudiante3.setCedula("2003");
		Datos Estudiante4 = new Datos();
		Estudiante4.setCedula("2004");
		Datos Estudiante5 = new Datos();
		Estudiante5.setCedula("2005");
		Datos Vector[] = new Datos[5];
		Vector[0] = Estudiante1;
		Vector[1] = Estudiante2;
		Vector[2] = Estudiante3;
		Vector[3] = Estudiante4;
		Vector[4] = Estudiante5;
		do {
			System.out.println("******************************************\r\n"

					+ "1.       Ingresar Estudiante\r\n" + "\r\n" + "2.       Buscar Estudiante\r\n" + "\r\n"
					+ "3.       SALIR\r\n" + "\r\n"

					+ "******************************************");
			opcion = lector.nextInt();

			if (opcion == 1) {

				for (int i = 0; i < 5; i++) {

					System.out.println("Ingrese la cedula del estudiante " + i);
					String Ncedula = lector.nextLine();
					Datos estudiante = Vector[i];
					// estudiante = Guardado.setCedula(Ncedula);

				}

			} else if (opcion == 2) {

				System.out.println("Ingrese el numero de cedula que desa buscar");

				String Ncedula = lector.nextLine();

				String cedulaBuscar = Ncedula;

				boolean resultado = false;
				for (int i = 0; i < 5; i++) {

					Datos estudiante = Vector[i];
					String cedula = estudiante.getCedula();
					boolean resultadolocal = cedulaBuscar.equals(cedula);
					if (resultado == true) {
						resultado = true;
					}
				}
				if (resultado == true) {

					System.out
							.println("Si se encuentra registrado" + " el estudiante con numero de cedula: " + Ncedula);
				} else if (resultado == false) {
					System.out.println("No se encuentra" + " al estudiante con numero de cedula: " + Ncedula);

				}
			} else {

				System.out.println("No existe esa opcion");
			}

		} while (opcion != 3);

		System.out.println("Gracias por su visita");

	}

}
