package com.knoldus.kip.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class TestHelper {

    private static int rollNumber1 = 1;
    private static int rollNumber2 = 2;
    private static int rollNumber3 = 3;
    private static int rollNumber4 = 4;

    static Student student1 = Student.builder()
            .name("Ajay Dhiman")
            .rollNumber(rollNumber1)
            .subjects(Optional.of(new ArrayList<>(
                    Arrays.asList("Physics", "English", "Chemistry")))
            )
            .build();

    static Student student2 = Student.builder()
            .name("Vijay Chauhan")
            .rollNumber(rollNumber2)
            .subjects(Optional.of(Collections.emptyList())) //No subject
            .build();

    static Student student3 = Student.builder()
            .name("Neha Kapoor")
            .rollNumber(rollNumber3)
            .subjects(Optional.of(new ArrayList<>(
                    Arrays.asList("Engineering Drawing", "Hindi",
                            "Chemistry")))
            )
            .build();

    static Student student4 = Student.builder()
            .name("Sona Sahoo")
            .rollNumber(rollNumber4)
            .subjects(Optional.of(new ArrayList<>(Arrays.asList("Physics",
                    "English")))
            )
            .build();
}
