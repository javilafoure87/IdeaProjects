package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class expresionRegular {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("ingrese palabra: ");
        Pattern pattern = Pattern.compile(reader.next(), Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("te amo mamor");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("palabra encontrada");
        }else System.out.println("palabra no encontrada");
    }
}
