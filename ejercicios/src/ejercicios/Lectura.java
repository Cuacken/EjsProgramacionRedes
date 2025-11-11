package ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        try {
            File archivo = new File("datos.txt");
            if (archivo.exists()) {
                Scanner lector = new Scanner(archivo);
                System.out.println("Contenido del archivo:");
                while (lector.hasNextLine()) {
                    String linea = lector.nextLine();
                    System.out.println(linea);
                }
                lector.close();
            } else {
                System.out.println("El archivo no existe. Se creara al guardar datos.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }

        
        try {
            FileWriter escritor = new FileWriter("datos.txt", true); // true = agregar sin borrar
            System.out.print("Ingrese el texto a guardar en el archivo: ");
            sc.nextLine(); 
            String texto = sc.nextLine();
            escritor.write(texto + "\n");
            escritor.close();
            System.out.println("Texto guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }

        sc.close();
    }
}
