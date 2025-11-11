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
        System.out.println("-------------------------------");
        System.out.println("Simulación de una Cola de Banco");
        System.out.println("-------------------------------");

       
        for (int i = 1; i <= maxClientes; i++) {
            cola.add("Cliente" + i);
        }

        System.out.println("Clientes en espera: " + cola);
        System.out.println("Atención de clientes ");

        int numeroCajero = 0;

   
        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Cajero " + (numeroCajero + 1) + " atiende a " + cliente);
            atendidos[numeroCajero]++;

           
            numeroCajero = (numeroCajero + 1) % cajeros;
        }

     
        System.out.println("\n Resumen de atencion ");
        for (int i = 0; i < cajeros; i++) {
            System.out.println("Cajero " + (i + 1) + " atendió a " + atendidos[i] + " clientes.");
        }

        System.out.println("Todos los clientes fueron atendidos.");
    }
}

