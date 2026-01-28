package basics;


import java.util.Scanner;

public class scannerHolaTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double peso;
        double altura;
        String nombre;
        System.out.println("Introduce tu nombre completo: " );
        nombre = scanner.nextLine();
        System.out.println("Introduce tu peso: ");
        peso = scanner.nextDouble();
        System.out.println("Introduce tu altura: ");
        altura = scanner.nextDouble();
        System.out.println("Tu nombre completo es: " + nombre + " y tu IMC es de: " + (peso/Math.pow(altura,2)));



    }
}
