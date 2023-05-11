package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCacheEx {

    public static void main(String args[]){

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

        Employee employee = session.get(Employee.class,1);
        System.out.println(employee);

        session.close();
        System.out.println("---------------------");

        Session session1 = factory.openSession();
        Employee employee1 = session1.get(Employee.class, 1);
        System.out.println(employee1);

        session1.close();
    }
}
