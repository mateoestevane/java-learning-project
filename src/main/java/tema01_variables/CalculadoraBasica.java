package tema01_variables;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA BASICA");
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();

        double suma, resta, multiplicacion, division;
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;

        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, suma);
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, resta);
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, multiplicacion);

        if (num2 == 0) {
            System.out.printf("%.2f / %.2f = Error: no se puede dividir entre cero",num1,num2);
        } else {
            division = num1 / num2;
            System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, division);
        }

        sc.close();


    }
}
