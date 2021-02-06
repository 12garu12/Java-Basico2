package com.company;

public class DeTres implements Series {
    int iniciar;
    int valor;

    DeTres() {
        iniciar = 0;
        valor = 0;
    }

    public int getSiguiente() {
        valor += 3;
        return valor
    }


    public void reiniciar() {
        valor = iniciar;
    }


    public void setComenzar(int x) {
        iniciar = x;
        valor = x;
    }
}
