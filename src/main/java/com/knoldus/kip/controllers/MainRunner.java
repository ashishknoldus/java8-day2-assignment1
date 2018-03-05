package com.knoldus.kip.controllers;

import com.knoldus.kip.repo.DummyDatabase;

import java.util.List;


/**
 * The class with main() method.
 */
public final class MainRunner {

    /**
     * This private constructor is created to avoid the checkstyle warning.
     */
    private MainRunner() {

    }

    /**
     * Main method.
     * @param args from terminal but not passed in this example project.
     */
    public static void main(final String[] args) {

        DummyDatabase db = new DummyDatabase();

        System.out.println("Students With No Subjects In Room 123 -- "
                + db.getStudentsWithNoSubject(123).size());
        System.out.println("Students With No Subjects In Room 234 -- "
                + db.getStudentsWithNoSubject(234).size());
        System.out.println("Students With No Subjects In Room 345 -- "
                + db.getStudentsWithNoSubject(345).size());
        System.out.println("Students With No Subjects In Room 456 -- "
                + db.getStudentsWithNoSubject(456).size());
        System.out.println("Students With No Subjects In Room 567 -- "
                + db.getStudentsWithNoSubject(567).size());
        System.out.println("Students With No Subjects In Room 678 -- "
                + db.getStudentsWithNoSubject(678).size());
        System.out.println("Subjects Of Students In Room 123 -- "
                + db.getSubjectsOfStudents(123).size());
        System.out.println("Subjects Of Students In Room 234 -- "
                + db.getSubjectsOfStudents(234).size());
        System.out.println("Subjects Of Students In Room 345 -- "
                + db.getSubjectsOfStudents(345).size());
        System.out.println("Subjects Of Students In Room 456 -- "
                + db.getSubjectsOfStudents(456).size());
        System.out.println("Subjects Of Students In Room 567 -- "
                + db.getSubjectsOfStudents(567).size());
        System.out.println("Subjects Of Students In Room 678 -- "
                + db.getSubjectsOfStudents(678).size());

        System.out.println("\nSay Hello To Students In Room 123 :");
        printHelloMsg(db.getStudentNamesFromRoom(123));
        System.out.println("\nSay Hello To Students In Room 234 :");
        printHelloMsg(db.getStudentNamesFromRoom(234));
        System.out.println("\nSay Hello To Students In Room 345 :");
        printHelloMsg(db.getStudentNamesFromRoom(345));
        System.out.println("\nSay Hello To Students In Room 456 :");
        printHelloMsg(db.getStudentNamesFromRoom(456));
        System.out.println("\nSay Hello To Students In Room 567 :");
        printHelloMsg(db.getStudentNamesFromRoom(567));
        System.out.println("\nSay Hello To Students In Room 678 :");
        printHelloMsg(db.getStudentNamesFromRoom(678));
    }

    private static void printHelloMsg(List<String> list) {
        list.forEach(member -> System.out.println("Hello Student - " + member));
    }
}
