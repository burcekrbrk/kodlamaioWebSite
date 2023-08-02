package org.example.dataAccess;

import org.example.entities.Categories;
import org.example.entities.Courses;
import org.example.entities.Instructors;

public class JdbcWebDao implements WebDao{

    @Override
    public void addCourse(Courses course) {
        System.out.println(course.getKursAdi()+ "Jdbc ile veritabanına eklendi");

    }

    @Override
    public void addCategory(Categories category) {
        System.out.println(category.getName()+ "Jdbc ile veritabanına eklendi");

    }

    @Override
    public void addInstructor(Instructors ınstructor) {
        System.out.println(ınstructor.getName()+ "Jdbc ile veritabanına eklendi");

    }
}
