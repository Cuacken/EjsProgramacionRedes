package ejercicios;

import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1; 
        int intento = 0;
        int numeroUsuario = 0;

        System.out.println("Adivina el numero entre 1 y 100");

        
        while (numeroUsuario != numeroSecreto) {
            System.out.print("Ingresa tu numero: ");
            numeroUsuario = sc.nextInt();
            intento++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero es mayor, intentalo de nuevo.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El numero es menor, intentalo de nuevo.");
            } else {
                System.out.println("Adivinaste! El numero era " + numeroSecreto + ".");
                System.out.println("Lo lograste en " + intento + " intentos.");
            }
        }

        sc.close();
    }
}
