package basics.Scanners;
import java.util.Scanner;
public class scannerHolaDos {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num1 = scanner.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = scanner.nextInt();

        System.out.println("La suma de esos dos numeros es: " + (num1+num2));

    }
}
