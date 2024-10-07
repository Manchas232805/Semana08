package Programas;
import java.util.Scanner;

public class Tarea02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        int nAlumnos = scanner.nextInt();
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 1; i <= nAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = scanner.nextDouble();
            if (nota >= 11.0) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Total de aprobados: " + aprobados);
        System.out.println("Total de desaprobados: " + desaprobados);
    }
}