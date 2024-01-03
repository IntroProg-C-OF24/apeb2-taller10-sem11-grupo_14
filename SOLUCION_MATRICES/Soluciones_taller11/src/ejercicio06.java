import java.util.Scanner;
import java.util.Random;
public class ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamanio de la matriz cuadrada: ");
        int n = scanner.nextInt();

        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] resultado = new int[n][n];

        // Llenar las matrices con números aleatorios únicos enteros positivos o negativos (-9-0, 0-9)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = random.nextInt(19) - 9;
                matriz2[i][j] = random.nextInt(19) - 9;
            }
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sumar matrices");
            System.out.println("2. Restar matrices");
            System.out.println("3. Salir");
            System.out.print("\nIngrese una opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                // Sumar matrices
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                    }
                }

                System.out.println("\nMatriz 1:");
                imprimirMatriz(matriz1);

                System.out.println("\nMatriz 2:");
                imprimirMatriz(matriz2);

                System.out.println("\nResultado de la suma:");
                imprimirMatriz(resultado);
            } else if (opcion == 2) {
                // Restar matrices
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        resultado[i][j] = matriz1[i][j] - matriz2[i][j];
                    }
                }

                System.out.println("\nMatriz 1:");
                imprimirMatriz(matriz1);

                System.out.println("\nMatriz 2:");
                imprimirMatriz(matriz2);

                System.out.println("\nResultado de la resta:");
                imprimirMatriz(resultado);
            } else if (opcion == 3) {
                // Salir
                break;
            } else {
                System.out.println("\nOpción inválida. Intente de nuevo.");
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*

*/