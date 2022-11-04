package ejercicios;

import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] args) {

        System.out.println("Inicio de sesión");

        Scanner teclado = new Scanner(System.in);
        String usuario[] = { "LTOQUICA" };
        String contraseña[] = { "1996" };
        String persona = " ";
        String clave = " ";

        for (int i = 0; i < usuario.length; i++) {
            System.out.println("Ingresar usuario");
            persona = teclado.next();

            if (usuario[i].equals(persona)) {
                System.out.println("El usuario es correcto ingrese la contraseña");
                {
                    {
                        System.out.println("Ingresar contraseña");
                        clave = teclado.next();

                        if (contraseña[i].equals(clave))
                            System.out.println("Has ingresado al sistema correctamente");
                        else
                            System.out.println("Contraseña incorrecta");
                    }
                }
            } else {
                System.out.println("el usuario no existe");
            }
            teclado.close();
        }
    }
}
