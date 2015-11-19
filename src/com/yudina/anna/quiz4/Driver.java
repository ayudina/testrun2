package com.yudina.anna.quiz4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
public class Driver
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("yudinaSpring.xml");
        Book yudinabook = (Book) context.getBean("yudinaBook");
        System.out.println(yudinabook);

        /*ArrayList<Media> library = new ArrayList<Media>();
        library.add(new Book("Dare to go Solo", "Elizabeth Boese",1));
        library.add(new DVD("Dare to go Solo", 2006,2));
        library.add(new DVD("Dare to go Solo", 1999,3));
        library.add(new Book("Intro to Programming with Java Applets", "Elizabeth Boese",4));
        library.add(new DVD("Intro to Programming", 2011,5));
        library.add(new DVD("Intro to Programming", 1970,6));
        library.add(new DVD("Dare to go Solo", 2012,7));
        library.add(new DVD("Dare to go Solo", 2000,8));
        library.add(new Book("Dare to go Solo", "Wise Travelguy",9));
        library.add(new Book("Intro to Programming with Java Applets", "Elizabeth Boe",10));

        SessionFactory sessionFactory = hibernateutil.createSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();

        for (Object media : library)
            session.save(media);
        session.getTransaction().commit();
        session.close();
        */
    }
}

