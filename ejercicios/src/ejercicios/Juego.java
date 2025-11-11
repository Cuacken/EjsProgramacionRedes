package ejercicios;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jugador = 'X';
        int turnos = 0;

        while (true) {
            
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.println("| " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2] + " |");
                System.out.println("-------------");
            }

            
            System.out.println("Turno del jugador " + jugador);
            System.out.print("Fila (0-2): ");
            int fila = sc.nextInt();
            System.out.print("Columna (0-2): ");
            int col = sc.nextInt();

            
            if (tablero[fila][col] != ' ') {
                System.out.println("Casilla ocupada, intenta de nuevo");
                continue;
            }

            
            tablero[fila][col] = jugador;
            turnos++;

            
            if (
                (tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador) ||
                (tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador) ||
                (tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador) ||
                (tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador) ||
                (tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador) ||
                (tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador) ||
                (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
                (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)
            ) {
                System.out.println("El ganador es el Jugador " + jugador + "!");
                break;
            }

            
            if (turnos == 9) {
                System.out.println("Empate!");
                break;
            }

            
            jugador = (jugador == 'X') ? 'O' : 'X';
        }

        sc.close();
    }
}
