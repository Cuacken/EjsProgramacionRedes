package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class GeneradorContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Ingrese la longitud de la contraseña: ");
        int longitud = sc.nextInt();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +  
                            "abcdefghijklmnopqrstuvwxyz" +  
                            "0123456789" +                  
                            "!@#$%^&*()-_=+<>?";            

        String contraseña = "";

        for (int i = 0; i < longitud; i++) {
            int indice = rnd.nextInt(caracteres.length());
            contraseña += caracteres.charAt(indice);
        }

        System.out.println("Tu contraseña generada es: " + contraseña);

        sc.close();
    }
}