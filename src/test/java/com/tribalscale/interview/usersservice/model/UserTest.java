package com.tribalscale.interview.usersservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void canNotGetFullName() {
        assertNotEquals("Harry Potter", user.toString());
    }

    @Test
    public void canGetFullName() {
        user.setFirstName("Harry ");
        user.setLastName("Potter");

        assertEquals("Harry Potter", user.toString());
    }
}
