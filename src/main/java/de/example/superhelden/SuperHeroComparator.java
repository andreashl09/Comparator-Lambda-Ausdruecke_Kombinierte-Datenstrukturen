package de.example.superhelden;

import java.util.Comparator;

public class SuperHeroComparator {

    public Comparator<Superhero> nameComparator = new Comparator<Superhero>() {
        @Override
        public int compare(Superhero o1, Superhero o2) {
            return (o1.getName().compareTo(o2.getName()));
        }
    };

    public Comparator<Superhero> speedComparator = (o1, o2) -> -(Double.compare(o1.getSpeed(), o2.getSpeed()));

    public Comparator<Superhero> powerLevelComparator = (o1, o2) -> -(Integer.compare(o1.getPowerLevel(), o2.getPowerLevel()));

    public Comparator<Superhero> nameLengthComparator = new Comparator<Superhero>() {
        @Override
        public int compare(Superhero o1, Superhero o2) {
            int length1 = o1.getName().length();
            int length2 = o2.getName().length();

            if (length1 > length2) return 1;
            if (length1 < length2) return -1;

            return o1.getName().compareTo(o2.getName());
        }
    };


}
