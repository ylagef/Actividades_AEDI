package Actividad2.Ejercicio2;

public class Prueba {

    public static void main(String[] args) {
        DoblementeEnlazada de = new DoblementeEnlazada(); //Crea la lista y la inicializa.
        de.insertarInicio(1);
        de.insertarInicio(2);
        de.insertarInicio(3);
        de.insertarFinal(4);
        de.insertarFinal(5);
        de.insertarFinal(2);


        de.borrar2(2);

        System.out.printf("Número de veces el elemento en la lista: " + de.contadorVeces(1) + "\n");

        de.imprimirLista();

        System.out.printf("\nNúmero de elementos: " + de.getNumElem());
    }
}
