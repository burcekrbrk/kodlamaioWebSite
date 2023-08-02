package org.example.logging;

import org.example.entities.Categories;
import org.example.entities.Courses;
import org.example.entities.Instructors;

public interface Logger {
    void CategoryLogger(Categories category);
    void CourseLogger(Courses course);
    void InstructorLogger(Instructors ınstructor);
}
