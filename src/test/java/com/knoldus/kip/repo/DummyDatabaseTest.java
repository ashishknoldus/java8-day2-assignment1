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

    @Test
    public void testGetStudentsWithNoSubjectNegativeCase() {
        assert(testDB.getStudentsWithNoSubject(999).size() == 0);
    }

    @Test
    public void testGetSubjectsOfStudentsNegativeCase() {
        assert(!testDB.getSubjectsOfStudents(999).contains("Chemistry"));
    }

    @Test
    public void testGetStudentNamesFromRoomNegativeCase() {
        assert(!testDB.getStudentNamesFromRoom(999).contains("Ajay Dhiman"));
    }

    @Test
    public void testEquals() {
        assert(!testDB.equals(1234));
    }

    @Test
    public void testHashCode() {
        assert(testDB.hashCode() != 0);
    }

    @Test
    public void testToString() {
        assert(testDB.toString() != "");
    }

}
