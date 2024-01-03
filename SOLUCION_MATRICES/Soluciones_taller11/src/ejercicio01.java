import java.util.Scanner;
import java.util.Random;
//autor : EIMER
public class ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numEstudiantes = 2;
        String[] nombresEstudiantes = new String[numEstudiantes];
        double[] promediosEstudiantes = new double[numEstudiantes];

        // Generar aleatoriamente las notas y calcular promedios
        for (int i = 0; i < numEstudiantes; i++) {
            // Registro de nombres
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombresEstudiantes[i] = teclado.nextLine();

            // Generar aleatoriamente las notas ACD, APE y AA
            double notaACD = random.nextDouble() * 10;
            double notaAPE = random.nextDouble() * 10;
            double notaAA = random.nextDouble() * 10;

            // Calcular promedio con ponderación
            double promedio = (notaACD * 0.35) + (notaAPE * 0.35) + (notaAA * 0.3);
            promediosEstudiantes[i] = promedio;
        }

        // Calcular promedio del paralelo
        double promedioParalelo = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            promedioParalelo += promediosEstudiantes[i];
        }
        promedioParalelo /= numEstudiantes;

        // Mostrar promedio del paralelo
        System.out.println("\nPromedio del paralelo: " + promedioParalelo);

        // Listar estudiantes con promedio por encima del promedio del paralelo
        System.out.println("\nEstudiantes con promedio por encima del promedio del paralelo:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promediosEstudiantes[i] > promedioParalelo) {
                System.out.println(nombresEstudiantes[i] + ": " + promediosEstudiantes[i]);
            }
        }

        // Listar estudiantes con promedio por debajo del promedio del paralelo
        System.out.println("\nEstudiantes con promedio por debajo del promedio del paralelo:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promediosEstudiantes[i] < promedioParalelo) {
                System.out.println(nombresEstudiantes[i] + ": " + promediosEstudiantes[i]);
            }
        }

        // Encontrar estudiante con el mayor promedio
        int indiceMayor = 0;
        for (int i = 1; i < numEstudiantes; i++) {
            if (promediosEstudiantes[i] > promediosEstudiantes[indiceMayor]) {
                indiceMayor = i;
            }
        }

        // Mostrar estudiante con el mayor promedio
        System.out.println("\nEstudiante con el mayor promedio: " + nombresEstudiantes[indiceMayor] +
                ", Promedio: " + promediosEstudiantes[indiceMayor]);

        // Encontrar estudiante con el menor promedio
        int indiceMenor = 0;
        for (int i = 1; i < numEstudiantes; i++) {
            if (promediosEstudiantes[i] < promediosEstudiantes[indiceMenor]) {
                indiceMenor = i;
            }
        }

        // Mostrar estudiante con el menor promedio
        System.out.println("Estudiante con el menor promedio: " + nombresEstudiantes[indiceMenor] +
                ", Promedio: " + promediosEstudiantes[indiceMenor]);
    } 
}
/*
Ingrese el nombre del estudiante 1: pablo
Ingrese el nombre del estudiante 2: eimer
Promedio del paralelo: 7.42849271737917
Estudiantes con promedio por encima del promedio del paralelo:
eimer: 8.971490156092095
Estudiantes con promedio por debajo del promedio del paralelo:
pablo: 5.885495278666245
Estudiante con el mayor promedio: eimer, Promedio: 8.971490156092095
Estudiante con el menor promedio: pablo, Promedio: 5.885495278666245
*/