package de.example.superhelden;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Superhero> superheroes = new ArrayList<>(List.of(
                new Superhero(Category.HERO, 100_000, 50_000, "Superman"),
                new Superhero(Category.HERO, 1, 0.024, "Batman"),
                new Superhero(Category.VILLIAN, 1, 0.025, "Lex Luthor"),
                new Superhero(Category.VILLIAN, 1, 0.021, "Joker"),
                new Superhero(Category.HERO, 20, 2, "Spiderman"),
                new Superhero(Category.HERO, 100_000, 10, "Wonder Woman"),
                new Superhero(Category.HERO, 100, 10, "Iron Man"),
                new Superhero(Category.VILLIAN, 10, 0.021, "Green Goblin"),
                new Superhero(Category.VILLIAN, 100_000, 5, "Green Goblin"),
                new Superhero(Category.VILLIAN, 500, 0.025, "Magento")

        ));

        dashedLine("unsortiert");
        superheroes.forEach(System.out::println);
        System.out.println(" ");

        dashedLine("sortiert nach PowerLevel - absteigend");
        superheroes.sort(new SuperHeroComparator().powerLevelComparator);
        superheroes.forEach(System.out::println);
        System.out.println(" ");

        dashedLine("sortiert nach Speed - absteigend");
        superheroes.sort(new SuperHeroComparator().speedComparator);
        superheroes.forEach(System.out::println);
        System.out.println(" ");

        dashedLine("sortiert nach Namen");
        superheroes.sort(new SuperHeroComparator().nameComparator);
        superheroes.forEach(System.out::println);
        System.out.println(" ");

        dashedLine("sortiert nach Länge des Namens");
        superheroes.sort(new SuperHeroComparator().nameLengthComparator);
        superheroes.forEach(System.out::println);
        System.out.println(" ");

        dashedLine("sortiert nach Power-Level und Speed - absteigend");
        superheroes.sort(new SuperHeroComparator().powerLevelComparator.thenComparing(new SuperHeroComparator().speedComparator));
        superheroes.forEach(System.out::println);




    }

    public static void dashedLine (String name){
        int lengthMax = 80;
        int length = (lengthMax - name.length())/2;
        boolean isNamePrint = true;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }

            if(isNamePrint) {
                System.out.print(" " + name + " ");
                isNamePrint = false;
            }
        }
        System.out.println(" ");

    }
}
