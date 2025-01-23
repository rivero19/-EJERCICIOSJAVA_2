package Rivero_Alberto_Sobrecarga;
import java.util.Scanner;

public class Rivero_Alberto_Sobrecarga {

	public static double calculaArea(double num1, double num2) {
	// FORMULA PARA PI --> Math.PI
	// SECTOR CIRCULAR
			 
		double areaCirculo = (Math.PI * (num1 * num1) * num2) / 360;
		return areaCirculo;		 	
	}
	public static double calculaArea(double num1) {
	// FORMULA PARA PI --> Math.PI
	// CICULO
			 
		double areaCirculo = Math.PI * (num1 * num1);
		return areaCirculo;		 	
	}
	
	public static void main(String[] args) {
		
		 double areaCirculo = 0;
		 double areaCirculoSector = 0;
		
		 Scanner scannerRadio = new Scanner(System.in);
		 System.out.print("Introduce el radio: ");
		 double pedirRadio = scannerRadio.nextInt();
		 
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Quieres calcular el área de un sector? SI/NO: ");
	     String respuesta = scanner.next();
	     
		     if (respuesta.equalsIgnoreCase("si")) {
		
		    	 Scanner scannerGrado = new Scanner(System.in);
		    	 System.out.print("Introduce el grado: ");
		    	 double pedirGrados = scannerGrado.nextInt();
		
		         areaCirculoSector = calculaArea(pedirRadio, pedirGrados);
		         System.out.println("AREA del sector circular: " + areaCirculoSector);
		         
		     }else{
		    	 
		         areaCirculo = calculaArea(pedirRadio);
		         System.out.println("El AREA del círculo: " + areaCirculo);
		     }
		     
	}
		 
	 
}
