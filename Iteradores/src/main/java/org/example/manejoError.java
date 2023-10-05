package org.example;

import java.util.Scanner;

public class manejoError {
    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("acceso negado a menores de edad");
        }
        else System.out.println("acceso consedido");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("ingrese su edad");
        checkAge(reader.nextInt());
    }
}

