package com.company.throughInheritance;

public class AdminUserAdapter extends User {

    private Admin admin;

    public AdminUserAdapter(Admin admin) {
        super(admin.getId(), admin.getFirstName() + " " + admin.getLastName());
        this.admin = admin;
    }
}
