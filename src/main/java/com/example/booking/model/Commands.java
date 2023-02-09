package com.example.booking.model;

public enum Commands {
    OB("Online board"),
    SFI("Show flight info"),
    SNBF("Search and book a flight"),
    CB("Cancel the booking"),
    MYF("My flights"),
    EXIT("Exit");

    private final String description;

    Commands(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
