package org.example;

import java.util.ArrayList;

public class expresionesLambda {
    public static void main(String[] args) {

        ArrayList<String> saludo= new ArrayList<>();

        saludo.add("hola");
        saludo.add("mundo");
        saludo.forEach((n) -> {
            System.out.println(n);
        });

    }
}
