import java.util.Scanner;

public class Ejercicio2 {

    Scanner sc = new Scanner(System.in);
     char[][] tabla;
     int filas;
     int columnas;


    //Escribir un procedimiento initializarTablero() que inicialice el tablero de juego.
    public void inicializarTablero(){
        tabla = new char[4][4];
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; i< tabla.length;j++){
                tabla[i][j] = '?';
            }

        }
    }

    //Escribir un procedimiento mostrarTablero() que, como su nombre indica, muestre el tablero de juego.
    public void mostrarTablero(){
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j< tabla.length; j++){
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Escribir una función introducirEnteroEntreLimites(), que hace que el usuario introduzca un valor hasta que esté entre un valor mínimo y un valor máximo, pasados en los argumentos de esta función.
    public void introducirLimites(){
        System.out.println("Introduce el valor mínimo: ");
        int min = sc.nextInt();
        System.out.println("Introduce el valor máximo: ");
        int max = sc.nextInt();
        filas = (int) (Math.random() * (max - min + 1) + min);
        columnas = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("El barco se encuentra en las coordenadas: " + filas + ", " + columnas);
    }

    //Escribir una función de disparar() que le permita al jugador elegir sus coordenadas de disparo y devuelva verdadero si el barco es alcanzado y falso en caso contrario.
    public boolean disparar(){
        System.out.println("Introduce la coordenada x: ");
        int x = sc.nextInt();
        System.out.println("Introduce la coordenada y: ");
        int y = sc.nextInt();
        if(x == filas && y == columnas){
            tabla[x-1][y-1] = 'X';
            return true;
        }else{
            tabla[x-1][y-1] = '~';
            return false;
        }
    }
}
