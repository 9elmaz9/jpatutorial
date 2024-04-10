package org.example.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStudent {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("database-configuration");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Student student = entityManager.find(Student.class, 1L);

        if (student != null) {
            System.out.println(student.toString());
        }
    }
}
