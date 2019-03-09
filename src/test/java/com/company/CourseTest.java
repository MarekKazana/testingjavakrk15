package com.company;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CourseTest {

    public static final String ANY_COURSE_NAME = "Course Name";

    @Test
    public void shouldHaveTheSameName() {
        Course course = new Course(ANY_COURSE_NAME, LocalDate.now());

        String result = course.name();
        assertEquals(ANY_COURSE_NAME, result);
    }

    @Test
    public void shouldHaveStartedBeforeGivenDate() {
        LocalDate startDate;
        Course course = new Course("kol", LocalDate.of(2019, 3, 1));
        LocalDate presentDate = LocalDate.now();

        boolean result = course.wasStartedBefore(presentDate);
        assertTrue(result);
    }

    @Test
    public void shouldHaveStartDateNotBefore() {
        Course course = new Course(ANY_COURSE_NAME, LocalDate.of(2019, 3, 1));
        LocalDate presentDate  =LocalDate.of(2018, 3, 1);

        boolean result = course.wasStartedBefore(presentDate);
        assertFalse(result);
    }

    @Test
    public void shouldHaveNotStarted(){
        Course course = new Course(ANY_COURSE_NAME, LocalDate.now().plusDays(2));

        boolean result = course.isStarted();

        assertFalse(result);
    }

}