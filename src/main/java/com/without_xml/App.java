package com.without_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student student = context.getBean("getStudent",Student.class);
        System.out.println(student);
        student.study();
    }
}
