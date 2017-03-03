package Actividad2.Ejercicio3;

public class Prueba {

    public static void main(String[] args) {
        EnlazadaCircular de = new EnlazadaCircular(); //Crea la lista y la inicializa.
        de.insertarFinal(4);
        de.insertarFinal(5);
        de.insertarFinal(2);

        de.borrar(2);

        System.out.printf("Número de veces el elemento en la lista: " + de.contadorVeces(5) + "\n");

        System.out.printf("Primer elemento: "+de.primerElemento()+"\n");

        de.imprimirLista();

        System.out.printf("\nNúmero de elementos: " + de.getNumElem());
    }
}
