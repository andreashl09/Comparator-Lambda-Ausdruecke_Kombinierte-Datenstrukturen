package de.example.event_management.person;

import java.time.LocalDate;

public class Participant {
    private String name;
    private LocalDate birthday;

    public Participant(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
