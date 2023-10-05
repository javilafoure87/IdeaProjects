package org.example;

import java.util.ArrayList;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        Main hilo = new Main();
        hilo.start();
        System.out.println(amount);
        amount ++;
        System.out.println(amount);
    }
    public void run(){
        amount++;

        /*ArrayList<String> cars = new ArrayList<String>();
        cars.add("Nissan");
        cars.add("Toyota");
        cars.add("kia");

        Iterator<String> it = cars.iterator();

        //System.out.println(it.next());
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
    }
}