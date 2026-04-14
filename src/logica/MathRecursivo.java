package logica;

public class MathRecursivo {
     public static int factorial(int n) {
        // Validacion
        if (n < 0) {
            throw new IllegalArgumentException("El numero debe ser >= 0");
        }
        // Caso base
        if (n == 0 || n == 1) {
            return 1;
        }
        // Caso recursivo
        return n * factorial(n - 1);
    }
    public static int sumaHastaN(int n) {
    // Validacion
    if (n < 0) {
        throw new IllegalArgumentException("El numero debe ser >= 0");
    }

    // Caso base
    if (n == 0) {
        return 0;
    }

    // Caso recursivo
    return n + sumaHastaN(n - 1);
    }
    public static double serieArmonica(int n) {
    // Validacion
    if (n <= 0) {
        throw new IllegalArgumentException("El numero debe ser mayor que 0");
    }

    // Caso base
    if (n == 1) {
        return 1;
    }

    // Caso recursivo
    return (1.0 / n) + serieArmonica(n - 1);
    }
    public static int potencia(int base, int exponente) {
    // Validacion
    if (exponente < 0) {
        throw new IllegalArgumentException("El exponente debe ser >= 0");
    }

    // Caso base
    if (exponente == 0) {
        return 1;
    }

    // Caso recursivo
    return base * potencia(base, exponente - 1);
    }
    public static int mcd(int m, int n) {
    // Validacion
    if (m < 0 || n < 0) {
        throw new IllegalArgumentException("Los numeros deben ser >= 0");
    }
    // Caso base
    if (n == 0) {
        return m;
    }
    // Caso recursivo
    return mcd(n, m % n);
    }
}
