package ejercicios;

import java.util.Scanner;

public class Validacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de tarjeta de crédito: ");
        String tarjeta = sc.nextLine();

        if (esValidaLuhn(tarjeta)) {
            System.out.println("El número de tarjeta es válido.");
        } else {
            System.out.println("El número de tarjeta no es válido.");
        }

        sc.close();
    }

    
    public static boolean esValidaLuhn(String numero) {
        int suma = 0;
        boolean duplicar = false;

        
        for (int i = numero.length() - 1; i >= 0; i--) {
            char c = numero.charAt(i);

           
            if (!Character.isDigit(c)) continue;

            int digito = c - '0';

            
            if (duplicar) {
                digito *= 2;
                if (digito > 9) digito -= 9;
            }

            suma += digito;
            duplicar = !duplicar;
        }

        
        return (suma % 10 == 0);
    }
}
