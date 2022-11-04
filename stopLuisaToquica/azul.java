package stopLuisaToquica;

import java.util.Scanner;

public class azul {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String letra = "A ";
        String nombre = "AUGUSTO";
        final String apellido = nombre; //* constante
        String [][] fruta = new String[2][2]; 
        fruta[1][1] = "ANON"; //*Matriz
        String ciudad = "ARGENTINA";

        System.out.println("Nombres y apellidos:" + nombre +" " + apellido + " esta en la ciudad es " +ciudad);
        sc.close();
    }     
    
}
