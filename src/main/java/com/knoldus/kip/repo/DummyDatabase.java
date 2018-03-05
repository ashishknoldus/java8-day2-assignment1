package com.knoldus.kip.repo;

import com.knoldus.kip.models.ClassRoom;
import com.knoldus.kip.models.Student;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.Collections;

/**
 * A dummy database which is used to run the queries given in the assignment.
 */

@Value
@Builder
public class DummyDatabase {

    /**
     * All students.
     */
    private Students students = new Students();

    /**
     * All classrooms.
     */
    private ClassRooms classRooms = new ClassRooms();

    /**
     * HashMap that stores the classroom with their roomId's.
     */
    private HashMap<Integer, ClassRoom> classRoomsMap = new HashMap<>();

    /**
     * The constructor.
     */
    public DummyDatabase() {
        classRoomsMap.put(classRooms.roomId1, classRooms.classRoom1);
        classRoomsMap.put(classRooms.roomId2, classRooms.classRoom2);
        classRoomsMap.put(classRooms.roomId3, classRooms.classRoom3);
        classRoomsMap.put(classRooms.roomId4, classRooms.classRoom4);
        classRoomsMap.put(classRooms.roomId5, classRooms.classRoom5);
        classRoomsMap.put(classRooms.roomId6, classRooms.classRoom6);
    }

    /**
     *
     * @param roomId for which the query is to be run.
     * @return Students with no subjects in a room.
     */
    public final List<Student> getStudentsWithNoSubject(final int roomId) {
        if (classRoomsMap.containsKey(roomId)) {
            return classRoomsMap.get(roomId).getStudentsWithNoSubjects();
        } else {
            System.out.println("No room exists with roomId : " + roomId);
            return new ArrayList<>();
        }
    }

    /**
     *
     * @param roomId for which the query is to be run.
     * @return Subjects of students in a room.
     */
    public final List<String> getSubjectsOfStudents(final int roomId) {
        if (classRoomsMap.containsKey(roomId)) {
            return classRoomsMap.get(roomId).getSubjectsOfStudents();
        } else {
            System.out.println("No room exists with roomId : " + roomId);
            return new ArrayList<>();
        }
    }

    /**
     * Say hello to students in a room.
     * @param roomId for which the query is to be run.
     */
    public final List<String> getStudentNamesFromRoom(final int roomId) {
        if (classRoomsMap.containsKey(roomId)) {
            return classRoomsMap.get(roomId).getStudentNames();
        } else {
            return new ArrayList<>();
        }
    }

    /**
     * Inner class that defines all the class rooms.
     */
    private class ClassRooms {

        //Just to avoid the 'Magic Number' checkstyle warning
        private int roomId1 = 123;
        private int roomId2 = 234;
        private int roomId3 = 345;
        private int roomId4 = 456;
        private int roomId5 = 567;
        private int roomId6 = 678;

        private ClassRoom classRoom1 = ClassRoom.builder()
                .roomId(roomId1)
                .studentList(Optional.of(new ArrayList<>(
                        Arrays.asList(students.student1, students.student2)))
                )
                .build();

        private ClassRoom classRoom2 = ClassRoom.builder()
                .roomId(roomId2)
                .studentList(Optional.of(new ArrayList<>(
                        Arrays.asList(students.student3, students.student4,
                                students.student5)))
                )
                .build();

        private ClassRoom classRoom3 = ClassRoom.builder()
                .roomId(roomId3)
                .studentList(Optional.of(new ArrayList<>(
                        Arrays.asList(students.student6, students.student7)))
                )
                .build();

        private ClassRoom classRoom4 = ClassRoom.builder()
                .roomId(roomId4)
                .studentList(Optional.of(new ArrayList<>(Arrays.asList(
                        students.student8, students.student9,
                        students.student10)))
                )
                .build();

        private ClassRoom classRoom5 = ClassRoom.builder()
                .roomId(roomId5)
                .studentList(Optional.of(new ArrayList<>(
                        Collections.singletonList(students.student11)))
                )
                .build();

        private ClassRoom classRoom6 = ClassRoom.builder()
                .roomId(roomId6)
                .studentList(Optional.empty())
                .build();
    }

    /**
     * Inner class that defines all the students.
     */
    private class Students {

        private int rollNumber1 = 1;
        private int rollNumber2 = 2;
        private int rollNumber3 = 3;
        private int rollNumber4 = 4;
        private int rollNumber5 = 5;
        private int rollNumber6 = 6;
        private int rollNumber7 = 7;
        private int rollNumber8 = 8;
        private int rollNumber9 = 9;
        private int rollNumber10 = 10;
        private int rollNumber11 = 11;

        private Student student1 = Student.builder()
                .name("Ajay Dhiman")
                .rollNumber(rollNumber1)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Physics", "English", "Chemistry")))
                )
                .build();

        private Student student2 = Student.builder()
                .name("Vijay Chauhan")
                .rollNumber(rollNumber2)
                .subjects(Optional.of(Collections.emptyList())) //No subject
                .build();

        private Student student3 = Student.builder()
                .name("Neha Kapoor")
                .rollNumber(rollNumber3)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Engineering Drawing", "Hindi",
                                "Chemistry")))
                )
                .build();

        private Student student4 = Student.builder()
                .name("Mona Sahoo")
                .rollNumber(rollNumber4)
                .subjects(Optional.of(new ArrayList<>(Arrays.asList("Physics",
                        "English")))
                )
                .build();

        private Student student5 = Student.builder()
                .name("Sajit Radhakrishnan")
                .rollNumber(rollNumber5)
                .subjects(Optional.of(new ArrayList<>(Arrays.asList("History",
                        "English", "Hindi")))
                )
                .build();

        private Student student6 = Student.builder()
                .name("Sachin Goel")
                .rollNumber(rollNumber6)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Mathematics", "Physics", "Chemistry")))
                )
                .build();

        private Student student7 = Student.builder()
                .name("Krishna Dhiman")
                .rollNumber(rollNumber7)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Physics", "English", "History")))
                )
                .build();

        private Student student8 = Student.builder()
                .name("Nivica Malhotra")
                .rollNumber(rollNumber8)
                .subjects(Optional.of(Collections.emptyList())) //No subject
                .build();

        private Student student9 = Student.builder()
                .name("Ghazal")
                .rollNumber(rollNumber9)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Economics", "English", "Mathematics")))
                )
                .build();

        private Student student10 = Student.builder()
                .name("Apoorva Saini")
                .rollNumber(rollNumber10)
                .subjects(Optional.of(new ArrayList<>(Arrays.asList("History",
                        "English", "Geography")))
                )
                .build();

        private Student student11 = Student.builder()
                .name("Kalpana Rana")
                .rollNumber(rollNumber11)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Inventory Management", "English",
                                "Logistics")))
                )
                .build();
    }

}
