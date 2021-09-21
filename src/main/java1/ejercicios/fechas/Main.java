package ejercicios.fechas;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Deprecado y ya no se deberia utilizar
		Date date = new Date();
		// Libreria LocalDate
		//Sumar .plus
		LocalDate diaHoy = LocalDate.now();// Fecha actual
		LocalDate diaFin = diaHoy.plusDays(15);// aumentar 15 dias

		CursoVacional curso1 = new CursoVacional();

		curso1.setNombre("Volley principiantes");
		curso1.setFechaInicio(diaHoy);

		curso1.setFechaFin(diaFin);

		System.out.println("Nombre: " + curso1.getNombre());
		System.out.println("F I: " + curso1.getFechaInicio());
		System.out.println("F F: " + curso1.getFechaFin());

		//Otro Ejemplo
		//Restar .minus
		LocalDate diaHoy2 = LocalDate.now();
		LocalDate diaQInicio=diaHoy2.minusDays(2);
		LocalDate diaQFinaliza = diaQInicio.plusDays(20);
		CursoVacional curso2 = new CursoVacional();
		curso2.setNombre("Natacion principiantes");
		curso2.setFechaInicio(diaQInicio);

		curso2.setFechaFin(diaQFinaliza);
		
		System.out.println("Nombre: " + curso2.getNombre());
		System.out.println("F I: " + curso2.getFechaInicio());
		System.out.println("F F: " + curso2.getFechaFin());
		
		//Fechas especificas
		// .of
		
		LocalDate fechaEspecifica  = LocalDate.of(2022, 2, 15);
System.out.println(fechaEspecifica);
//Ejercicio
LocalDate fechaEspecificaIni  = LocalDate.of(2022, 2, 15);
LocalDate fechaEspecificaFin  = LocalDate.of(2022,7 , 10);
CursoVacional curso3 = new CursoVacional();
curso3.setNombre("Karate principiantes");
curso3.setFechaInicio(fechaEspecificaIni);
curso3.setFechaFin(fechaEspecificaFin);

LocalDate fechaVista = curso3.getFechaFin();
LocalDate nuevaFechaFin = fechaVista.plusDays(3);
 curso3.setFechaFin(nuevaFechaFin);
 


System.out.println("Nombre: " + curso3.getNombre());
System.out.println("F I: " + curso3.getFechaInicio());
System.out.println("F F: " + curso3.getFechaFin());
	
	
	}

}
