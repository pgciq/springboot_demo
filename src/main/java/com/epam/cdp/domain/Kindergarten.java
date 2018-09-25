package com.epam.cdp.domain;

import com.epam.cdp.entity.Student;

import java.util.List;

public class Kindergarten {
    private List<Student> students;
    private Student student;

    public Kindergarten(Student student) {
        this.student = student;
    }

    public Kindergarten(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
