package basics;

import java.util.Scanner;

public class ExtraerChar {
    public static void main(String[] args) {

        char inicial;
        String nombre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola papu, introduce tu nombre: ");
        nombre = scanner.nextLine();

        inicial = nombre.charAt(0);
        System.out.println("Tu inicial es: " + inicial);





    }
}
