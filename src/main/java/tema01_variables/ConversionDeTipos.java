package tema01_variables;

import java.sql.SQLOutput;

public class ConversionDeTipos {
    public static void main(String[] args) {

        System.out.println("int a double");
        int entero = 20;
        double auto = entero; // int a double
        System.out.println(auto);
        System.out.println(entero);

        System.out.println("double a int");
        double precio = 3.99;
        int precioEntero = (int) precio; // double a int
        System.out.println(precio);
        System.out.println(precioEntero);

        System.out.println("String a int");
        String textoNum = "777";
        int numero = Integer.parseInt(textoNum); // String a int
        System.out.println(textoNum);
        System.out.println(numero);
        System.out.println(numero + 3);
        System.out.println();

        System.out.println("Int a String");
        int edad = 25;
        String edadTexto = String.valueOf(edad); // numero a string
        System.out.println(edad);
        System.out.println(edadTexto);



    }
}
