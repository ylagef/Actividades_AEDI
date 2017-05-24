/**
 * Created by Yeray on 05/05/2017.
 */
public class Main_A9 {

    public static void main(String[] args) {
        int[] aux = new int[10];
        aux[0] = 1;
        aux[1] = 3;
        aux[2] = 5;
        aux[3] = 7;
        aux[4] = 9;

        System.out.println("POSICIÓN: " + busquedaInserción(aux, 8, 5));

        for (int i : aux) {
            System.out.printf(i + " ");
        }
    }

    public static void OrdBurbuja(int[] aux) {
        for (int pasada = 0; pasada < aux.length - 1; pasada++) {
            for (int j = (aux.length - 1); j > pasada; j--) {
                if (aux[j] < aux[j - 1]) {
                    int temp = aux[j];
                    aux[j] = aux[j - 1];
                    aux[j - 1] = temp;
                }
            }
        }
    }

    public static int[] ordenarConteo(int[] aux) {
        int[] cont = new int[aux.length];
        int[] ordenado = new int[aux.length];
        int k = 0;

        for (int i : aux) {
            for (int j = 0; j < aux.length; j++) {
                if (i > aux[j]) cont[k]++;
            }
            k++;
        }

        for (int i = 0; i < aux.length; i++) {
            ordenado[cont[i]] = aux[i];
        }

        return ordenado;
    }

    public static int busquedaInserción(int[] aux, int elem, int max) {
        int inicio = 0;
        int fin = max;
        int medio;

        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (aux[medio] < elem) {
                inicio = medio + 1;
            } else {
                if (aux[medio] > elem) {
                    fin = medio - 1;
                } else {
                    return medio;
                }
            }
        }

        for (int i = max; i >= inicio; i--) {
            aux[i + 1] = aux[i];
        }

        aux[inicio] = elem;
        return inicio;
    }

}
