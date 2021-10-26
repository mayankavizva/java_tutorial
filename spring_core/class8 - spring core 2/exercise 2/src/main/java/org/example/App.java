package org.example;

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
//        Student student = (Student) context.getBean("student1");
//        System.out.println(student);
//
//        Customer customer = (Customer) context.getBean("customer1");
//        System.out.println(customer);


        Calculator calculator = (Calculator) context.getBean("calculator1");
        calculator.addNumber();



    }
}
