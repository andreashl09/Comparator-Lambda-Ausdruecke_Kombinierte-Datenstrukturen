package de.example.event_management;

import de.example.event_management.event.Event;
import de.example.event_management.person.Rolle;
import de.example.event_management.person.Participant;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.HashSet;


public class EventManagement {
    static HashMap<LocalDate, HashSet<Event>> dairy = new HashMap<>();
    static HashMap<Event, HashMap<Participant, HashSet<Rolle>>> eventList = new HashMap<>();

    public static void main(String[] args) {

        addEvent("Tanz in Dezember", LocalDate.now(), 18);
        addEvent("Tanz in Januar", LocalDate.now(), 18);
        addEvent("Back in the 80'", LocalDate.now(), 18);
        addEvent("Kinder Disco", LocalDate.now(), 0);

        Participant person1 = new Participant("Bernd das Brot", LocalDate.of(1975, 5, 30));
        Participant person2 = new Participant("Spongebob", LocalDate.of(1990, 3, 23));
        Participant person3 = new Participant("Mr. Krabs", LocalDate.of(1992, 1, 31));

        addEventParticipant("Tanz in Dezember", person1, Rolle.ZUSCHAUER);
//
//        System.out.println(dairy);
        System.out.println(eventList);

    }

    public static void addEvent(String nameEvent, LocalDate date, int age) {
//        System.out.println(dairy.containsKey(date));
        Event event = new Event(nameEvent, date, age);
        if (!dairy.containsKey(date)) {
            dairy.put(date, new HashSet<>());
        }
        dairy.get(date).add(event);

    }

    public static void addEventParticipant(String eventName, Participant participant, Rolle rolle) {
        Event event = getEvent(eventName);
        if (event == null) {
            System.out.println("Event exisiert nicht");
            return;
        }
        long ageEvent = event.getAgeRestriction();
        long diffInYears = ChronoUnit.YEARS.between(participant.getBirthday(), LocalDate.now());

        if (!eventList.containsKey(event)) eventList.put(event, new HashMap<Participant, HashSet<Rolle>>());

        HashMap<Participant, HashSet<Rolle>> participantsMap = eventList.get(event);
        HashSet<Rolle> rolleHashSet = participantsMap.getOrDefault(participant, new HashSet<>());
        rolleHashSet.add(rolle);

        if (diffInYears >= ageEvent) {
            event.getParticipantsList().add(participant);
            participantsMap.put(participant,rolleHashSet);
        }
    }

    public static Event getEvent(String eventName) {
        for (HashSet<Event> eventsSet : dairy.values()) {
            for (Event event : eventsSet) {
                if (event.getName().equals(eventName)) return event;
            }
        }
        return null;
    }
}
