package com.learn.java.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public static List<Student> getAllStudent() {
        /**
         * 2nd Grade students
         */
        Student student1 = new Student("adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
        Student student2 = new Student("jenny", 2, 3.8, "female", Arrays.asList("swimming", "hockey", "football"));

        /**
         * 3rd Grade students
         */
        Student student3 = new Student("Emily", 3, 4.0, "female", Arrays.asList("swimming", "basketball", "aerobics"));
        Student student4 = new Student("Dave", 3, 3.9, "male", Arrays.asList("swimming", "hockey", "football"));

        /**
         * 4th Grade students
         */
        Student student5 = new Student("Teja", 4, 4.0, "female", Arrays.asList("swimming", "basketball", "aerobics"));
        Student student6 = new Student("Tejendra", 4, 3.5, "male", Arrays.asList("swimming", "hockey", "football"));


        return Arrays.asList(student1, student2, student3, student4, student5, student6);
    }
}
