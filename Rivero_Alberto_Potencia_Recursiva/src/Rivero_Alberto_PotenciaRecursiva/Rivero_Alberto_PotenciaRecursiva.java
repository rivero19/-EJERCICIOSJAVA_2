package Rivero_Alberto_PotenciaRecursiva;
import java.util.Scanner;

public class Rivero_Alberto_PotenciaRecursiva {

	public static int calculaPotencia(int base, int expo) {
		int resultado = 0;
		if(expo == 0) {
								// CASO BASE
			return 1;
			
		}else {
			
			resultado = base * calculaPotencia(base, expo - 1); // AQUI APLICAMOS RECURSIVIDAD	
			System.out.println("Base = " + base + ", Exponente = " + expo + " resultado " + resultado);   //GRACIAS A ESTA SENTENCIA PODREMOS DESGLOSAR EL CAMINO HASTA CONSEGUIR EL REUSULTADO
			
			return resultado;
		}
		
	}
    public static void main(String[] args) {
    	int pedirNumero1 = 0;
    	int pedirNumero2 = 0;
    	Scanner scanner = new Scanner(System.in);

    	do {
    		
            System.out.print("Por favor introduce la base de la potencia: ");
            pedirNumero1 = scanner.nextInt();
            
        }while(pedirNumero1 <= 0);

        
        do {
        	
            System.out.print("Por favor introduce el exponente de la potencia: ");
            pedirNumero2 = scanner.nextInt();
            
        }while(pedirNumero2 < 0);
       
        
        int resultado = calculaPotencia(pedirNumero1, pedirNumero2);
        System.out.println("El resultado de la potencia " + pedirNumero1 + " elevado a " + pedirNumero2 + " es: " + resultado);
     }

}
