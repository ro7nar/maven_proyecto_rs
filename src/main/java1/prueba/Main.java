package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner lector = new Scanner(System.in);
		String Clave1 = "85DB";
		String salida = "-1";
		boolean Exit = false;
		int opcion;
		do {

			System.out.println("Ingrese Clave");

			String clave = teclado.nextLine();

			boolean respuesta = false;

			respuesta = clave.equals(Clave1);

			if (respuesta == true) {

				do {

					System.out
							.println("#################################\r\n" + "BANCO PRODUBANCO, elija una opción:\r\n"
									+ "1.	Realizar transferencia\r\n" + "2.	Consultar movimientos\r\n"
									+ "3.	SALIR\r\n" + "#################################\r\n" + "");
					opcion = teclado.nextInt();

					if (opcion == 1) {

						System.out.println("No tiene ningún pago pendiente");

					} else if (opcion == 2) {

						System.out.println("Ingrese la cuenta de destino de la transferencia y el monto a transferir.");
						System.out.println("Ingrese numero de Cuenta");
						double cuenta = teclado.nextDouble();
						System.out.println("Monto a transferir");
						double monto = teclado.nextDouble();
						double saldo = 2500 - monto;
						System.out.println("Transaccion exitosaa a la cuenta: " + cuenta);
						System.out.println("Su nuevo saldo es:" + saldo);
					}

				} while (opcion != 3);

			}

			Exit = clave.equals(salida);

		} while (Exit != true);

		System.out.println("Gracias por preferirnos");
	
		
	}
}
