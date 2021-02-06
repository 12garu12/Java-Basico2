package com.company;

public class Recursion {

    public int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public int tailSuma(int currentSum, int n) {
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSuma(currentSum + n, n - 1);
    }

    public int numeros(int n) {
        if (n <= 1) {
            return n;
        }
        System.out.println(numeros(n - 1));
        return n;
    }


}
