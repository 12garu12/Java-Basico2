package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*************************************************************************************************************
         1. Información general
         La creación de una ArrayList multidimensional a menudo aparece durante la programación. En muchos casos,
         existe la necesidad de crear una ArrayList bidimensional o una ArrayList tridimensional .
         En este tutorial, discutiremos cómo crear una ArrayList multidimensional en Java.

         2.  Lista de matriz bidimensional
         Supongamos que queremos representar una gráfica con 3 vértices, numerados del 0 al 2. Además, supongamos
         que hay 3 aristas en la gráfica (0, 1), (1, 2) y (2, 0), donde un par de vértices representa un borde.
         Podemos representar los bordes en una ArrayList 2D  creando y rellenando una  ArrayList  de ArrayList s.
         Primero, creemos una nueva lista de matriz 2-D :
         */

        /*Primero, creemos una nueva lista de matriz 2-D :  */
        int vertexConunt = 3; // (0, 1), (1, 2) y (2, 0)
        ArrayList<ArrayList<Integer>> grafico = new ArrayList<>(vertexConunt);

        /* A continuación, inicializaremos cada elemento de ArrayList con otra ArrayList :  */
        for (int i = 0; i < vertexConunt; i++) {
            grafico.add(new ArrayList<>());
        }

        /* Finalmente, podemos agregar todos los bordes (0, 1), (1, 2) y (2, 0), a nuestra ArrayList 2-D :         */
        grafico.get(0).add(1);
        grafico.get(1).add(2);
        grafico.get(2).add(0);

        /* Supongamos también que nuestro gráfico no es un gráfico dirigido. Entonces, también necesitamos agregar
        los bordes (1, 0), (2, 1) y (0, 2), a nuestra ArrayList 2-D :   */

        grafico.get(1).add(0);
        grafico.get(2).add(1);
        grafico.get(0).add(2);

        /* Luego, para recorrer todo el gráfico, podemos usar un doble bucle for:  */
        int cuentaDeVertices = grafico.size();
        for (int i = 0; i < cuentaDeVertices; i++) {
            int cuentaDeBorde = grafico.get(i).size();
            for (int j = 0; j < cuentaDeBorde; j++) {
                Integer inicioDeVertice = i;
                Integer finalDeVertice = grafico.get(i).get(j);
                System.out.printf("Vertex %d is connected to vertex %d%n", inicioDeVertice, finalDeVertice);
            }
        }
        System.out.println();
        System.out.println(grafico);

        for (int i = 0; i < grafico.size(); i++) {
            System.out.printf("(%d, %d)", grafico.get(i).get(0), grafico.get(i).get(1));
            System.out.println();
        }


    }
}
