package ejercicios;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class ConversionHoraria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("Conversion de Fecha y Hora entre Zonas Horarias");
        System.out.println("-----------------------------------------------");

        ZonedDateTime fechaArgentina = ZonedDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
        System.out.println("Hora actual en Argentina: " + fechaArgentina);

        System.out.println("Seleccione zona horaria destino:");
        System.out.println("1 =  America");
        System.out.println("2 = Europe");
        System.out.println("3 = Asia");
        int opcion = sc.nextInt();

        ZoneId zonaDestino;
        switch (opcion) {
            case 1:
                zonaDestino = ZoneId.of("America");
                break;
            case 2:
                zonaDestino = ZoneId.of("Europa");
                break;
            default:
                zonaDestino = ZoneId.of("Asia");
                break;
        }

        ZonedDateTime fechaConvertida = fechaArgentina.withZoneSameInstant(zonaDestino);

        System.out.println("\nHora en zona destino: " + fechaConvertida);

        sc.close();
    }
}
