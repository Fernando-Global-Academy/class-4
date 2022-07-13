package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Seleccione una opcion: ");
        System.out.println("1) Ex1");
        System.out.println("2) Ex2");
        System.out.println("3) Salir");
        Scanner lector = new Scanner(System.in);
        int option = lector.nextInt();
        while (option != 3) {
            if (option == 1) {
                ex1();
            } else if (option == 2) {
                ex2();
            } else {
                System.out.println("Selecciono una opcion no valida");
            }
            System.out.println("Seleccione una opcion: ");
            System.out.println("1) Ex1");
            System.out.println("2) Ex2");
            System.out.println("3) Salir");
            option = lector.nextInt();
        }
    }

    private static void ex2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("foo");
        }
    }

    private static void ex1() {
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
