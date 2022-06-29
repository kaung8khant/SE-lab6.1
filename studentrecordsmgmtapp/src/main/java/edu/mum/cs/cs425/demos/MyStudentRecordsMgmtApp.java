package edu.mum.cs.cs425.demos;

import edu.mum.cs.cs425.demos.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MyStudentRecordsMgmtApp {
    public static void main( String[] args )
    {
        Student[] students = new Student[5];
        students[0] = new Student("110001","Dave",LocalDate.of(1951,11,18));
        students[1] = new Student("110002","Anna",LocalDate.of(1990,12,7));
        students[2] = new Student("110003","Erica",LocalDate.of(1974,1,31));
        students[3] = new Student("110004","Carlos",LocalDate.of(2009,8,22));
        students[4] = new Student("110005","Bob",LocalDate.of(1990,3,5));
        System.out.println("Students");
        System.out.println("-------------------------");
        printListOfStudents(students);
        System.out.println("");
        System.out.println("PlatinumAlumni students");
        System.out.println("-------------------------");
        getListOfPlatinumAlumniStudents(students);
    }

    public static void printListOfStudents(Student[] students){
        Arrays.stream(students)
                .sorted((Student s1, Student s2) -> s1.getName().compareTo(s2.getName()))
                .forEach((stu)->{
                    stu.print();
                });
    }
    public static void getListOfPlatinumAlumniStudents(Student[] students){
        Arrays.stream(students)
                .filter((student -> student.getDateOfAdmission().isBefore(LocalDate.now().minusYears(30))))
                .sorted((Student s1, Student s2) -> -(s1.getDateOfAdmission().compareTo(s2.getDateOfAdmission())))
                .forEach((stu)->{
                    stu.print();
                });
    }
}
