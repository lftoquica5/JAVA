package ejercicios;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        
        int Edad, Alumnos;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos alumnos van a ingresar:  ");
        Alumnos = Integer.parseInt(scanner.nextLine());
       
        for(int i = 1; i <= Alumnos; i++){

        System.out.print("Cuantos años tiene:  ");
        Edad = Integer.parseInt(scanner.nextLine());

        if(Edad<=0) {

        System.out.println("Ingrese una edad valida ");
            
    }
    
    else if(Edad<=17) {

        System.out.println("Vayase a dormir");
    
    }
    
    else {
    
    System.out.printf("Bienvenido \n");
        

    }
        }
        scanner.close();
    }
}
