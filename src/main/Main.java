package main;

import java.util.Scanner;
import logica.*;

public class Main {

    private static final Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1: ejecutarFactorial(); break;
                case 2: ejecutarSumatoria(); break;
                case 3: ejecutarSerieArmonica(); break;
                case 4: ejecutarInvertirNumero(); break;
                case 5: ejecutarSumarDigitos(); break;
                case 6: ejecutarPotencia(); break;
                case 7: ejecutarMCD(); break;
                case 8: ejecutarDivision(); break;
                case 9: ejecutarMultiplicacion(); break;
                case 10: ejecutarSumaArreglo(); break;
                case 11: ejecutarSumaMatriz(); break;
                case 12: ejecutarFibonacci(); break;
                case 13: ejecutarAckermann(); break;
                case 0: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opcion invalida");
            }

        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Factorial");
        System.out.println("2. Sumatoria hasta N");
        System.out.println("3. Serie armonica");
        System.out.println("4. Invertir numero");
        System.out.println("5. Sumar digitos");
        System.out.println("6. Potencia");
        System.out.println("7. MCD");
        System.out.println("8. Division");
        System.out.println("9. Multiplicacion");
        System.out.println("10. Suma de arreglo");
        System.out.println("11. Suma de matriz");
        System.out.println("12. Fibonacci");
        System.out.println("13. Ackermann");
        System.out.println("0. Salir");
    }
    private static void ejecutarFactorial() {
    System.out.print("Numero: ");
    int n = Integer.parseInt(consola.nextLine());
    System.out.println(MathRecursivo.factorial(n));
    }

    private static void ejecutarSumatoria() {
        System.out.print("Numero: ");
        int n = Integer.parseInt(consola.nextLine());
        System.out.println(MathRecursivo.sumaHastaN(n));
    }

    private static void ejecutarSerieArmonica() {
        System.out.print("Numero: ");
        int n = Integer.parseInt(consola.nextLine());
        System.out.println(MathRecursivo.serieArmonica(n));
    }

    private static void ejecutarInvertirNumero() {
        System.out.print("Numero: ");
        int n = Integer.parseInt(consola.nextLine());
        System.out.println(NumeroUtils.invertirNumero(n));
    }

    private static void ejecutarSumarDigitos() {
        System.out.print("Numero: ");
        int n = Integer.parseInt(consola.nextLine());
        System.out.println(NumeroUtils.sumarDigitos(n));
    }

    private static void ejecutarPotencia() {
        System.out.print("Base: ");
        int b = Integer.parseInt(consola.nextLine());
        System.out.print("Exponente: ");
        int e = Integer.parseInt(consola.nextLine());
        System.out.println(MathRecursivo.potencia(b, e));
    }

    private static void ejecutarMCD() {
        System.out.print("M: ");
        int m = Integer.parseInt(consola.nextLine());
        System.out.print("N: ");
        int n = Integer.parseInt(consola.nextLine());
        System.out.println(MathRecursivo.mcd(m, n));
    }

    private static void ejecutarDivision() {
        System.out.print("Dividendo: ");
        int a = Integer.parseInt(consola.nextLine());
        System.out.print("Divisor: ");
        int b = Integer.parseInt(consola.nextLine());
        System.out.println(OperacionesRecursivas.divisionEntera(a, b));
    }

    private static void ejecutarMultiplicacion() {
        System.out.print("A: ");
        int a = Integer.parseInt(consola.nextLine());
        System.out.print("B: ");
        int b = Integer.parseInt(consola.nextLine());
        System.out.println(OperacionesRecursivas.multiplicacion(a, b));
    }

    private static void ejecutarSumaArreglo() {
        System.out.print("Cantidad: ");
        int n = Integer.parseInt(consola.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            arr[i] = Integer.parseInt(consola.nextLine());
        }

        System.out.println(EstructurasRecursivas.sumaArreglo(arr));
    }

    private static void ejecutarSumaMatriz() {
        System.out.print("Filas: ");
        int f = Integer.parseInt(consola.nextLine());
        System.out.print("Columnas: ");
        int c = Integer.parseInt(consola.nextLine());

        int[][] mat = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                mat[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        System.out.println(EstructurasRecursivas.sumaMatriz(mat));
    }

    private static void ejecutarFibonacci() {
        System.out.print("Limite: ");
        int n = Integer.parseInt(consola.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print(RecursividadAvanzada.fibonacci(i) + " ");
        }
        System.out.println();
    }

    /**
     * Ejecuta Ackermann con control de valores.
     */
    private static void ejecutarAckermann() {
        System.out.print("Ingrese m: ");
        int m = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese n: ");
        int n = Integer.parseInt(consola.nextLine());

        // Advertencia al usuario
        if (m > 3 || n > 10) {
            System.out.println("Valores muy grandes pueden colapsar el programa!!!");
        }
        int resultado = RecursividadAvanzada.ackermann(m, n);
        System.out.println("Resultado: " + resultado);
    }
}