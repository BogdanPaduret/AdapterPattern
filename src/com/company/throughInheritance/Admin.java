package com.company.throughInheritance;

public class Admin {

    private int id;
    private String firstName;
    private String lastName;

    public Admin(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        Admin admin = (Admin) o;
        return this.id == admin.id && this.firstName.equals(admin.firstName) && this.lastName.equals(admin.lastName);
    }

    @Override
    public String toString() {
        String string = "";

        string += "ID: " + this.id + "\n";
        string += "First name: " + this.firstName;
        string += "Last name: " + this.lastName;

        return string;
    }
}
