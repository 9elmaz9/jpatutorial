package org.example.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateStudent {
    public static void main(String[] args) {
      EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("database-configuration");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction= entityManager.getTransaction();

       entityTransaction.begin();

       Student student=new Student();
       student.setFirstName("John");
       student.setLastName("Bell");



        entityManager.persist(student);

       entityTransaction.commit();

       entityManager.close();
       entityManagerFactory.close();



    }
}
