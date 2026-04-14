package logica;

public class OperacionesRecursivas {

     public static int divisionEntera(int dividendo, int divisor) {
        // Validaciones
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir entre 0");
        }
        if (dividendo < 0 || divisor < 0) {
            throw new IllegalArgumentException("Solo se permiten numeros positivos");
        }

        // Caso base
        if (dividendo < divisor) {
            return 0;
        }

        // Caso recursivo
        return 1 + divisionEntera(dividendo - divisor, divisor);
    }
    public static int multiplicacion(int a, int b) {
    // Validaciones
    if (a < 0 || b < 0) {
        throw new IllegalArgumentException("Solo se permiten numeros positivos");
    }

    // Caso base
    if (b == 0) {
        return 0;
    }

    // Caso recursivo
    return a + multiplicacion(a, b - 1);
    }
}
