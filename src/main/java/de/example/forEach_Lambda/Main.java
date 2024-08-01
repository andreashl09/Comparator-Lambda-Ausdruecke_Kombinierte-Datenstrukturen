package de.example.forEach_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of(
                "Wenn",
                " ich",
                " einmal",
                " groß",
                " bin,",
                " möchte",
                " ich",
                " ein",
                " cooler",
                " Java-Programmieren",
                " werden."
        ));
        StringBuilder sb = new StringBuilder();
        list.forEach(string -> sb.append(string));
        String fromBuilder = sb.toString();
        System.out.print(fromBuilder);

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            intList.add(i);
        }
        List<Integer> newIntList = new ArrayList<>();
        intList.forEach(zahl -> newIntList.add(+zahl * zahl));
        System.out.println(newIntList);

        list.forEach(name -> System.out.println(name.strip().length()));
    }

}
