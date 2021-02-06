package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 10; i >= 0; i--) {
            numbers.add(i);
        }
        System.out.println(numbers);

        System.out.println(numbers.get(2));

        numbers.set(0, 10000);
        System.out.println(numbers);

        numbers.remove(0);
        System.out.println(numbers);

        //numbers.clear(); // elimina todo el array;

        // Para saber cuántos elementos tiene un arrayList, utilice metodo size;
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(" " + numbers.get(i));
        }
        System.out.println();
        System.out.println(numbers.getClass().getSimpleName()); // Para el tipo de dato

        /**************************************************************************************************************
         Ordenar una lista de matriz
         Otra clase útil en el java.utilpaquete es la Collectionsclase, que incluye el sort()método para ordenar listas alfabéticamente o numéricamente:

         Ejemplo
         Ordenar una matriz de listas de cadenas
         */

        ArrayList<Integer> numbers2 = new ArrayList<>();
        System.out.println(numbers2);
        numbers2.add(3);
        numbers2.add(1000);
        numbers2.add(200);
        numbers2.add(139);
        numbers2.add(500);
        numbers2.add(299);
        numbers2.add(488);
        System.out.println(numbers2);
        Collections.sort(numbers2); // Metodo Collection.sort organiza la matriz en orden ascendente
        System.out.println(numbers2);

        Object matriz = numbers2.clone(); // Metodo para clonar un Object
        System.out.println(matriz);
        System.out.println(numbers2.get(numbers2.size() - 1));


    }
}
