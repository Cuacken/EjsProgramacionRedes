package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Juego2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] palabras = {"gato", "perro", "pato", "raton", "ahorcado", "cabeza", "brazos", "piernas", "supercalifragilisticoespiralidoso"};
        String palabra = palabras[rand.nextInt(palabras.length)];

        char[] oculto = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            oculto[i] = '_';
        }

        int intentos = 6;
        boolean ganado = false;
        System.out.println("--------");
        System.out.println("Ahorcado");
        System.out.println("--------");

        while (intentos > 0 && !ganado) {
            System.out.print("Palabra: ");
            System.out.println(oculto);

            System.out.print("Ingresa una letra");
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
                System.out.println("Incorrecto! Te quedan " + intentos + " intentos"); //Letra incorrecta
            } else {
                //Letra correcta
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
            System.out.println("-----------------------------------");
            System.out.println("Ganaste! La palabra era " + palabra + ".");
            System.out.println("-----------------------------------");
        } else {
            System.out.println("-----------------------------------");
            System.out.println("Perdiste! La palabra era " + palabra + ".");
            System.out.println("-----------------------------------");
        }

        sc.close();
    }
}
