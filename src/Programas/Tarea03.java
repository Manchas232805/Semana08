package Programas;
import java.util.Scanner;

public class Tarea03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
    }
}
