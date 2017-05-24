package Actividad3;

public class Nodo {
    private int elemento;
    private Nodo siguiente;

    public Nodo(int e, Nodo sig) {
        elemento = e;
        siguiente = sig;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int e) {
        elemento = e;
    }

    public Nodo getSig() {
        return siguiente;
    }

    public void setSig(Nodo sig) {
        siguiente = sig;
    }

}