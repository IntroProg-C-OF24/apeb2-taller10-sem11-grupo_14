import java.util.Random;
public class ejercicio07 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matriz = new int[n][n];
        Random random = new Random();

        // Generar matriz cuadrada de tamaño nxn con números aleatorios únicos enteros positivos o negativos (-9-0, 0-9)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(19) - 9;
            }
        }

        // Imprimir matriz
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Elementos de la diagonal secundaria
        int[] diagonal_secundaria = new int[n];
        for (int i = 0; i < n; i++) {
            diagonal_secundaria[i] = matriz[n - i - 1][i];
        }
        System.out.println("Elementos de la diagonal secundaria:");
        for (int i = 0; i < n; i++) {
            System.out.print(diagonal_secundaria[i] + " ");
        }
        System.out.println();

        // Elementos sobre la diagonal secundaria
        System.out.println("Elementos sobre la diagonal secundaria:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();

        // Elementos bajo la diagonal secundaria
        System.out.println("Elementos bajo la diagonal secundaria:");
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }
}
/*
Matriz:
-5 -5 1 0 0 
1 8 -5 -5 -6 
9 4 6 1 -9 
-6 7 1 -1 1 
3 9 5 -5 9 
Elementos de la diagonal secundaria:
3 7 6 -5 0 
Elementos sobre la diagonal secundaria:
-5 1 0 0 -5 -5 -6 1 -9 1 
Elementos bajo la diagonal secundaria:
1 9 4 -6 7 1 3 9 5 -5 
*/    
  

