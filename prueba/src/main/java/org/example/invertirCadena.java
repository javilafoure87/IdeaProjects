package org.example;

import java.util.Scanner;

public class invertirCadena {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Ingrese texto:");
        String originalCad = texto.next();
        String invertidaCad = "";

        for (int i = 0; i < originalCad.length(); i++){
            invertidaCad = originalCad.charAt(i) + invertidaCad;
        }
        System.out.println("cadena invertida: " + invertidaCad);
    }
}
