import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public  int[] crearTabla(int min, int max){
        int[] tabla = new int[10];

        for(int i = 0; i <tabla.length; i++){
            tabla[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return tabla;
    }

    public  int mayorValor(int[] tabla){
        int mayor= tabla[0];

        for(int i = 1; i < tabla.length; i++){
            if(tabla[i] > mayor){
                mayor = tabla[i];
            }
        }
        return mayor;
    }

    public  void imprimirTabla(int[] tabla){
        for(int i = 0; i < tabla.length; i++){
            System.out.print(tabla[i]);
        }
        System.out.println();
    }
}
