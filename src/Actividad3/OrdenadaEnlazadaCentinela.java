package Actividad3;

//Estructura doblemente enlazada con constructor y operación borrar
public class OrdenadaEnlazadaCentinela {
    private Nodo primero;
    private int numElem;

    //Crear la lista vacia
    public OrdenadaEnlazadaCentinela() {
        Nodo centinela = new Nodo(Integer.MIN_VALUE, null);
        primero = centinela;
        numElem = 0;
    }

    //Insertar un elemento al principio de la lista
    public void insertar(int elemento) {
        Nodo actual = primero;

        while (actual.getSig() != null && actual.getSig().getElemento() < elemento) {
            actual = actual.getSig();
        }

        Nodo nuevo = new Nodo(elemento, actual.getSig());
        actual.setSig(nuevo);

        numElem++;
    }

    public void borrar(int elemento) {
        Nodo actual = primero;

        while (actual.getSig() != null && actual.getSig().getElemento() < elemento) {
            actual = actual.getSig();
        }

        if ( actual.getSig() != null && actual.getSig().getElemento() == elemento) {
            actual.setSig(actual.getSig().getSig());
            numElem--;
        }
    }

    //Imprimir todos los elementos de la lista
    public void imprimirLista() {
        System.out.printf("Lista: ");
        Nodo actual = primero.getSig();
        for (int i = 0; i < numElem; i++) {
            System.out.printf(actual.getElemento() + " ");
            actual = actual.getSig();
        }
    }

    public int getNumElem() {
        return numElem;
    }
}