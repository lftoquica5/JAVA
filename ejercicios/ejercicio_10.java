package ejercicios;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        
        int Edad, Alumnos; 
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos alumnos van a ingresar:  ");
        Alumnos = Integer.parseInt(scanner.nextLine());

        do {
                         
        System.out.print("Cuantos años tiene alumno " +i + ": ");

        Edad = Integer.parseInt(scanner.nextLine()); 

        
        if(Edad<=0) {

            System.out.println("Ingrese una edad valida  ");
        
        }

        else if(Edad<=18) {

            System.out.println("Vayase a dormir ");
        
        }
        
        else {
        
            System.out.println("Bienvenido ");

        }
        i++;

        }while(i <= Alumnos );
    scanner.close();
    }
}
