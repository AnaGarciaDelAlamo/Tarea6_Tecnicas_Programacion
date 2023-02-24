import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Escriba una función que tome dos valores reales como argumentos y devuelva el mayor de los dos.
       /* System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int numero2 = sc.nextInt();
        if(numero > numero2) {
            System.out.println("El número mayor es: " + numero);
        } else if (numero < numero2) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("Los números son iguales");
        }*/

        /*Escriba otra función que también tome dos valores reales como argumentos, pero que devuelva:

0 si los dos valores son iguales;

1 si el primer valor es el mayor;

el texto -1 en caso contrario.

Escribir un algoritmo principal que llame a estas dos funciones.*/
        System.out.println("Introduce un número: ");
        int numero3 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int numero4 = sc.nextInt();
        if(numero3 == numero4) {
            System.out.println("0");
        } else if (numero3 > numero4) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }










    }
}
