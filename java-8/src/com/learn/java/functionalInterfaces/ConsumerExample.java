package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static List<Student> studentList = StudentDatabase.getAllStudent();

    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

    public static void printStudents() {

        studentList.forEach(c1);
    }

    public static void printNameAndActivities() {

        studentList.forEach(c2.andThen(c3)); // consumer chaining
    }

    public static void printNameAndActivitiesUsingConditions() {

        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c2.andThen(c3).accept(student);
            }
        }));
    }


    public static void main(String[] args) {
//        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
//        c1.accept("java8");

        printStudents();
        System.out.println();
        printNameAndActivities();
        System.out.println();
        printNameAndActivitiesUsingConditions();

    }
}
