package com.knoldus.kip.repo;

import com.knoldus.kip.models.ClassRoom;
import com.knoldus.kip.models.Student;

import java.util.*;

/**
 * A dummy database which is used to run the queries given in the assignment.
 */
public class DummyDatabase {

    /**
     * HashMap that stores the classroom with their roomId's.
     */
    private HashMap<Integer, ClassRoom> classRoomsMap = new HashMap<>();

    /**
     * The constructor.
     */
    public DummyDatabase() {
        classRoomsMap.put(ClassRooms.roomId1, ClassRooms.classRoom1);
        classRoomsMap.put(ClassRooms.roomId2, ClassRooms.classRoom2);
        classRoomsMap.put(ClassRooms.roomId3, ClassRooms.classRoom3);
        classRoomsMap.put(ClassRooms.roomId4, ClassRooms.classRoom4);
        classRoomsMap.put(ClassRooms.roomId5, ClassRooms.classRoom5);
        classRoomsMap.put(ClassRooms.roomId6, ClassRooms.classRoom6);
    }

    /**
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
     *
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
    private static class ClassRooms {

        //Just to avoid the 'Magic Number' checkstyle warning
        private static int roomId1 = 123;
        private static int roomId2 = 234;
        private static int roomId3 = 345;
        private static int roomId4 = 456;
        private static int roomId5 = 567;
        private static int roomId6 = 678;

        private static ClassRoom classRoom1 = ClassRoom.builder()
                .roomId(roomId1)
                .studentList(Optional.of(new ArrayList<>(
                        Arrays.asList(Students.student1, Students.student2)))
                )
                .build();

        private static ClassRoom classRoom2 = ClassRoom.builder()
                .roomId(roomId2)
                .studentList(Optional.of(new ArrayList<>(
                        Arrays.asList(Students.student3, Students.student4,
                                Students.student5)))
                )
                .build();

        private static ClassRoom classRoom3 = ClassRoom.builder()
                .roomId(roomId3)
                .studentList(Optional.of(new ArrayList<>(
                        Arrays.asList(Students.student6, Students.student7)))
                )
                .build();

        private static ClassRoom classRoom4 = ClassRoom.builder()
                .roomId(roomId4)
                .studentList(Optional.of(new ArrayList<>(Arrays.asList(
                        Students.student8, Students.student9,
                        Students.student10)))
                )
                .build();

        private static ClassRoom classRoom5 = ClassRoom.builder()
                .roomId(roomId5)
                .studentList(Optional.of(new ArrayList<>(
                        Collections.singletonList(Students.student11)))
                )
                .build();

        private static ClassRoom classRoom6 = ClassRoom.builder()
                .roomId(roomId6)
                .studentList(Optional.empty())
                .build();
    }

    /**
     * Inner class that defines all the students.
     */
    private static class Students {

        private static int rollNumber1 = 1;
        private static int rollNumber2 = 2;
        private static int rollNumber3 = 3;
        private static int rollNumber4 = 4;
        private static int rollNumber5 = 5;
        private static int rollNumber6 = 6;
        private static int rollNumber7 = 7;
        private static int rollNumber8 = 8;
        private static int rollNumber9 = 9;
        private static int rollNumber10 = 10;
        private static int rollNumber11 = 11;

        private static Student student1 = Student.builder()
                .name("Ajay Dhiman")
                .rollNumber(rollNumber1)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Physics", "English", "Chemistry")))
                )
                .build();

        private static Student student2 = Student.builder()
                .name("Vijay Chauhan")
                .rollNumber(rollNumber2)
                .subjects(Optional.of(Collections.emptyList())) //No subject
                .build();

        private static Student student3 = Student.builder()
                .name("Neha Kapoor")
                .rollNumber(rollNumber3)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Engineering Drawing", "Hindi",
                                "Chemistry")))
                )
                .build();

        private static Student student4 = Student.builder()
                .name("Mona Sahoo")
                .rollNumber(rollNumber4)
                .subjects(Optional.of(new ArrayList<>(Arrays.asList("Physics",
                        "English")))
                )
                .build();

        private static Student student5 = Student.builder()
                .name("Sajit Radhakrishnan")
                .rollNumber(rollNumber5)
                .subjects(Optional.of(new ArrayList<>(Arrays.asList("History",
                        "English", "Hindi")))
                )
                .build();

        private static Student student6 = Student.builder()
                .name("Sachin Goel")
                .rollNumber(rollNumber6)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Mathematics", "Physics", "Chemistry")))
                )
                .build();

        private static Student student7 = Student.builder()
                .name("Krishna Dhiman")
                .rollNumber(rollNumber7)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Physics", "English", "History")))
                )
                .build();

        private static Student student8 = Student.builder()
                .name("Nivica Malhotra")
                .rollNumber(rollNumber8)
                .subjects(Optional.of(Collections.emptyList())) //No subject
                .build();

        private static Student student9 = Student.builder()
                .name("Ghazal")
                .rollNumber(rollNumber9)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Economics", "English", "Mathematics")))
                )
                .build();

        private static Student student10 = Student.builder()
                .name("Apoorva Saini")
                .rollNumber(rollNumber10)
                .subjects(Optional.of(new ArrayList<>(Arrays.asList("History",
                        "English", "Geography")))
                )
                .build();

        private static Student student11 = Student.builder()
                .name("Kalpana Rana")
                .rollNumber(rollNumber11)
                .subjects(Optional.of(new ArrayList<>(
                        Arrays.asList("Inventory Management", "English",
                                "Logistics")))
                )
                .build();
    }

}
