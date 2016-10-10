package com.db.ncsu.sdc.model;

import java.util.List;

public class Greeting {
    private final long id;
    private final String greeting;
    private final List<String> peopleToGreet;

    public Greeting(long id, String greeting, List<String> peopleToGreet) {
        super();
        this.id = id;
        this.greeting = greeting;
        this.peopleToGreet = peopleToGreet;
    }

    public long getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }

    public List<String> getPeopleToGreet() {
        return peopleToGreet;
    }
}
