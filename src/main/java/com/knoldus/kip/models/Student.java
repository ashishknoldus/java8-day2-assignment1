package com.knoldus.kip.models;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.Optional;

/**
 * The Student class.
 */
@Value
@Builder
public class Student {
    private String name;
    private int rollNumber;
    private Optional<List<String>> subjects;
}
