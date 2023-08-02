package org.example.logging;

import org.example.entities.Categories;
import org.example.entities.Courses;
import org.example.entities.Instructors;

public class FileLogger implements Logger{
    @Override
    public void CategoryLogger(Categories category) {
        System.out.println(" dosyaya logalndı");

    }

    @Override
    public void CourseLogger(Courses course) {
        System.out.println("dosyaya loglandı");

    }

    @Override
    public void InstructorLogger(Instructors ınstructor) {
        System.out.println("dosyaya loglandı");
    }
}
