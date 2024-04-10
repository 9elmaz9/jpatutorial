package org.tutorial;

import org.example.model.Student;
import org.example.model.StudentRepository;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class StudentRepositoryTest {
    private  static StudentRepository repository;

    @BeforeClass
    public static void beforeClass() throws Exception {
        repository=new StudentRepository("database-configuration_test");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        repository.close();

    }


    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {

        Student student=new Student();
        student.setLastName("Red");
        student.setFirstName("Alan");

        repository.add(student);

        assertNotNull(student.getId());
        assertTrue(student.getId().equals(1L));
    }

    @org.junit.Test
    public void find() {
    }

    @org.junit.Test
    public void update() {
    }

    @org.junit.Test
    public void delete() {
    }
}