package ejercicios;

import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {

        String pregunta1, pregunta2,pregunta3, pregunta4,pregunta5, pregunta7;
        int  pregunta6;

        Scanner teclado  = new Scanner (System.in);
        String [] entrevista = new String [7];

        System.out.println("Ingresa tus nombres completos: ");
        pregunta1 = teclado .nextLine();

        System.out.println("Ingresa tus apellidos completos: ");
        pregunta2 = teclado .nextLine();

        System.out.println("Ingresa tu numero de ficha: ");
        pregunta3 = teclado .next();

        System.out.println("Numero de telefono: ");
        pregunta4 = teclado.next();

        System.out.println("Cuenta con contrato de aprendizaje?");
        pregunta5 = teclado.next();

        System.out.println("en que trimestre esta?");
        pregunta6 = teclado.nextInt();

        System.out.println("Que es lo que mas le gusta de ADSI / respuesta corta");
        pregunta7 = teclado .next();

        System.out.println(" ");

        entrevista[0]= "Nombres y apellidos:" + pregunta1 +" " + pregunta2;
        entrevista[1]= "Ficha: " + pregunta3;
        entrevista[2]= "Telefono: " + pregunta4;
        entrevista[3]= "Contrato de aprendizaje:" + pregunta5;
        entrevista[4]= "Trimestre: " + pregunta6;
        entrevista[5]= "Gusto: " + pregunta7;

        for(int i=0; i<6; i++)
        {
            System.out.println(entrevista[i]);
        }
        teclado .close();
    }
}

