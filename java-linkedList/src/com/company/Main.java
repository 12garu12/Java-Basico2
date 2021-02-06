package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /**************************************************************************************************************

         ArrayList vs. LinkedList
         La LinkedListclase es una colección que puede contener muchos objetos del mismo tipo, al igual que el ArrayList.
         La LinkedListclase tiene todos los mismos métodos que la ArrayListclase porque ambos implementan la
         Listinterfaz. Esto significa que puede agregar elementos, cambiar elementos, eliminar elementos y borrar la
         lista de la misma manera.
         Sin embargo, aunque la ArrayListclase y la LinkedListclase se pueden usar de la misma manera, se crean de
         manera muy diferente.

         Cómo funciona ArrayList
         La ArrayListclase tiene una matriz regular dentro de ella. Cuando se agrega un elemento, se coloca en
         la matriz. Si la matriz no es lo suficientemente grande, se crea una nueva matriz más grande para reemplazar
         la anterior y se elimina la anterior.

         Cómo funciona la LinkedList
         El LinkedListalmacena sus artículos en "contenedores". La lista tiene un enlace al primer contenedor y cada
         contenedor tiene un enlace al siguiente contenedor de la lista. Para agregar un elemento a la lista, el
         elemento se coloca en un nuevo contenedor y ese contenedor está vinculado a uno de los otros contenedores
         de la lista.

         Cuándo usar
         Es mejor usar un ArrayListcuando:

         Desea acceder a elementos aleatorios con frecuencia
         Solo necesita agregar o eliminar elementos al final de la lista
         Es mejor usar un LinkedListcuando:

         Solo usa la lista recorriéndola en lugar de acceder a elementos aleatorios
         Con frecuencia necesita agregar y eliminar elementos desde el principio o la mitad del
         list

         Métodos LinkedList
         Para muchos casos, ArrayListes más eficiente ya que es común necesitar acceso a elementos aleatorios en la
         lista, pero LinkedListproporciona varios métodos para realizar ciertas operaciones de manera más eficiente:
         */

        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Agrega un elemento al principio del array
        cars.addFirst("Ferrari");
        System.out.println(cars);
        System.out.println(cars.getClass().getSimpleName());

        // Agrega un elemento al final del array
        cars.addLast("Lamborghini");
        System.out.println(cars);

        // Elimina el primer elemento del array
        cars.removeFirst();
        System.out.println(cars);

        // Elinima el ultimo elemento del array
        cars.removeLast();
        System.out.println(cars);

        // Obtiene el valor del primer elemento
        System.out.println(cars.getFirst());

        // Obtiene el ultimo elemento de la lista
        System.out.println(cars.getLast());

        // Obtiene el elemento por el incice especificado
        System.out.println(cars.get(2));

        // Hace una copia del Objeto
        Object newCars = cars.clone();
        System.out.println(newCars);

        // Obtiene el primer elemento del array
        System.out.println(cars.element());

        // Ciclo foreach para obtener los elementos en la matriz
        for (String car : cars) {
            System.out.print(car + " " + "\n");
        }

        // Elimina todos los elementos de la matriz
        //cars.clear();
        //System.out.println(cars);

        int cont = cars.size();
        System.out.println(cont);


    }
}
