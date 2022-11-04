package ejercicios;

import java.util.Scanner;

public class ejercicio_13_2 {

    public static void main(String[] args) {

        String hobbies[] = { "JUGAR FUTBOL", "CANTAR", "BAILAR", "HABLAR", "JUGAR PLAY", "VER FUTBOL" };
        String nombre;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite su nombre");
        nombre = sc.next();

        System.out.println("Hola " + nombre);

        for (int i =0; i < hobbies.length; i++) {
            System.out.println("Hobbie: " + i + " es " + hobbies[i]);
        }
        
        sc.close();
    }

}


