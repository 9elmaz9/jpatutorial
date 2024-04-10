package org.example;

import org.example.model.Student;
import org.example.model.StudentRepository;

public class Main {
    public static void main(String[] args) {
        Student student =new Student();
        student.setFirstName("Alan");
        student.setLastName("Red");


        StudentRepository repository=new StudentRepository();
        repository.add(student);
        System.out.println("Added student" + student.toString());

        student=repository.find(student.getId());
        System.out.println("Found student " + student.toString());

        student.setLastName("green");

        repository.update(student);
        System.out.println("Epdated student " + student.toString());


        repository.delete(student);
        System.out.println("Deleted student " +student.toString());
    }
}