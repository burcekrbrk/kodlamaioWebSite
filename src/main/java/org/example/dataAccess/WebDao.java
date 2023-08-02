package org.example.dataAccess;

import org.example.entities.Categories;
import org.example.entities.Courses;
import org.example.entities.Instructors;

public interface WebDao {
    void addCourse(Courses course);
    void addInstructor(Instructors ınstructor);
    void addCategory(Categories category);


}
