package org.example.lambda;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner nom = new Scanner(System.in);
        ICalculadora calculadora = (n) -> System.out.println(n+" Esto es una calculadora");
        System.out.println("Ingrese nombre: ");
        calculadora.mensaje(nom.next());
    }
}
