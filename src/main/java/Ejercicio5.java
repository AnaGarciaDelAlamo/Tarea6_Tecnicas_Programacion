import java.util.Scanner;
public class Ejercicio5 {
    Scanner sc = new Scanner(System.in);

    /*Escribir un algoritmo para hacer dibujos en arte ASCII. El diseño está modelizado por una tabla de caracteres de diez líneas y cuarenta columnas. Inicialmente, esta tabla contiene solo caracteres de espacio. Un procedimiento debe llevar a cabo la visualización de la obra.

Cuando se inicia el programa, se muestra el dibujo y, a continuación, un menú ofrece realizar una de las siguientes funciones:

Dibujar un carácter.

Dibujar un rectángulo con un conjunto de caracteres.

Cambiar "el color" (es decir, el carácter), usando un bote de pintura (puede inspirarse en lo que se presentó en la sección que trata sobre la recursividad).

Cada una de las funciones mencionadas se debe realizar utilizando uno o más procedimientos.*/

    private char[][] tablero = new char[10][40];

    public void crearTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public void dibujarCaracter() {
        System.out.println("Introduce la fila: ");
        int fila = sc.nextInt();
        System.out.println("Introduce la columna: ");
        int columna = sc.nextInt();
        System.out.println("Introduce el caracter: ");
        char caracter = sc.next().charAt(0);
        tablero[fila][columna] = caracter;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public void dibujarRectangulo() {
        System.out.println("Introduce la fila: ");
        int fila = sc.nextInt();
        System.out.println("Introduce la columna: ");
        int columna = sc.nextInt();
        System.out.println("Introduce el caracter: ");
        char caracter = sc.next().charAt(0);
        System.out.println("Introduce el ancho: ");
        int ancho = sc.nextInt();
        System.out.println("Introduce el alto: ");
        int alto = sc.nextInt();
        for (int i = fila; i < fila + alto; i++) {
            for (int j = columna; j < columna + ancho; j++) {
                tablero[i][j] = caracter;
                System.out.print(tablero[i][j]);

            }
        }
        System.out.println();
    }

    public void cambiarColor() {
        System.out.println("Introduce la fila: ");
        int fila = sc.nextInt();
        System.out.println("Introduce la columna: ");
        int columna = sc.nextInt();
        System.out.println("Introduce el caracter: ");
        char caracter = sc.next().charAt(0);
        tablero[fila][columna] = caracter;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();
        ejercicio5.crearTablero();
        ejercicio5.mostrarTablero();
        ejercicio5.dibujarCaracter();
        ejercicio5.dibujarRectangulo();
        ejercicio5.cambiarColor();
}
}
