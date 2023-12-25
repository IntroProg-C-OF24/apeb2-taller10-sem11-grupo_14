import java.util.Random;
public class ejercicio08 {
    public static void main(String[] args) {
        int numero = 5;
        int[][] matriz = new int[numero][numero];
        Random random = new Random();
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                matriz[i][j] = random.nextInt(19) - 9;
            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\nElementos de la diagonal principal:");
        for (int i = 0; i < numero; i++) {
            System.out.printf("%3d ", matriz[i][i]);
        }

        System.out.println("\nElementos sobre la diagonal principal:");
        for (int i = 0; i < numero; i++) {
            for (int j = i + 1; j < numero; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
        }

        System.out.println("\nElementos bajo la diagonal principal:");
        for (int i = 1; i < numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
        }
    }
}
/*
-1   9   7  -7   2 
  6   1  -2   4   7 
  0   8   5  -6   7 
 -3  -3  -9  -3  -9 
  1   2  -4  -8  -2 
Elementos de la diagonal principal:
 -1   1   5  -3  -2 
Elementos sobre la diagonal principal:
  9   7  -7   2  -2   4   7  -6   7  -9 
Elementos bajo la diagonal principal:
  6   0   8  -3  -3  -9   1   2  -4  -8
*/