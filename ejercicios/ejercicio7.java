package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        int numero1, numero2, resultado;

        Scanner menu = new Scanner(System.in);
        String operacion;

        System.out.printf("Menu ");
        System.out.printf("1 para Sumar ");
        System.out.printf("2 para Restar ");
        System.out.printf("3 para Multiplicar ");
        System.out.printf("4 para Dividir ");
        System.out.printf("Seleccione la operacion que desea realizar:  ");
        operacion = menu.nextLine();

        switch(operacion){

            case "1":
            System.out.printf(" Añadir 1 numero a sumar:  ");
            numero1 = Integer.parseInt(menu.nextLine());
            System.out.printf(" Añadir 2 numero a sumar:  ");
            numero2 = Integer.parseInt(menu.nextLine());
            resultado = (numero1 + numero2);
            System.out.printf(" el resultado es: "+resultado);
            break;

            case "2":
            System.out.printf(" Añadir 1 numero a restar:  ");
            numero1 = Integer.parseInt(menu.nextLine());
            System.out.printf(" Añadir 2 numero a restar:  ");
            numero2 = Integer.parseInt(menu.nextLine());
            resultado = (numero1 - numero2);
            System.out.printf(" el resultado es: "+resultado);
            break;

            case "3":
            System.out.printf(" Añadir 1 numero a Multiplicar:  ");
            numero1 = Integer.parseInt(menu.nextLine());
            System.out.printf(" Añadir 2 numero a Multiplicar:  ");
            numero2 = Integer.parseInt(menu.nextLine());
            resultado = (numero1 * numero2);
            System.out.printf(" el resultado es: "+resultado);

            break;

            case "4":
            System.out.printf(" Añadir 1 numero a Dividir:  ");
            numero1 = Integer.parseInt(menu.nextLine());
            System.out.printf(" Añadir 2 numero a Dividir:  ");
            numero2 = Integer.parseInt(menu.nextLine());
            resultado = (numero1 / numero2);
            System.out.printf(" el resultado es: "+resultado);
            break;

            default:
            System.out.printf("Ingrese un valor valido");
        }  

        menu.close();
}
} 

