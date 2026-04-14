package logica;

public class EstructurasRecursivas {
    public static int sumaArreglo(int[] arreglo) {
        return sumaRecursiva(arreglo, 0);
    }
    // Metodo auxiliar recursivo
    private static int sumaRecursiva(int[] arreglo, int indice) {

        // Caso base
        if (indice == arreglo.length) {
            return 0;
        }

        // Caso recursivo
        return arreglo[indice] + sumaRecursiva(arreglo, indice + 1);
    }
     public static int sumaMatriz(int[][] matriz) {
        return sumaMatrizRecursiva(matriz, 0, 0);
    }
    // Metodo recursivo que recorre la matriz
    private static int sumaMatrizRecursiva(int[][] matriz, int fila, int columna) {

        // Caso base: fin de filas
        if (fila == matriz.length) {
            return 0;
        }

        // Cambio de fila
        if (columna == matriz[fila].length) {
            return sumaMatrizRecursiva(matriz, fila + 1, 0);
        }

        // Caso recursivo
        return matriz[fila][columna] +
               sumaMatrizRecursiva(matriz, fila, columna + 1);
    }
}
