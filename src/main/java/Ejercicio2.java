import java.util.Scanner;

public class Ejercicio2 {
    Scanner sc = new Scanner(System.in);

    //Escribir un procedimiento initializarTablero() que inicialice el tablero de juego.
    public void inicializarTablero(char[][] tablero){
        int fila = (int) (Math.random() * 4);
        int columna = (int) (Math.random() * 4);
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = '?';
            }
        }
    }

    //Escribir un procedimiento mostrarTablero() que, como su nombre indica, muestre el tablero de juego.
    public void mostrarTablero(char[][] tablero){
       // inicializarTablero();
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

    }

    //Escribir una función introducirEnteroEntreLimites(), que hace que el usuario introduzca un valor hasta que esté entre un valor mínimo y un valor máximo, pasados en los argumentos de esta función.
    public int introducirEnteroEntreLimites(int min, int max){
        int numero = 0;
        do{
            System.out.println("Introduce un número entre " + min + " y " + max);
            numero = sc.nextInt();
        }while(numero < min || numero > max);
        return numero;
    }

    //Escribir una función de disparar() que le permita al jugador elegir sus coordenadas de disparo y devuelva verdadero si el barco es alcanzado y falso en caso contrario.
    public boolean disparar(){
        char[][] tablero = new char[4][4];
        int fila = (int) (Math.random() * 4);
        int columna = (int) (Math.random() * 4);
        int filaUsuario = 0;
        int columnaUsuario = 0;
        do{
            System.out.println("¿Qué columna?");
            columnaUsuario = sc.nextInt() - 1;
            System.out.println("¿Qué fila?");
            filaUsuario = sc.nextInt() - 1;
            if(filaUsuario == fila && columnaUsuario == columna){
                System.out.println("Tocado y hundido");
                return true;
            }else{
                tablero[filaUsuario][columnaUsuario] = '~';
                System.out.println("Agua");
                return false;
            }
        }while(filaUsuario != fila || columnaUsuario != columna);
    }


}
