package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
        System.out.print("Diguem un valor: ");
        int A = in.nextInt();        
        System.out.print("Diguem un altre valor: ");
        int B = in.nextInt(2);
    int s= A+B; 
    int r=A-B;
        System.out.println(s);
        System.out.println(r);
    }
    private int suma(){}
    private int resta(){}
    
}