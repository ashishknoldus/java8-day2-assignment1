package com.knoldus.kip.models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.assertEquals;

public class ClassRoomTest {

    ClassRoom testClassRoom = ClassRoom.builder()
            .roomId(999)
            .studentList(Optional.of(new ArrayList<Student>(
                    Arrays.asList(TestHelper.student1, TestHelper.student2,
                            TestHelper.student3, TestHelper.student4)))
            )
            .build();

    ClassRoom testClassRoom2 = ClassRoom.builder()
            .roomId(1000)
            .studentList(Optional.of(new ArrayList<Student>(
                    Arrays.asList(TestHelper.student1, TestHelper.student2,
                            TestHelper.student3, TestHelper.student4)))
            )
            .build();

    @Test
    public void testGetStudentsWithNoSubjects() {
        List<Student> studentListWithNoSubject = testClassRoom.getStudentsWithNoSubjects();
        Student studentWithNoSubject = studentListWithNoSubject.get(0);
        assertEquals(studentWithNoSubject.getName(), "Vijay Chauhan");
    }

    @Test
    public void testGetSubjectsOfStudents() {
        List<String> subjects = testClassRoom.getSubjectsOfStudents();
        assert(subjects.contains("Physics"));
        assert(subjects.contains("English"));
        assert(subjects.contains("Chemistry"));
        assert(subjects.contains("Engineering Drawing"));
        assert(subjects.contains("Hindi"));
    }

    @Test
    public void testGetStudentNames() {
        List<String> studentNames = testClassRoom.getStudentNames();
        assert(studentNames.contains("Vijay Chauhan"));
        assert(studentNames.contains("Ajay Dhiman"));
        assert(studentNames.contains("Neha Kapoor"));
        assert(studentNames.contains("Sona Sahoo"));
    }


    @Test
    public void testEquals() {
        assert(!testClassRoom.equals(1234));
        assert(!testClassRoom.equals("1234"));
        assert(!testClassRoom.equals(testClassRoom2));
        assert(testClassRoom != testClassRoom2);
    }

    @Test
    public void testHashCode() {
        assert(testClassRoom.hashCode() != 0);
    }

    @Test
    public void testToString() {
        assert(testClassRoom.toString() != "");
    }

    @Test
    public void testGetRoomId() {
        assert(testClassRoom.getRoomId() == 999);
    }

    @Test
    public void testGetStudentList() {
        assert(testClassRoom.getStudentList().isPresent());
    }

    @Test
    public void testStudentBuilderToString() {
        assert(testClassRoom.builder().toString() != "");
    }
}
