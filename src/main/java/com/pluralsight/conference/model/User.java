package com.pluralsight.conference.model;

public class User {

    private long id;
    private String name;

    public User(){};
    public User(long _id, String _name) {
        this.id = _id;
        this.name = _name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
