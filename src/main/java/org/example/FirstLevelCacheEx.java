package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevelCacheEx {
    public static void main(String args[]){

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Employee employee = session.get(Employee.class,1);
        System.out.println("ID:- "+employee);
        System.out.println("---------------------------");

        Employee employee1 = session.get(Employee.class,1);
        System.out.println(employee1);

        System.out.println("---------------");

        System.out.println(session.contains(employee));

        session.close();
    }
}
