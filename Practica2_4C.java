// Practica 2 ARREGLO//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lee el tamaño del arreglo de enteros
        System.out.print("Introduce el tamaño del arreglo: ");
        int tamano = scanner.nextInt();
        
        // Declara y construye el arreglo de enteros
        int[] arreglo = new int[tamano];
        
        // Lee los valores enteros del arreglo
        System.out.println("Introduce los valores enteros del arreglo:");
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = scanner.nextInt();
        }
        
        // Encuentra el valor máximo y mínimo en todo el  arreglo
        int maximo = arreglo[0];
        int minimo = arreglo[0];
        
        for (int i = 1; i < tamano; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        
        // Cuenta los valores impares y pares en el arreglo
        int impares = 0;
        int pares = 0;
        
        for (int i = 0; i < tamano; i++) {
            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        // Imprime los resultados enteros
        System.out.println("Valor máximo en el arreglo: " + maximo);
        System.out.println("Valor mínimo en el arreglo: " + minimo);
        System.out.println("Cantidad de valores impares: " + impares);
        System.out.println("Cantidad de valores pares: " + pares);
    }
}
