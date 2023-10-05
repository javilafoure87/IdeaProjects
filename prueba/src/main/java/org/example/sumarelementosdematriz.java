package org.example;

public class sumarelementosdematriz {
    public static void main(String[] args) {
        int[] miAreglo = {1 , 2, 3 ,25};
        int sum = 0, i;

        for (i = 0; i < miAreglo.length; i++){
            sum += miAreglo[i];
        }
        System.out.println("La suma de los valores del arreglo es: " + sum);
    }
}
