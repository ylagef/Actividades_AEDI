package Actividad7;

import java.util.LinkedList;
import java.util.List;
/**
 * Created by Yeray on 24/04/2017.
 */
public class ListasTablaHash<E> implements TablaHash<E> {

    private List<E>[] tabla;
    private int numElem;

    public ListasTablaHash() {
        numElem = 0;
        tabla = new LinkedList[20];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = new LinkedList<>();
        }
    }

    public List<E>[] getTabla() {
        return tabla;
    }

    @Override
    public boolean insertar(E elem) {
        if (buscar(elem)) return false;
        tabla[funcionHash(elem)].add(elem);
        numElem++;
        return true;
    }

    @Override
    public boolean buscar(E elem) {
        return tabla[funcionHash(elem)].contains(elem);
    }

    @Override
    public boolean eliminar(E elem) {
        if (buscar(elem)) {
            tabla[funcionHash(elem)].remove(elem);
            numElem--;
            return true;
        }
        return false;
    }

    @Override
    public int tamaño() {
        return numElem;
    }

    private int funcionHash(E elem) {
        int code = Math.abs(elem.hashCode());
        return code % tabla.length;
    }
}
