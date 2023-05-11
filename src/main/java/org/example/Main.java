package org.example;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Session session = new Configuration()
                .configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
//        tx.begin();

        Employee employee = new Employee("Pawan",new Address("abc","India",444301));
        Employee employee1 = new Employee("PDS",new Address("xyz","US",123456));

        session.save(employee);
        session.save(employee1);

        tx.commit();
        session.close();

        System.out.println("Data Succesfully save ");
    }
}