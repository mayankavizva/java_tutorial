package com.herovired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
//        Employee emp =  (Employee) context.getBean("employee1");
//        Employee emp2  = (Employee) context.getBean("employee2");
//        Employee emp3 = (Employee) context.getBean("employee3");
//
//        System.out.println(emp);
//        System.out.println(emp2);
//        System.out.println(emp3);
//
//        Student student = (Student) context.getBean("student1");
//        System.out.println(student.getName());
//        System.out.println(student.getPhones());
//        System.out.println(student.getAddress());
//        System.out.println(student.getCourses());

        Customer customer = (Customer) context.getBean("customer1");
        Address address = customer.getAddress();

        //System.out.println(address);
        System.out.println(customer);
    }
}
