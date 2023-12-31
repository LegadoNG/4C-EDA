//Escribir un programa para calcular el promedio general de la carrera de TIADSM
import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Recibe en un arreglo 
        System.out.print("Ingrese la cantidad de alumnos en el grupo: ");
        int cantidadAlumnos = scanner.nextInt();

        double[] promediosAlumnos = new double[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese el promedio del alumno " + (i + 1) + ": ");
            promediosAlumnos[i] = scanner.nextDouble();
        }

        //Obtiene el promedio por grupo
        System.out.print("Ingrese la cantidad de grupos: ");
        int cantidadGrupos = scanner.nextInt();

        double[] promediosGrupos = new double[cantidadGrupos];

        for (int i = 0; i < cantidadGrupos; i++) {
            System.out.print("Ingrese la cantidad de alumnos en el grupo " + (i + 1) + ": ");
            int cantidadAlumnosEnGrupo = scanner.nextInt();

            double promedioGrupo = 0;

            for (int j = 0; j < cantidadAlumnosEnGrupo; j++) {
                System.out.print("Ingrese el promedio del alumno " + (j + 1) + ": ");
                promedioGrupo += scanner.nextDouble();
            }

            //Calcula el promedio del grupo
            promedioGrupo /= cantidadAlumnosEnGrupo;

            //Cada promedio por grupo se almacena en un arreglo llamado "grupos"
            promediosGrupos[i] = promedioGrupo;
        }

        //Del ARRGLO, obtener el promedio general
        double promedioGeneral = 0;

        for (double promedioGrupo : promediosGrupos) {
            promedioGeneral += promedioGrupo;
        }

        promedioGeneral /= cantidadGrupos;

        //Imprimir arreglo de promedios de grupo
        System.out.println("Promedios de grupos:");
        for (int i = 0; i < cantidadGrupos; i++) {
            System.out.println("Grupo " + (i + 1) + ": " + promediosGrupos[i]);
        }

        System.out.println("Promedio General: " + promedioGeneral);

        scanner.close();
    }
}

