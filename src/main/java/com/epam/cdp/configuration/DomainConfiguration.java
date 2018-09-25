package com.epam.cdp.configuration;

import com.epam.cdp.domain.Kindergarten;
import com.epam.cdp.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DomainConfiguration {

    @Bean
    public List<Student> students() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob","M"));
        students.add(new Student("Alice", "F"));
        return students;
    }

    @Bean
    public Student student() {
        Student student = new Student("John","M");
        return student;
    }

    @Bean
    public Student pupil() {
        Student student = new Student("Jack","M");
        return student;
    }

    @Bean
    public Kindergarten kindergartens(@Qualifier("students") List<Student> students) {
        return new Kindergarten(students);
    }

    @Bean
    public Kindergarten kindergarten(@Qualifier("pupil")Student student) {
        return new Kindergarten(student);
    }

}
