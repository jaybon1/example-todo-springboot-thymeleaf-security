package com.example.my;

import java.time.Instant;

public class TempMain {
    public static void main(String[] args) {

        Instant instant = Instant.now();

        System.out.println(instant);

        Instant instant1 = Instant.parse("2024-10-16T10:00:00Z");

        System.out.println(instant1);

    }
}
