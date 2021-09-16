package ejercicios.clases.weappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//byte
		
		byte datosByte = 2;//primitivo
		
		Byte datosByteWrappers = 3;//Wrapper
		System.out.println("primitivo: "+datosByte);
		System.out.println("Wrapper: "+datosByteWrappers);
		//Conversiones
		byte datosByte1 = 2;
		Byte datoConvertido = datosByte1;
		System.out.println("Byte convertido: "+datoConvertido);
		//Conversiones 2 
		
		Byte datoConvertido2 = 6;
		byte datoByte2 = datoConvertido2.byteValue();
		
		//short
		 short datosShort = 1;//primitivo
		 Short datosShortWrappers = 1;//Wrapper
		 System.out.println("primitivo: "+datosShort);
			
		 System.out.println("Wrapper: "+datosShortWrappers);
		 //Conversiones
		 short datoShort1 = 4;
		 Short shortConvertido = datoShort1;
		 System.out.println("short convertido: "+shortConvertido);
		 //Conversiones 2 
		 Short datosConvertidos2 = 233;
		 short datosShort2 = datosConvertidos2.shortValue();
		 
		 // int 
		 int edad = 45 ;//primitivo
		 Integer edadWrappers = 48;//Wrapper
		 System.out.println("primitivo: "+edad);
			System.out.println("Wrapper: "+edadWrappers);
		//Conversiones
			int edad1 =  45;
			Integer integerConvertido = edad1;
			System.out.println("Int convertido: "+integerConvertido);
			//Conversiones 2
			Integer integerConvertido2 = 23;
			int edad2 = integerConvertido2.intValue();
			System.out.println("Byte convertido: "+edad2);
			
			//long 
		 long valorGrande = 1234564L;//primitivo
		 Long valorGrandeWrappers = 1123345L;//Wrappers
		 System.out.println("primitivo: "+valorGrande);
			System.out.println("Wrapper: "+valorGrandeWrappers);
			//Conversiones
			long ValorGrande1 =  45;
			Long longConvertido = ValorGrande1;
			System.out.println("long convertido: "+longConvertido);
			//Conversiones 2
			Long longConvertido2 = 1231L;
			long datosLong = longConvertido2.longValue();
			System.out.println("Long convertido: "+datosLong);
		 //float
			float datosFloat = 1261f;//primitivo
			Float datosFloatWrappers = 13515f;//Wrappers
			System.out.println("primitivo: "+datosFloat);
			System.out.println("Wrapper: "+datosFloatWrappers);
			//Conversiones
			float datoFloat1 = 1232.34f;
			Float floatConvertido2 = datoFloat1;
			System.out.println("float convertido: "+floatConvertido2);
			//Conversiones 2
			Float floatConvertido3 = 23233.432f;
			float datosFloat4 = floatConvertido3.floatValue();
			System.out.println("Float convertido: "+datosFloat4);
			//double
			double datosDouble = 1315135d;//primitivo
			Double datosDoubleWrappers = 131531d;//Wrappers
			System.out.println("primitivo: "+datosDouble);
			System.out.println("Wrapper: "+datosDoubleWrappers);
			//Conversiones
			double datosDouble1 = 454;
			Double DoubleConvertido2 = datosDouble1;
			System.out.println("double convertido: "+DoubleConvertido2);
			//Conversiones 2
			Double doubleConvertido3 = 12321312d;
			double datosDouble2 = doubleConvertido3.doubleValue();
			System.out.println("Double convertido: "+datosDouble2);
			//boolean
			boolean datosBoolean = true ;//primitivo
			Boolean datosBooleanWrappers = false;//Wrappers
			System.out.println("primitivo: "+datosBoolean);
			System.out.println("Wrapper: "+datosBooleanWrappers);
			//Conversiones
			boolean datosBoolean2 =  true;
			Boolean booleanConvertido2 = datosBoolean2;
			System.out.println("boolean convertido: "+booleanConvertido2);
			//Conversiones 2
			Boolean booleanConvertido3 = true;
			boolean ValorConvertido3 = booleanConvertido3.booleanValue();
			System.out.println("Boolean convertido: "+ValorConvertido3);
			//char
			char datosChar = 'A';//primitivo
			Character datosCharWrappers = 'B';//Wrappers
			System.out.println("primitivo: "+datosChar);
			System.out.println("Wrapper: "+datosCharWrappers);
			//Conversiones
			char datosChar1 = 'C';
			Character CharConvertido2 = datosChar1;
			System.out.println("char convertido: "+CharConvertido2);
			//Conversiones 2
			Character charConvertido3 = 'H';
			char datosChar4 = charConvertido3.charValue();
			System.out.println("Character convertido: "+datosChar4);
			
		 
		
		
		
		
		
	}

}
