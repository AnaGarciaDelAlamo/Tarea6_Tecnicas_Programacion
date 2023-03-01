import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        try (Scanner sc = new Scanner(System.in)){
            do{
                menuPrincipal();
                try{
                    opcion = sc.nextInt();
                }catch (InputMismatchException ex){
                    sc.next();
                    opcion =-1;
                }
                switch (opcion){
                    case 0:
                        System.out.println("Adiós");
                        return;
                    case 1:
                        System.out.println("Ejercicio 1");
                        Ejercicio1 ejercicio1 = new Ejercicio1();
                        ejercicio1.esMayor();
                        break;
                    case 2:
                        System.out.println("Ejercicio 2");
                        break;
                    case 3:
                        System.out.println("Ejercicio 3");
                        break;
                    case 4:
                        System.out.println("Ejercicio 4");
                        break;
                    case 5:
                        System.out.println("Ejercicio 5");
                        Ejercicio5 ejercicio5 = new Ejercicio5();
                        ejercicio5.crearTablero();
                        ejercicio5.mostrarTablero();
                        ejercicio5.dibujarCaracter();
                        ejercicio5.dibujarRectangulo();
                        ejercicio5.cambiarColor();
                        break;
                }
            }while(opcion >=0 || opcion < 6);
        }catch (InputMismatchException ex){
            System.out.println("Error en el dato introducido");
        }

    }

    public static void menuPrincipal(){
        System.out.println("Elige una opción: ");
        System.out.println("0.- Salir");
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("3.- Ejercicio 3");
        System.out.println("4.- Ejercicio 4");
        System.out.println("5.- Ejercicio 5");
    }
}
