package co.edu.sena.oop2900274;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado de un cuadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        double perimetro = 4 * lado;

        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

        scanner.close();
}
}