package com.company;

public class Rectangulo extends DosDimensiones {

    // Constructor por defecto
    Rectangulo() {
        super();
    }

    Rectangulo(double b, double h) {
        super(b, h, "Rectangulo");
    }

    Rectangulo(double x) {
        super(x, "Rectangulo");
    }

    Rectangulo(Rectangulo ob) {
        super(ob);
    }

    boolean esCuadrado() {
        if (getAltura() == getBase()) return true;
        return false;
    }

    double area() {
        return getBase() * getAltura();
    }
}
