package Programas;
import java.util.Scanner;
import java.text.DecimalFormat;
/*
Ingrese notas de estudiantes ingrese su nombre, la nota mayor y promedio total
 */
public class Tarea01 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        int i, nAlum;
        double promN, notas, nTotal, mayor;
        String nombre, xnombre;
        nombre = "";
        xnombre = "";
        nTotal = 0.0;
        mayor = 0.0;
        promN = 0.0;
        System.out.print("Ingrese la cantidad de alumnnos: ");
        nAlum = lectura.nextInt();
        for(i = 1; i <= nAlum;i++) {
            System.out.print("Ingrese el nombre del alumno " + i + " : " );
            nombre = lectura.next();
            System.out.print("Ingrese la nota del alumno: ");
            notas = lectura.nextDouble();
            nTotal += notas;
            if(notas >= mayor){
                mayor = notas;
                xnombre = nombre;
            }
        }
        promN = nTotal/nAlum;
        DecimalFormat nd = new DecimalFormat("0.00");
        System.out.println("El promedio total de notas es: " + nd.format(promN));
        System.out.println(xnombre + " tiene la nota mayor con " + mayor);
    }
}
