import java.util.Scanner;
public class Ejercicio5 {
    Scanner sc = new Scanner(System.in);
    int filas = 10;
    int columnas = 40;
    char[][] tabla = new char[filas][columnas];

    public void mostrarTabla(){
        for (int i = 0; i < filas-1; i++){
            for(int j = 0; i < columnas-1; j++){
                System.out.print(tabla[i][j]);
            }
            System.out.println();
        }
    }

    /*Escribir un algoritmo para hacer dibujos en arte ASCII. El diseño está modelizado por una tabla de caracteres de diez líneas y cuarenta columnas. Inicialmente, esta tabla contiene solo caracteres de espacio. Un procedimiento debe llevar a cabo la visualización de la obra.

Cuando se inicia el programa, se muestra el dibujo y, a continuación, un menú ofrece realizar una de las siguientes funciones:*/

//Dibujar un carácter.
public void dibujarCaracter(){
    System.out.println("Ingrese la fila y la columna donde desea dibujar el caracter:\n");
    int fila = sc.nextInt();
    int columna = sc.nextInt();
    if (fila >= 0 && fila < filas && columna >=0 && columna < columnas){
        System.out.println("Ingrese el caracter que desea dibujar:\n");
        char caracter = sc.next().charAt(0);
        tabla[fila][columna] = caracter;
        mostrarTabla();
    }else {
        System.out.println("La fila o columna ingresada no es valida");
        dibujarCaracter();
    }

}
//Dibujar un rectángulo con un conjunto de caracteres.
public void dibujarRectangulo(){
    System.out.println("Ingrese la fila y la columna donde desea dibujar el rectangulo:\n");
    int fila = sc.nextInt();
    int columna = sc.nextInt();
    System.out.println("Ingrese el alto y el ancho del rectangulo:\n");
    int alto = sc.nextInt();
    int ancho = sc.nextInt();
    if (fila >= 0 && fila < filas && columna >=0 && columna < columnas){
        System.out.println("Ingrese el caracter que desea dibujar:\n");
        char caracter = sc.next().charAt(0);
        for (int i = 0; i < alto; i++){
            for (int j = 0; j < ancho; j++){
                tabla[fila+i][columna+j] = caracter;
            }
        }
        mostrarTabla();
    }else {
        System.out.println("La fila o columna ingresada no es valida");
        dibujarRectangulo();
    }
}
//Cambiar "el color" (es decir, el carácter), usando un bote de pintura (puede inspirarse en lo que se presentó en la sección que trata sobre la recursividad).

//Cada una de las funciones mencionadas se debe realizar utilizando uno o más procedimientos.



}
