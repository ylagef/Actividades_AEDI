package Actividad2.Ejercicio3;

//Estructura doblemente enlazada con constructor y operación borrar
public class EnlazadaCircular {
    private DobleNodo ultimo;
    private int numElem;

    //Crear la lista vacia
    public EnlazadaCircular() {
        ultimo = null;
        numElem = 0;
    }

    //Contar el numero de veces que aparece un elemento en la lista
    public int contadorVeces(int elemento) {
        int contador = 0;
        if (ultimo != null) {
            DobleNodo actual = ultimo;
            for (int i = 0; i < numElem; i++) {
                if (actual.getElemento() == elemento) {
                    contador++;
                    actual = actual.getSig();
                }
            }
        }
        return contador;
    }

    public int primerElemento() {
        if (ultimo != null) {
            return ultimo.getSig().getElemento();
        }
        return -1;
    }

    //Insertar un elemento al final de la lista
    public void insertarFinal(int elemento) {
        DobleNodo nuevo = new DobleNodo(elemento, null, null);

        if (ultimo != null) {
            nuevo.setAnt(ultimo);
            nuevo.setSig(ultimo.getSig());
            ultimo.getSig().setAnt(nuevo);
            ultimo.setSig(nuevo);
            ultimo = nuevo;
        } else {
            nuevo.setSig(nuevo);
            nuevo.setAnt(nuevo);
            ultimo = nuevo;
        }
        numElem++;
    }

    //Borrar un elemento de la lista
    public void borrar(int elemento) {
        for (int i = 0; i < numElem; i++) {
            if (ultimo.getElemento() == elemento) {
                ultimo.getAnt().setSig(ultimo.getSig());
                ultimo.getSig().setAnt(ultimo.getAnt());
                ultimo = ultimo.getSig();
                numElem--;
            }
        }
    }

    //Imprimir todos los elementos de la lista
    public void imprimirLista() {
        if (ultimo == null) {
            System.out.printf("Lista vacía.");
        } else {
            System.out.printf("Lista: ");

            DobleNodo actual = ultimo.getSig();

            for (int i = 0; i < numElem; i++) {
                System.out.printf(actual.getElemento() + " ");
                actual = actual.getSig();
            }
        }
    }

    public int getNumElem() {
        return numElem;
    }
}