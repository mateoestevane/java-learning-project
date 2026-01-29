package basics.ifelse;


import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<=12) {
            System.out.println("Child");

        } else if(age>=13&&age<=17 ){
            System.out.println("Teenager");

        } else if (age>=18&&age<=59) {
            System.out.println("Adult");

        } else if (age>=60){
            System.out.println("Senior Citizen");


        }
        sc.close();


    }
}
