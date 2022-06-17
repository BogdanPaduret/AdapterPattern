package com.company.throughInheritance;

public class User {

    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String string = "";

        string += "ID: " + this.id + "\n";
        string += "Name: " + this.name;

        return string;
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return this.id == user.id && this.name.equals(user.name);
    }
}
