package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        int Edad;
        Scanner discoteca = new Scanner(System.in);

        System.out.printf("Cuantos años tiene:  ");

        Edad = Integer.parseInt(discoteca.nextLine());

        if (Edad >= 18) {

            System.out.printf("Bienvenido ");

        }

        else {

            System.out.printf("Acceso Denegado ");

        }

        discoteca.close();

    }
}
