package com.without_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.without_xml")
public class JavaConfig {

    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
    @Bean(name = {"getStudent","student","stud"})
    public Student getStudent(){
        Student student = new Student(getSamosa());
        return student;
    }
}
