package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args)
    { 
     Scanner in = new Scanner (System.in);
     double F, C;

    System.out.println("Ingresar la cantidad que quiera convertir");
    F = in.nextDouble();
    System.out.println("");
    
     C = (F-32)/1.8;
     
     System.out.println( F + "Grados Fahrenheit, " + "es igual a: "+ C +" Grados centigrados");
     System.out.println("");

     in.close();
    }
}
    
