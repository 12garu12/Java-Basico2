package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*************************************************************************************************************
         Java HashSet
         Un HashSet es una colección de artículos donde cada artículo es único, y se encuentra en el java.util paquete:

         Ejemplo
         Cree un HashSetobjeto llamado autos que almacenará cadenas:
         */

        HashSet<String> cars = new HashSet<>();
        System.out.println(cars);

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Masda");
        System.out.println(cars); /*Nota: En el ejemplo anterior, aunque BMW se agrega dos veces, solo aparece una vez
                                    en el conjunto porque cada elemento de un conjunto tiene que ser único.*/

        /*Comprobar si existe un artículo
        Para verificar si un elemento existe en un HashSet, use el contains()método:*/
        System.out.println(cars.contains("BMW"));

        /*Eliminar un artículo
        Para eliminar un elemento, use el remove()método:*/
        cars.remove("Volvo");
        System.out.println(cars);

        /* Para eliminar todos los elementos, use el clear()método: */
        /*cars.clear();
        System.out.println(cars);*/

        // Para recorrer el Hashset
        for (String car : cars) {
            System.out.println(car);
        }

        /*
        HashSet Size
        Para saber cuántos elementos hay, use el sizemétodo */
        System.out.println(cars.size());


    }
}
