package com.company;

public class Triangulo extends DosDimensiones {

    private String estilo;

    Triangulo() {
        super();
        estilo = "ninguno";
    }

    Triangulo(String s, double b, double h) {
        super(b, h, "Triangulo"); // llama al constructor de la super clase
        estilo = s;
    }

    Triangulo(double x) {
        super(x, "Triangulo"); // llama al constructor de la super clase
        estilo = "Estilo 1";
    }

    Triangulo(Triangulo t) {
        super(t);                 // llama al constructor de la super clase
        estilo = t.estilo;
    }

    double area() {
        return getAltura() * getBase();
    }

    void mostrarEstilo() {
        System.out.println("El triángulo tieme: " + estilo);
    }

}
