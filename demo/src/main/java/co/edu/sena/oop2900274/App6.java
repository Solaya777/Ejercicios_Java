package co.edu.sena.oop2900274;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double areaCilindro = 2 * Math.PI * radio * (radio + altura);
        // La fórmula para el área del cilindro es:2πr(r+h), y en Java se puede usar "Math.PI", para representar el número pi

        double volumen = Math.PI * radio * radio * altura;

        // La fórmula para el volumen es: πr^2h.

        System.out.println("El área del cilindro es: " + areaCilindro);
        System.out.println("El volumen del cilindro es: " + volumen);

        scanner.close();
    }
    
}
