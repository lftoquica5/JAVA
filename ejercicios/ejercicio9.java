package ejercicios;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        int Edad, Alumnos; 
        int i = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos alumnos van a ingresar:  ");
        Alumnos = Integer.parseInt(scanner.nextLine());

        while(i <= Alumnos ){

        System.out.print("Cuantos años tiene:  " );
        Edad = Integer.parseInt(scanner.nextLine());
        i++;

        if(Edad<=0) {

            System.out.println("Ingrese una edad valida  ");

        }

        else if(Edad<=17) {

            System.out.println("Vayase a dormir");
        
        }
        
        else {
        
        System.out.printf("Bienvenido \n");
    }
    scanner.close();
    }
}
}
