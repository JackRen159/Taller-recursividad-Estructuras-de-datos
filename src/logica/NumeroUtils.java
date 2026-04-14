package logica;

public class NumeroUtils {
     public static int invertirNumero(int n) {
        // Validacion
        if (n < 0) {
            throw new IllegalArgumentException("El numero debe ser positivo");
        }
        return invertirRecursivo(n, 0);
    }

    private static int invertirRecursivo(int n, int resultado) {
        // Caso base
        if (n == 0) {
            return resultado;
        }
        int digito = n % 10;
        return invertirRecursivo(n / 10, resultado * 10 + digito);
    }
       public static int sumarDigitos(int n) {
        // Validacion
        if (n < 0) {
            throw new IllegalArgumentException("El numero debe ser positivo");
        }
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumarDigitos(n / 10);
    }
    
}
