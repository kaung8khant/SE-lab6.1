package edu.mum.cs.cs425.demos.model;


import java.time.LocalDate;

public class Student {
    private String studentID;
    private String name;
    private LocalDate dateOfAdmission;

    public Student(String studentID, String name, LocalDate dateOfAdmission){
        this.studentID = studentID;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
    public void print(){
        System.out.print("Name: ");
        System.out.print(this.name+", ");
        System.out.print("ID: ");
        System.out.print(this.studentID+", ");
        System.out.print("Date of Admission: ");
        System.out.print(this.dateOfAdmission+"\n");
    }
}
