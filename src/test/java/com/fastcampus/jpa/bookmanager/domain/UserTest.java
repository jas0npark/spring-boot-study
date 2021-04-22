package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("pjs910618@gmail.com");
        user.setName("Jason Park");

        System.out.println(":::::" + user);
    }
}