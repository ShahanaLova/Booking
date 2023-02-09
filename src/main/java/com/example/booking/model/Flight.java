package com.example.booking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    private long id;
    private LocalDateTime flightDate;
    private String from;
    private String to;
    private Integer aviableSeats;


}
