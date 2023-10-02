import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EjemploArreglo{

      //Para abrir un bufer de entrada global
        public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        public static String entrada;
    // Metodo que regresa un arreglo de double y recibe un parametro entero    

    public static double[] leerPromedios(int n) throws IOException{
        double[]proms=new double[n];
        System.out.println("introduccion de los promedios individuales de cada estudiante");
        for (int i = 0; i<n;i++){
            System.out.println("escribe el promedio individual del estudiente con el id");
            entrada=bufer.readLine();
            proms[i]=Double.parseDouble(entrada);
        }
        return proms; //Regresa todos los elementos del arreglo proms
    }


    //Regresa UN double, y recibe un arreglo de double como parametro


    public static double calcularPromedioGrupo(double[]p){
        double suma =0;
        for (int i=0;i<p.length;i++)
            suma = suma+p[i];
        
        return suma / p.length;
    }


    // Metodo que no regresa valores y escribe un arreglo
    public static void imprimirPromedios(double[] proms ){
        int i=0;
        System.out.println("Promedios individuales del grupo");
        System.out.println("IdAlumno              Promedio individal");
        System.out.println("---------------------------------------------");
        for(double prom:proms){
            System.out.println("     "+i+"       "+prom);
            i++;
        }

    }


    public static void main(String[]args)throws IOException{
        final int T = 5; //declarando una constante
        double PromedioGrupo;

       

        //Declarando y construyendo un arreglo
        int[]arreglo = new int[5];

        //Un arreglo de chars
        char[] caracteres = new char[T];

        // Declaracion, construir e inicializar un arreglo de double
        // double[]promedios={9.1, 8.6, 7.4, 5.3, 9.2, 6.5};

        double[]promedios;

        //Declaracion de un arreglo de valores booleanos
        boolean[] datos;
        int t;

        // Inicializamos todas las casillas del arreglo en 0
        for(int i = 0; i<5; i++)
        arreglo[i] = 0;

        System.out.println("arreglo");
        System.out.println(arreglo);


        //Así se imprime el cotenido de un arreglo
        System.out.println("Contenido del arreglo");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("arreglo[" +i+"] =" + arreglo[i]);
        }
        //Leer los valores del arreglo caracteres
        System.out.println("Escribe los valores del arreglo caracteres");
        for (int i = 0; i < T; i++){
            System.out.println("Escribe el valor [" + i +"]:");
            entrada = bufer.readLine();
            caracteres[i] = entrada.charAt(0);
        }
         System.out.println("Contenido del arreglo");
        for(int i = 0; i < caracteres.length; i++){
            System.out.println("caracteres[" +i+"] =" + caracteres[i]);
        }
            System.out.println("Escribe el tamaño del arreglo de los datos: ");
            entrada = bufer.readLine();
            t = Integer.parseInt(entrada);

            datos = new boolean[t]; // Construimos el arreglo datos con el tamaño t

            //Rellenando datos con valores booleanos 
            for (int i = 0; i < t; i++) {
                System.out.println("Escribe el valor [" + i + "] de datos");
                entrada = bufer.readLine();
                datos[i] = Boolean.parseBoolean(entrada);
            }

        //Mostrando los valores del arreglo datos, usando un for extendido
        for( boolean unDato: datos )
            System.out.println(unDato);


        //Calcular el promedio de un grupo
        System.out.println();
        System.out.println("escribe el tamanio del grupo");
        entrada=bufer.readLine();
        t = Integer.parseInt(entrada); // t es el tamanio del grupo

        promedios=leerPromedios(T);
        imprimirPromedios( promedios);
        PromedioGrupo = calcularPromedioGrupo(promedios);
        System.out.println("el promedio del grupo es" + PromedioGrupo);
        }

    }
 


