package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Random random = new Random();
        int n1 = random.nextInt(100);
        int n2 = random.nextInt(100);
        int n3;

        Scanner in = new Scanner(System.in);
        System.out.println("El primer número aleatorio es: " + n1);
        System.out.println("");
        System.out.println("El segundo número aleatorio es: " + n2);
        System.out.println("");
        System.out.println("Ingresar un número el cual quiera sumar");
        n3 = in.nextInt();
        int suma = n1 + n2 + n3;
        System.out.println("");

        System.out.println("Suma de los tres números es: " + suma);
        System.out.println("");
        in.close();
    }
}

