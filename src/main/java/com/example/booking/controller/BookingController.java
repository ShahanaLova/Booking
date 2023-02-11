package com.example.booking.controller;

import com.example.booking.model.Booking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
@GetMapping
public List<Booking> getHello() {
    return new ArrayList<>();
}
}
