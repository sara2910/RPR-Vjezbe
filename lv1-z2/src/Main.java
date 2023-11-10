
 import java.util.Scanner;
public class Main {


    public static int sumaCifara( int number ) {
          int sumaCifara=0;
          while(number > 0 ) {
              sumaCifara +=(number%10);
              number=number/10;
          }

       return sumaCifara;

    }


    public static void main(String[] args) { // clasic main


        /* ovdje ide inicjalizacija nekog broja  */

         System.out.printf("Unesi broj: ");
          Scanner ulaz = new Scanner (System.in);
          int n;
          n= ulaz.nextInt();

System.out.println("Brojevi koji su dijeljivi sa sumom svojih cifara: ");
        for (int i = 1; i <= n; i++) {

             if ( i% sumaCifara(i)== 0)  {
                  System.out.println(i);
             }


        }
    } // fun end


} //  class end