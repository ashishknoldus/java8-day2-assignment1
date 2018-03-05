package com.knoldus.kip.repo;

import org.junit.Test;

public class DummyDatabaseTest {

    DummyDatabase testDB = new DummyDatabase();

    @Test
    public void testGetStudentsWithNoSubject() {
        assert(testDB.getStudentsWithNoSubject(123).size() == 1);
    }

    @Test
    public void testGetSubjectsOfStudents() {
        assert(testDB.getSubjectsOfStudents(123).contains("Chemistry"));
    }

    @Test
    public void testGetStudentNamesFromRoom() {
        assert(testDB.getStudentNamesFromRoom(123).contains("Ajay Dhiman"));
    }

}
