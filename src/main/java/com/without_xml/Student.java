package com.without_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {
//    @Value("#{getSamosa}")   // We Can Give Value with Annotations
    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study(){
        samosa.display();
        System.out.println("Studying...");
    }
}
