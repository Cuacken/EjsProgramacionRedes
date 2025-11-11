package ejercicios;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Banco {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        int maxClientes = 5;
        int cajeros = 3; 
        int[] atendidos = new int[cajeros];

        System.out.println("Simulación de una Cola de Banco");

       
        for (int i = 1; i <= maxClientes; i++) {
            cola.add("Cliente" + i);
        }

        System.out.println("\nClientes en espera: " + cola);
        System.out.println("\nAtención de clientes ");

        int numeroCajero = 0;

   
        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Cajero " + (numeroCajero + 1) + " atiende a " + cliente);
            atendidos[numeroCajero]++;

           
            numeroCajero = (numeroCajero + 1) % cajeros;
        }

     
        System.out.println("\n Resumen de atención ");
        for (int i = 0; i < cajeros; i++) {
            System.out.println("Cajero " + (i + 1) + " atendió a " + atendidos[i] + " clientes.");
        }

        System.out.println("\nTodos los clientes fueron atendidos.");
    }
}

