/**
 * Created by Yeray on 04/05/2017.
 */
public class Main_A8 {

    public static void main(String[] args) {
        /*if (comprobarPalindromo("Dabale arroz a la zorra el abad")) {
            System.out.printf("Es palíndromo.");
        } else {
            System.out.printf("NO es palíndromo.");
        }*/

        int[] arr = {10, 9, 6, 5, 3, 2, 0};
        int[] arr2 = {1, 2, 3, 23, 24, 24, 24, 25, 26, 30, 30, 30, 30, 56, 70, 70, 78, 88, 89, 99};

        //System.out.printf(String.valueOf(busquedaBinaria(0, arr)));
        System.out.println("Tamaño del array: " + arr2.length);
        System.out.println("Menor que 30 :" + String.valueOf(menores30(arr2)));
        System.out.println("Mayor que 70 hay:" + String.valueOf(mayores70(arr2)));
        System.out.println("Entre 30 y 70 hay:" + String.valueOf(entre30_70(arr2)));
    }

    private static boolean comprobarPalindromo(String s) {
        String[] aux = s.replaceAll(" ", "").toLowerCase().split("");

        for (int i = 0; i < aux.length / 2; i++) {
            if (!aux[i].equals(aux[aux.length - i - 1])) return false;
        }

        return true;
    }

    public static int busquedaBinaria(int elem, int[] array) {
        int inicio = 0;
        int fin = array.length - 1;
        int medio;

        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (array[medio] > elem) {
                inicio = medio + 1;
            } else {
                if (array[medio] < elem) {
                    fin = medio - 1;
                } else {
                    return medio;
                }
            }
        }
        return -1;
    }

    public static int menores30(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;
        int medio;

        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (array[medio] < 30) {
                inicio = medio + 1;
            } else {
                if (array[medio] > 30) {
                    fin = medio - 1;
                } else {
                    while (array[medio - 1] == 30) {
                        medio--;
                    }
                    return medio;
                }
            }
        }
        return inicio;
    }

    public static int mayores70(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;
        int medio;

        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (array[medio] < 70) {
                inicio = medio + 1;
            } else {
                if (array[medio] > 70) {
                    fin = medio - 1;
                } else {
                    while (array[medio + 1] == 70) {
                        medio++;
                    }
                    return array.length - medio - 1;
                }
            }
        }
        return array.length - fin - 1;
    }

    public static int entre30_70(int[] array) {
        return array.length - menores30(array) - mayores70(array);
    }


}
