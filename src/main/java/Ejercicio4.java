public class Ejercicio4 {

    /*El objetivo de este juego es cruzar dos rebaños de ovejas.



Para lograrlo, debes respetar las siguientes reglas:

Una oveja puede avanzar un paso, siempre que el espacio frente a ella esté libre.

Una oveja puede saltar sobre otra oveja yendo en la dirección opuesta, si el siguiente espacio está libre.

No hay otros movimientos disponibles.

A continuación se muestra el plan de acción que se le propone realizar:

Intentar practicar (con lápiz y papel), para comprender el mecanismo del juego, dominar los diferentes movimientos posibles, así como las situaciones de bloqueo.

Buscar los subalgoritmos necesarios y determinar si son procedimientos o funciones.

Escribe el algoritmo principal, asumiendo que tiene a su disposición las funciones y procedimientos definidos previamente.

Escribir las funciones y procedimientos.*/

    private char [] tablero = new char[7];

    public void crearTablero() {
        for (int i = 0; i < 7; i++) {
            tablero[i] = '<';
            System.out.print(tablero[i]);
        }
        System.out.println();
    }



    public static void main(String[] args) {


    }
}
