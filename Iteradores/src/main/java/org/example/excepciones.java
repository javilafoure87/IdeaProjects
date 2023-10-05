package org.example;

import java.util.Scanner;

public class excepciones {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {

            int[] myNUmbers = {1,2,3};
            System.out.println("Ingrese numero");
            System.out.println(myNUmbers[reader.nextInt()]);
        } catch (Exception e){
            System.out.println("numero no encontrado");
        } finally {
            System.out.println("termina manejo de error");
        }



    }

}
