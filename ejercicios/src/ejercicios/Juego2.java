package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Juego2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] palabras = {"java", "programa", "banco", "teclado", "ahorcado"};
        String palabra = palabras[rand.nextInt(palabras.length)];

        char[] oculto = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            oculto[i] = '_';
        }

        int intentos = 6;
        boolean ganado = false;

        System.out.println("Juego del Ahorcado");

        while (intentos > 0 && !ganado) {
            System.out.print("\nPalabra: ");
            System.out.println(oculto);
            System.out.println("Intentos restantes: " + intentos);

            System.out.print("Ingresa una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra && oculto[i] == '_') {
                    oculto[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                System.out.println("Letra incorrecta");
            } else {
                System.out.println("Letra correcta");
            }

            ganado = true;
            for (char c : oculto) {
                if (c == '_') {
                    ganado = false;
                    break;
                }
            }
        }

        if (ganado) {
            System.out.println("\nGanaste. La palabra era: " + palabra);
        } else {
            System.out.println("\nPerdiste. La palabra era: " + palabra);
        }

        sc.close();
    }
}
