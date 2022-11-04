package ejercicios;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        int Edad;
        Scanner discoteca = new Scanner(System.in);

        System.out.printf("Cuantos años tiene:  ");

        Edad = Integer.parseInt(discoteca.nextLine());

        if (Edad <= 0) {

            System.out.printf("Ingrese una edad valida  ");

        }

        else if (Edad <= 18) {

            System.out.printf("Vayase a dormir ");

        }

        else {

            System.out.printf("Bienvenido ");

        }
        discoteca.close();
    }

}
