package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        DosDimensiones formas[] = new DosDimensiones[4];

        formas[0] = new Triangulo("Estilo 1", 8.0, 12.0);
        formas[1] = new Rectangulo(10);
        formas[2] = new Rectangulo(10, 4);
        formas[3] = new Triangulo(7.0);

        System.out.println("*******************************************************************************************");

        for (int i = 0; i < formas.length; i++) {
            System.out.println("El objeto es: " + formas[i].getNombre());
            System.out.println("El área es: " + formas[i].area());
            System.out.println();
        }

        System.out.println();

    }
}
