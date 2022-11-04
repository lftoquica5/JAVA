package ejercicios;

import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {

        String[] hobbies = new String[6];
        String nombre;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite su nombre");
        nombre = sc.next();

        for (int i = 0; i <hobbies.length; i++) {
            System.out.println("Digite su hobbie número " + i);
            hobbies[i] = sc.next(); 
        }

        System.out.println("Hola " + nombre);

        for (int i = 0; i < hobbies.length; i++) {
            System.out.println("Hobbie: " + i + " es " + hobbies[i]);
        }
        
        sc.close();
    }

}