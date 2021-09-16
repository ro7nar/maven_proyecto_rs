package prueba2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String claveIngresada;
		String opcionMenu;
		int saldoInicial = 2500;

		Scanner teclado = new Scanner(System.in);
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println("Ingrese clave: ");
			claveIngresada = teclado.nextLine();
			if (claveIngresada.equals("85DB")) {

				do {
					System.out.println("BANCO PICHINCHA, elija una opción:\r\n" + "1.	Consultar pagos\r\n"
							+ "2.	Realizar transferencia\r\n" + "3.	SALIR\r\n" + "");
					opcionMenu = teclado.nextLine();

					if (opcionMenu.equals("1")) {
						// Todo lo que me pide la opcion 1
						System.out.println("No tiene ningun pago pendiente");
					} else if (opcionMenu.equals("2")) {
						// Todo lo que me pide la opcion 2
						System.out.println("Ingrese la cuenta de destino: ");

						String cuentaDestino = teclado.nextLine();
						System.out.println("Ingrese el monto a transferir: ");
						int montoTransferir = lector.nextInt();

						saldoInicial = saldoInicial - montoTransferir;
						System.out.println("Su nuevo saldo es : " + saldoInicial);

					}

					// opcionMenu.equals("1")||opcionMenu.equals("2")
				} while (!opcionMenu.equals("3"));
				claveIngresada = "0";
			} else {
				System.out.println("La Clave no es la correcta");

			}

		} while (!claveIngresada.equals("-1"));

		System.out.println("Gracias por preferirnos");

	}

}
