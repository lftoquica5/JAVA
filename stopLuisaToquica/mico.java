package stopLuisaToquica;

import java.util.Scanner;

public class mico {
    public static void main(String[] args) {

        String [][] nombre = new String[2][3]; 
        nombre[1][1] = "MONICA"; //*Matriz
        String apellido ;
        String color;
        String fruta = "MANGO";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite apellido por la letra M");
        apellido = sc.next();


        for (int i = 0; i<=2; i++) {
            System.out.println("FRUTA:" + fruta);
        }  
        
        System.out.println("Digite color");
        color = sc.next();

        if(color != "blanco") {
            System.out.println("tu color púede ser correcto");
        }
        sc.close();
    }
  
}
