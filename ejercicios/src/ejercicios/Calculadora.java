package ejercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese la operacion (+, -, *, /): ");
        char operacion = sc.next().charAt(0);

        System.out.print("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        double resultado = 0;
    switch (operacion) {
        case '+':
            resultado = num1 + num2;
            break;
        case '-':
            resultado = num1 - num2;
            break;
        case '*':
            resultado = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("No se puede dividir por cero.");
                sc.close();
                return;
            }
            break;
        default:
            System.out.println("Operacion no valida, intentelo de nuevo.");
            sc.close();
            return;
    }

        System.out.println(num1 +  " " + operacion + " " + num2 + " = " + resultado);

        sc.close();
    }
}
