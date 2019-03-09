package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Course {

    private final String name;
    private final LocalDate startDate;

    public Course(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }


    public String name(){

        return name;
    }

    public  boolean wasStartedBefore(LocalDate date) {
        return startDate.isBefore(date);
        }

    public boolean isStarted(){

        return wasStartedBefore(LocalDate.now());
        }
    }

