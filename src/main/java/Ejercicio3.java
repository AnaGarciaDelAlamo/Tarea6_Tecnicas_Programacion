import java.util.Scanner;
public class Ejercicio3 {
    Scanner sc = new Scanner(System.in);

    //Escriba una función que cree una tabla que tenga una dimensión de diez números enteros e inicialice aleatoriamente los valores de esta tabla, con valores entre un límite mínimo y un límite máximo, que se pasan como argumentos.
    public void crearTabla() {
        int[] tabla = new int[10];
        System.out.println("Introduce un número mínimo: ");
        int minimo = sc.nextInt();
        System.out.println("Introduce un número máximo: ");
        int maximo = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            tabla[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
        }
    }

    //Cree una función que devuelva el mayor valor de una tabla (esta tabla no tiene necesariamente diez celdas, etc.).
    public void mayorValorTabla() {
        System.out.println("Introduce de cuantas celdas quieres la tabla: ");
        int celdas = sc.nextInt();
        int[] tabla = new int[celdas];
        System.out.println("Introduce un número mínimo: ");
        int minimo = sc.nextInt();
        System.out.println("Introduce un número máximo: ");
        int maximo = sc.nextInt();
        for (int i = 0; i < celdas; i++) {
            tabla[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
        }
        int mayor = tabla[0];
        for (int i = 0; i < 10; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
        }
        System.out.println("El mayor valor de la tabla es: " + mayor);
    }

    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.crearTabla();
        ejercicio3.mayorValorTabla();
        System.out.println(ejercicio3);
    }
}
