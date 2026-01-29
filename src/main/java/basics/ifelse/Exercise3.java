package basics.ifelse;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona la temperatura");
        int grados = sc.nextInt();
        if (grados<=0){
            System.out.println("Freezing");

        } else if (grados>=1&&grados<=10) {
            System.out.println("Very Cold");

        } else if (grados>=11&&grados<=20) {
            System.out.println("Cold");

        } else if (grados>=21&&grados<=30){
            System.out.println("Warm");
        }
        else{
            System.out.println("Hot");
        }
        sc.close();
    }
}
