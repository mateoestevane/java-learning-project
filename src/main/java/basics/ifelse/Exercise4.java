package basics.ifelse;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de tareas completadas: ");
        int tareasCompletadas = sc.nextInt();
        System.out.println("Introduce el numero de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        if (tareasCompletadas >= 10 && horasTrabajadas >= 40) {
            System.out.println("Excellent");

        } else if (tareasCompletadas >= 5 && horasTrabajadas >= 30) {
            System.out.println("Good");

        } else if (tareasCompletadas >= 3 && horasTrabajadas >= 20) {
            System.out.println("Average");

        } else {
            System.out.println("Poor");
        }
        sc.close();
    }
}
