package org.example;

interface StringFunction{
    String run(String str);
}
public class Main {
    public static void main(String[] args) {
        StringFunction exclam = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormat("hola", exclam);
        printFormat("hola", ask);
    }
    public static void printFormat(String str, StringFunction format){
        String resultado = format.run(str);
        System.out.println(resultado);
    }

    }
