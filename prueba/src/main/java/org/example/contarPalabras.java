package org.example;

public class contarPalabras {
    public static void main(String[] args) {
        String palabras = "uno, dos, tres, cuatro";
        int countPalabras = palabras.split("\\s").length;
        System.out.println(countPalabras);
    }
}
