package com.company;

import com.company.throughInheritance.Admin;
import com.company.throughInheritance.AdminUserAdapter;
import com.company.throughInheritance.Client;
import com.company.throughInheritance.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void adapterInheritanceTest() {
        User user = new User(0,"Ion Popescu");
        User client = new Client(1, "Simon", 234.67);
        Admin admin = new Admin(0, "Ion", "Popescu");

        User adminAdapter = new AdminUserAdapter(admin);

        assertTrue(user.toString().equals(adminAdapter.toString()));
        assertTrue(adminAdapter instanceof User);
    }

}