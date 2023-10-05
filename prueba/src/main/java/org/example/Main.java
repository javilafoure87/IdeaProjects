package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner mySum = new Scanner(System.in);
        System.out.println("ingrese primer numero: ");
        x = mySum.nextInt();
        System.out.println("ingrese segundo numero: ");
        y = mySum.nextInt();
        sum = x + y;
        System.out.println("la suma de los numeros ingresados es: " + sum);
    }

}