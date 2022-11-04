package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int edadP,edadJ,edadA;
		System.out.println("¿Quien es mayor?");
		System.out.println("Digite la edad de Pedro");
		edadP=sc.nextInt();
		System.out.println("Digite la edad de Andres");
		edadA=sc.nextInt();
		System.out.println("Digite la edad de Juan");
		edadJ=sc.nextInt();
		if (edadP>edadJ && edadP>edadA) {
			System.out.println("Pedro es el mayor");
		}else if (edadA>edadJ && edadA>edadP) {
			System.out.println("Andres es el mayor");
		}else {
			System.out.println("Juan es el mayor");
		}
        sc.close();
	}
		
    
}
   
