package co.edu.sena.oop2900274;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double longitud = 2 * Math.PI * radio;

        // Para calcular el radio usaremos dos veces PI por el radio .

        double area = Math.PI * Math.pow(radio, 2);

        // Para calcular el área usaremos la función de java "Math.pow" que nos permite
        // potenciar, agregado a eso le damos el valor a la potencia, en este caso es 2
        // para que la formula pueda funcionar correctamente

        //La fomrula es dos veces el radio por PI.

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }
}
