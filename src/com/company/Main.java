package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = lector.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = lector.nextInt();
        if (num1 > num2) {
            System.out.println("El numero mas alto es: " + num1);
        } else if (num1 < num2) {
            System.out.println("El numero mas alto es: " + num2);
        } else {
            System.out.println("Ambos numeros son iguales");
        }
    }
}
