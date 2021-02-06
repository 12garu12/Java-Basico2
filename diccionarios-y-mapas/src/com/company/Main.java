package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Map<String, Integer> name = new HashMap<>();
        name = new LinkedHashMap<>();

        name.put("Andres", 30);
        name.put("Juan", 36);
        name.put("Maria", 23);
        name.put("Andrea", 31);
        System.out.println(name);

        // Ciclo forEach para un objeto Map
        for (String n : name.keySet()) {
            System.out.print(n + " ");
        }


    }


}