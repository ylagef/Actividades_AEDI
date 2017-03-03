package Actividad2.Ejercicio2;

//Estructura doblemente enlazada con constructor y operación borrar
public class DoblementeEnlazada {
    private DobleNodo primero, ultimo;
    private int numElem;

    //Crear la lista vacia
    public DoblementeEnlazada() {
        primero = ultimo = null;
        numElem = 0;
    }

    //Contar el numero de veces que aparece un elemento en la lista
    public int contadorVeces(int elemento) {
        int contador = 0;
        for (DobleNodo actual = primero; actual != null; actual = actual.getSig()) {
            if (actual.getElemento() == elemento) {
                contador++;
            }
        }
        return contador;
    }

    //Insertar un elemento al principio de la lista
    public void insertarInicio(int elemento) {
        DobleNodo nuevo = new DobleNodo(elemento, primero, null);
        if (primero == null) {
            ultimo = nuevo;
        } else {
            nuevo.getSig().setAnt(nuevo);
        }
        primero = nuevo;
        numElem++;
    }

    //Insertar un elemento al final de la lista
    public void insertarFinal(int elemento) {
        DobleNodo nuevo = new DobleNodo(elemento, null, null);
        if (primero != null) {
            nuevo.setAnt(ultimo);
            ultimo.setSig(nuevo);
            ultimo = nuevo;
        } else {
            primero = nuevo;
        }
        numElem++;
    }

    //Borrar un elemento de la lista
    public void borrar2(int elemento) {
        for (DobleNodo actual = primero; actual != null; actual = actual.getSig()) {
            if (actual.getElemento() == elemento) {
                if (actual.getSig() != null) {
                    if (actual.getAnt() != null) {
                        actual.getAnt().setSig(actual.getSig());
                        actual.getSig().setAnt(actual.getAnt());
                    } else {
                        actual.getSig().setAnt(null);
                        primero = actual.getSig();
                    }
                } else if (actual.getAnt() != null) {
                    actual.getAnt().setSig(null);
                    ultimo = actual.getAnt();
                } else {
                    primero = ultimo = null;
                }
                numElem--;
            }
        }
    }

    //Imprimir todos los elementos de la lista
    public void imprimirLista() {
        if (primero == null && ultimo == null) {
            System.out.printf("Lista vacía.");
        } else {
            System.out.printf("Lista: ");
            for (DobleNodo actual = primero; actual != null; actual = actual.getSig()) {
                System.out.printf(actual.getElemento() + " ");
            }
        }
    }

    public int getNumElem() {
        return numElem;
    }
}