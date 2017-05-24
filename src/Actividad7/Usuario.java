/**
 * Created by Yeray on 24/04/2017.
 */
public class Usuario {

    private String nombre;
    private String clave;

    public Usuario(String n, String c) {
        nombre = n;
        clave = c;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    @Override
    public boolean equals(Object u) {
        return ((Usuario) u).nombre.equals(nombre) && ((Usuario) u).clave.equals(clave);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
