package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ladoCorto, ladoLargo , perimetro;
        
         System.out.println("Para calcular el perimetro de un rectangulo, ingrese su lado mas corto");
         ladoCorto = scanner.nextInt();
         ladoLargo=2*ladoCorto;
         perimetro = 3*ladoLargo;
         System.out.println("El valor del perimertro es "+perimetro);
         scanner.close();
     }
    
}
 


