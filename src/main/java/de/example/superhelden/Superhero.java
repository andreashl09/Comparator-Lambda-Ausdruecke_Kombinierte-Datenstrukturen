package de.example.superhelden;

public class Superhero {
    private String name;
    private double speed;
    private int powerLevel;
    private Category category;

    public Superhero(Category category, int powerLevel, double speed, String name) {
        this.category = category;
        this.powerLevel = powerLevel;
        this.speed = speed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                " Mach, powerLevel=" + powerLevel +
                " Tonnen, category=" + category +
                '}';
    }
}
