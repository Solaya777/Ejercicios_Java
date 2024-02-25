package co.edu.sena.oop2900274;

import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres números para saber su promedio: ");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();

        double promedio = (numero1+numero2+numero3)/3; 

        System.out.println("El promedio de los 3 números ingresados es de :"+promedio);

        scanner.close();
    }
    
}
