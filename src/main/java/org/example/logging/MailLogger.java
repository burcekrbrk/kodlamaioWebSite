package org.example.logging;

import org.example.entities.Categories;
import org.example.entities.Courses;
import org.example.entities.Instructors;

public class MailLogger implements Logger{
    @Override
    public void CategoryLogger(Categories category) {
        System.out.println("maile loglandı");

    }
    @Override
    public void CourseLogger(Courses course) {
        System.out.println("maile loglandı");

    }
    @Override
    public void InstructorLogger(Instructors ınstructor) {
        System.out.println("maile loglandı");

    }
}
