package com.company.throughInheritance;

public class Client extends User {

    private double credit;

    public Client(int id, String name, double credit) {
        super(id, name);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        Client client = (Client) o;
        return super.equals(client) && this.credit == client.credit;
    }

    @Override
    public String toString() {
        String string = super.toString() + "\n";
        string += "Credit: " + this.credit;
        return string;
    }
}

