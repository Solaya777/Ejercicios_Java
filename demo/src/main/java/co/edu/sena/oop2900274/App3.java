package co.edu.sena.oop2900274;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        double cuadrado = numero * numero;

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

    
        scanner.close();
    }
}
