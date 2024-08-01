package de.example.event_management.event;

import de.example.event_management.person.Participant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Event extends HashSet<Event> {

    private String name;
    private LocalDate date;
    private int ageRestriction;
    private ArrayList<Participant> participantsList;

    public Event(String name, LocalDate date, int age) {
        this.name = name;
        this.date = date;
        this.ageRestriction = age;
        participantsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public ArrayList<Participant> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(ArrayList<Participant> participantsList) {
        this.participantsList = participantsList;
    }

    @Override
    public String toString() {
        return "Veranstaltung{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", fsk=" + ageRestriction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Event event = (Event) o;
        return getAgeRestriction() == event.getAgeRestriction() && Objects.equals(getName(), event.getName()) && Objects.equals(getDate(), event.getDate()) && Objects.equals(getParticipantsList(), event.getParticipantsList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getDate(), getAgeRestriction(), getParticipantsList());
    }
}

