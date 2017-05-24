package Actividad7;

/**
 * Created by Yeray on 24/04/2017.
 */
public interface TablaHash<E> {

    boolean insertar(E elem);

    boolean buscar(E elem);

    boolean eliminar(E elem);

    int tamaño();
}
