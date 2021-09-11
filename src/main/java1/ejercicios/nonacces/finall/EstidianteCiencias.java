package ejercicios.nonacces.finall;

public final class  EstidianteCiencias extends Estudiante{

	public final String horarioEntrada= "08:00";
	public String ciudadNacimiento = "Quito";
	
	
	public EstidianteCiencias() {
		//No se puede reasignar un valor a un atributo final 
		horarioEntrada = "08:01";
		
		ciudadNacimiento = "Guayaquil";
		
	}
	
	
}
