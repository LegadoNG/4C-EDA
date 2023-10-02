public class factorialRecursivo{

private static int factorial( int num){
    if ( num == 0){
        return 1;
    } else {
        return num * factorial( num - 1);
    }
}

public static void main(String[]args){
    int n = 5;
    int r;
    System.out.println(" Programa que calcula el factorial de un numero");
    r = factorial ( n );
    System.out.println(" el factorial de " + n + " es: " + r );
} 
}   