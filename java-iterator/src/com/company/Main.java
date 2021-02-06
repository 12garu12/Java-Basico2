package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*********************************************************************************************************
         Iterador de Java
         Un Iteratores un objeto que se puede usar para recorrer colecciones, como ArrayList y HashSet . Se
         llama "iterador" porque "iterar" es el término técnico para el bucle.
         Para usar un iterador, debe importarlo desde el java.utilpaquete.
         Conseguir un iterador
         El iterator()método se puede usar para obtener un Iteratorpara cualquier colección:

         Ejemplo
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        numbers.add(8);

        // nombrar el iterador
        Iterator<Integer> iator = numbers.iterator();
        System.out.println(iator.next());

        while (iator.hasNext()) {
            System.out.print(iator.next() + " ");
        }
        System.out.println();

        ArrayList<Integer> num = new ArrayList<>();
        System.out.println(num);
        num.add(12);
        num.add(8);
        num.add(2);
        num.add(23);

        Iterator<Integer> iterador = num.iterator();

        while (iterador.hasNext()) {
            Integer i = iterador.next();
            if (i < 10) {
                iterador.remove();
            }
        }
        System.out.println(num);


    }
}
