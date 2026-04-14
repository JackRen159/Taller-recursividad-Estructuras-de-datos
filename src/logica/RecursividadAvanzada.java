package logica;

public class RecursividadAvanzada {
    // Calcula el n-esimo numero de Fibonacci
    public static int fibonacci(int n) {
        // Validacion
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser >= 0");
        }

        // Casos base
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Caso recursivo
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int ackermann(int m, int n) {
    // Validacion
    if (m < 0 || n < 0) {
        throw new IllegalArgumentException("Los valores deben ser >= 0");
    }

    // Caso 1
    if (m == 0) {
        return n + 1;
    }

    // Caso 2
    if (m > 0 && n == 0) {
        return ackermann(m - 1, 1);
    }

    // Caso 3
    return ackermann(m - 1, ackermann(m, n - 1));
    }
}
