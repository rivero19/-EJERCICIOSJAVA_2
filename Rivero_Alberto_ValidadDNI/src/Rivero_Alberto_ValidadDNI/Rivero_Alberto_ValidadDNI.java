package Rivero_Alberto_ValidadDNI;
import java.util.Scanner;

public class Rivero_Alberto_ValidadDNI {
	
	
	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduce porfavor tu DNI: ");
	    String dniUsuario = scanner.nextLine();
		
		if (dniUsuario.length() != 9) {
	        System.out.println("Porfavor un DNI valido debe tener 8 dígitos seguidos de una letra.");
	        return;
	    }
		
		String numerosDni = dniUsuario.substring(0, 8);
		char letraDni = dniUsuario.charAt(8);
		// LE HACEMOS UN CASTING;	
		int numeroDni = Integer.parseInt(numerosDni);
		int restoDni = (numeroDni % 23);
		
		
		String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		//AQUI CALCULAMOS LA LETRA;
		char letraCadena = letrasDni.charAt(restoDni);
		
			if(letraDni == letraCadena) {
				System.out.println("El DNI " + numerosDni + " Con la letra " + letraDni + " es valido :D");
			}else {
				System.out.println("El DNI " + numerosDni + " Con la letra " + letraDni + " NO es valido :(");
			}
			

	    }
		     
}
