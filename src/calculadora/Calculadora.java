package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
        System.out.print("Diguem un valor: ");
        int A = in.nextInt();        
        System.out.print("Diguem un altre valor: ");
        int B = in.nextInt();
        
    int s=A+B; 
    int r=A-B;
    int m=A*B;

        System.out.println(s);
        System.out.println(r);
        System.out.println(m);
    
   if (A==0 || B==0){
   System.out.println("Divisio impossible");
   } else {
       int d=A/B;
       System.out.println(d);     
    }
    
        
   }
}