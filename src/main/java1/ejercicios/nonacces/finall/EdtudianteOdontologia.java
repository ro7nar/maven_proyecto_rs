package ejercicios.nonacces.finall;

public class EdtudianteOdontologia extends EstidianteMedicina{

//No se puede sobreescribir un metodo final del padre 
	protected void  realizarPracticas() {
		
		System.out.println("Realiza 50 horas de practicas");
		
		
		
		
	}
	protected void realizarPasantias() {
		System.out.println("Realizar 100 horas de pasantias");
		
	}
	
	
}
