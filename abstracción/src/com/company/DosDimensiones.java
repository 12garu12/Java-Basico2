package com.company;
/*
Clase abstracta
Una forma en que puede ocurrir esta situación es cuando una superclase no puede crear una implementación
significativa para un método. Este es el caso con la versión de DosDimensiones utilizada en el siguiente ejemplo.

Usando una clase abstracta, puede mejorar la clase DosDimensiones. Dado que no existe un concepto significativo de área
para una figura bidimensional indefinida, la siguiente versión del programa declara area() como abstract dentro de
DosDimensiones, y también DosDimensiones como abstract. Esto, por supuesto, significa que todas las clases derivadas
de DosDimensiones deben anular area().
*/

abstract class DosDimensiones {
    private double base;
    private double altura;
    private String nombre;

    // Constructor por defecto
    DosDimensiones() {
        base = altura = 0.0;
        nombre = "ninguno";
    }

    // Parametrizando constructor
    DosDimensiones(double b, double h, String n) {
        base = b;
        altura = h;
        nombre = n;
    }

    // Construir objeto con misma base y altura
    DosDimensiones(double x, String n) {
        base = altura = x;
        nombre = n;
    }

    // Construir un objeto desde un objeto
    DosDimensiones(DosDimensiones dd) {
        altura = dd.altura;
        base = dd.base;
        nombre = dd.nombre;
    }

    // Metodos de acceso para base y altura
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void mostrarDimension() {
        System.out.println("La base y la altura son: " + base + " y " + altura);
    }

    abstract double area();
}
