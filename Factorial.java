public class FactorialIterativo{

    private static int factorial( int num){
        int fact =1;
        if (num !=0){
            for(int i = num; i>0;i--){
                fact = fact*i;
            }
        }

         return fact;
}

public static void main(String[]args){
    int n = 5;
    int r;
    r = factorial(n);
    System.out.println(" el factorial de " + n + " es " + r) ;
 }
}
