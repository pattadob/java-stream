package org.example.parallelStream;

import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
}

public class ParallelStreamDemo {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Shanks", 90),
                new Student("Monkey D. Luffy", 89),
                new Student("Roronoa Zoro", 88),
                new Student("Usopp", 50),
                new Student("Sanji", 80)
        );

        // sequence
        students.stream()
                .filter(student -> student.getScore() > 80)
                .limit(3)
                .forEach(student -> System.out.println("Sequence Stream : " + student.name + ", " + student.score));

        // parallel
        students.parallelStream()
                .filter(student -> student.getScore() > 80)
                .limit(3)
                .forEach(student -> System.out.println("Parallel Stream: " + student.name + ", " + student.score));

        // convert sequence --> parallel
        students.stream()
                .parallel()
                .filter(student -> student.getScore() > 80)
                .limit(3)
                .forEach(student -> System.out.println("Sequence Stream : " + student.name + ", " + student.score));
    }
}
