/**
 * Created by Yeray on 24/04/2017.
 */
public class ModuloAutorizacion {

    private TablaHash<Usuario> tablaAuth = new ListasTablaHash();

    public boolean registraUsuario(String nombre, String contraseña) {
        return tablaAuth.insertar(new Usuario(nombre, contraseña));
    }

    public boolean estaAutorizado(String nombre, String contraseña) {
        return tablaAuth.buscar(new Usuario(nombre, contraseña));
    }

}
