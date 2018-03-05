package com.knoldus.kip.models;

import org.junit.Test;

import java.util.Optional;

public class StudentTest {

    Student testStudent = new Student("Vijay", 1234, Optional.empty());
    Student testStudent2 = new Student("Ajay", 1235, Optional.empty());

    @Test
    public void testEquals() {
        assert(!testStudent.equals(1234));
        assert(!testStudent.equals(testStudent2));
        assert(testStudent != testStudent2);
    }

    @Test
    public void testHashCode() {
        assert(testStudent.hashCode() != 0);
    }

    @Test
    public void testStudentBuilderToString() {
        assert(testStudent.builder().toString() != "");
    }
}
