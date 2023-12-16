package org.example.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int sid;
    char grade;

    public Student(String name, int sid, char grade) {
        this.name = name;
        this.sid = sid;
        this.grade = grade;
    }
}

public class FlatMapDemo3 {
    public static void main(String[] args) {

        List<Student> studentList1 = Arrays.asList(
                new Student("Monkey D. Luffy", 101, 'A'),
                new Student("Sanji", 102, 'B'),
                new Student("Chopper", 103, 'C')
        );

        List<Student> studentList2 = Arrays.asList(
                new Student("Franky", 104, 'A'),
                new Student("Roronoa Zoro", 105, 'B'),
                new Student("Usopp", 106, 'C')
        );

        List<List<Student>> studentList = Arrays.asList(studentList1, studentList2);

        List<String> studentNames = studentList.stream()
                .flatMap(students -> students.stream().map(student -> student.name))
                .collect(Collectors.toList());
        System.out.println(studentNames);
    }
}
