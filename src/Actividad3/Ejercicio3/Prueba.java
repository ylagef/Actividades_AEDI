package Actividad3.Ejercicio3;

public class Prueba {

    public static void main(String[] args) {
        OrdenadaEnlazadaCentinela de = new OrdenadaEnlazadaCentinela(); //Crea la lista y la inicializa.
        de.insertar(10);
        de.insertar(3);
        de.insertar(15);
        de.insertar(5);

        de.borrar(95);

        de.imprimirLista();

        System.out.printf("\nNúmero de elementos: " + de.getNumElem());
    }
}
