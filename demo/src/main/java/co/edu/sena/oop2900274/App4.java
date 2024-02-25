package co.edu.sena.oop2900274;

import java.util.Scanner;

public class App4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros: ");
        double euros = scanner.nextDouble();

        //Conversión
        double tasaConversion = 1.08; 

        double dolares = euros * tasaConversion;

        System.out.println("A día de hoy "+ euros + " euros equivalen a " + dolares + " dólares.");

        scanner.close();
    }
    
}
