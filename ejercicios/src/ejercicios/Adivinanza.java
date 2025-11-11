package ejercicios;

import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1; 
        int intento = 0;
        int numeroUsuario = 0;

        System.out.println("Adivina el número entre 1 y 100");

        
        while (numeroUsuario != numeroSecreto) {
            System.out.print("Ingresa tu número: ");
            numeroUsuario = sc.nextInt();
            intento++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor. Intenta otra vez.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número es menor. Intenta otra vez.");
            } else {
                System.out.println("Adivinaste El número era " + numeroSecreto);
                System.out.println("Lo lograste en " + intento + " intentos.");
            }
        }

        sc.close();
    }
}
