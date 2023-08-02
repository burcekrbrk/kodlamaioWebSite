package org.example.logging;

import org.example.entities.Categories;
import org.example.entities.Courses;
import org.example.entities.Instructors;

public class DatabaseLogger implements Logger{

    @Override
    public void CategoryLogger(Categories category) {
        System.out.println(category.getName()+ "kategorisi database'e eklendi ");

    }
    @Override
    public void CourseLogger(Courses course) {
        System.out.println(course.getKursAdi()+ "ismindeki kurs database'e loglandı");

    }
    @Override
    public void InstructorLogger(Instructors ınstructor) {
        System.out.println(ınstructor.getName()+ "ismindeki eğitmen database'e loglandı");

    }
}
