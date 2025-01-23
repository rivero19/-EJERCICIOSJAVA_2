package Rivero_Alberto_Arrays1D;
import java.util.Scanner;

public class Rivero_Alberto_Arrays1D {

	public static void main(String[] args) {
		
		int[] notas = new int[7];
		int sumaNotas = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce por favor tu nota de PROGRAMACION: ");
        notas[0] = scanner.nextInt();
        
        System.out.print("Introduce por favor tu nota de BASES DE DATOS: ");
        notas[1] = scanner.nextInt();
        
        System.out.print("Introduce por favor tu nota de SISTEMAS INFORMATICOS: ");
        notas[2] = scanner.nextInt();
        
        System.out.print("Introduce por favor tu nota de FOL: ");
        notas[3] = scanner.nextInt();
        
        System.out.print("Introduce por favor tu nota de ENTORNOS: ");
        notas[4] = scanner.nextInt();
        
        System.out.print("Introduce por favor tu nota de INGLES: ");
        notas[5] = scanner.nextInt();
        
        System.out.print("Introduce por favor tu nota de LENGUAJE DE MARCAS: ");
        notas[6] = scanner.nextInt();
	    
        
        for (int i = 0; i < notas.length; i++) {
        	
            sumaNotas += notas[i];
       
        }
	    
        int media = sumaNotas / notas.length;
        
        if(media >= 5) {
        	System.out.println("La media de tus notas es: " + media + " FELICIDADES HAS APROBADO!!  :D");
        }else {
        	System.out.println("La media de tus notas es: " + media + " NO HAS APROBADO :(");	
        }
	}

}
