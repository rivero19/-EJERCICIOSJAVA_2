package Rivero_Alberto_ArraysPGRModular;
import java.util.Scanner;

public class Rivero_Alberto_ArraysPGRModular {
	
	public static void pedirNotas (int notas[], Scanner scanner) {
		
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
        
	};
	
	
	public static int calcularMedia(int notas[]) {
		int sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }
        return sumaNotas / notas.length;
		
	};
	
	public static int mostrarResultado(int media, int minima, int maxima) {
        if (media >= 5) {
            System.out.println("La media de tus notas es: " + media + " FELICIDADES HAS APROBADO!!  :D");
        } else {
            System.out.println("La media de tus notas es: " + media + " NO HAS APROBADO :(");
        }
        
        System.out.println("La nota minima ha sido: " + minima);
        System.out.println("La nota maxima ha sido: " + maxima);
        return media;
    };
	
    public static int notaMinima(int notas[]) {
        int minima = notas[0];
        
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < minima) {
                minima = notas[i];
            }
        }
        return minima;
    }

    public static int notaMaxima(int notas[]) {
        int maxima = notas[0];
        
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maxima) {
                maxima = notas[i];
            }
        }
        return maxima;
    }
    
    
/////////////////////////////////////////////////////////////////// PROGRMAMA PRINCIPAL
	public static void main(String[] args) {
		
		int[] notas = new int[7];
		Scanner scanner = new Scanner(System.in);
		
		pedirNotas(notas, scanner);
		int media = calcularMedia(notas);
		int minima = notaMinima(notas);
		int maxima = notaMaxima(notas);
		mostrarResultado(media, minima, maxima);
	}

}
