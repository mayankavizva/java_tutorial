



# Spring Framework

# What is Spring Framework?
- Spring is a lightweight framework
- it can be though of as a framework of framework because it provides support to various framework such as 
  struts, hibernate, EJB etc
- The framework, in a broader sense, can be define as a structure where we find the solution of the various 
  technical problems
- Spring framework comprises of several modules such as 
 - IOC
 - AOP
 - DAO
 - Context
 - ORM
 - WEB, MVC etc


# Advantages of Spring Framework
- Predefined templates - sprinmg framework provides templates for JDBC, Hibernate, JPA etc
- Loosley coupling - the spring application are loosly coupled because of dependency injection
- easy to test
- lightweight - it is lightweight because of the POJO implementation
- fast development
- declarative support
- powerful abstraction

# Spring Modules
- Test
- Spring core container
- Data Access / integration
- Web

- SOLID

# IOC container
The IOC container is responsable for instantiating, configure and assemble the objects.
The IOC container get information from the XML file and work accordingly
the main task perfoirm by IOC are
1. to instantiate the application class
2. to configure the object
3. to assemble the dependencies between the objects


Thare are two types of IOC container
1. BeanFactory
2. ApplicationContext



# BeanFactory vs ApplicationContext
BeanFactory and ApplicationContext act as interface for IOC container

the applicationContext interface is built on the beanFactory interface. I
It add some extra functionality then BeanFactory, such as simple intergration with spring, message resource etc

it is better to use ApplicationContext then BeanFactory



# Dependency injection in spring
- DI is a design pattern that removes the dependency from the programing code so it can be easy to manage
and test the application
- DI makes out code loosely coupled

# Spring provides two ways to dependency injection
1. by constructor
2. by setter method


# Dependency injection by the constructor
we can inject the dependency by the constructor
the <constructor-arg> subelement of <bean> is used for constructor injection
heer we can inject
 - primative and string based value
 - dependent object
 - collection values 

# Dependency injection by setter method
we can inject the dependency by setter method also
the <property> subelement of <bean> is used for setting injection
here can inject
 - primitive and string based value
 - dependent object
 - collection value etc


# difference between constructor and setter injection
1. partial dependency - can be injected using setter injection, but it is not possible by constructor injection
2. overriding - setter injection overrides the constructor injection if we use both
3. changes - we can easily change the value by setter injection, so setter injection is flexible than constructor injection





# Exercise 1: create maven project, create config, setter injection, spring core

Step 1: use your fav. ID (Eclipse / IDEA)

Step 2: create a maven project
 Maven -> quick start template

Step 3:Adding dependencies -> Spring core, Spring context

pom.xml

 <!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>5.3.10</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.3.10</version>
    </dependency>

Step 4: create POJO class

src  / main / java / org.example / Studnet

package org.example;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}

Step 5: Create configuration file

resources / config.xml

<?xml version="1.0" encoding="UTF-8" ?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
    
    <bean class="org.example.Student" name="student1">
        <property name="studentId">
            <value>100</value>
        </property>
        <property name="studentName">
            <value>Mark</value>
        </property>
        <property name="studentAddress">
            <value>India</value>
        </property>
    </bean>

</beans>


Step 6: Setter injection	


Step 7: Main class -> we can get the bean from the IOC and use it


    public static void main( String[] args )
    {
       ApplicationContext context =   new ClassPathXmlApplicationContext("config.xml");
       Student student =  (Student) context.getBean("student1");
        System.out.println(student);
    }



























