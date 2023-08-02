package org.example.business;


import org.example.dataAccess.WebDao;
import org.example.entities.Categories;
import org.example.entities.Courses;
import org.example.entities.Instructors;
import org.example.logging.Logger;

import java.util.List;

public class BaseWebManager{
    private Logger[] logger;
    private WebDao webDao;

    public Courses[] courses ;
    public Categories[] categories;



    public BaseWebManager(WebDao webDao, Logger logger) {
        this.webDao = webDao;
        this.loggers=logger;
    }
    public void addCourse(Courses course) throws Exception {
        for (Courses course1 : courses) {
            if ( course1.getPrice() < 0) {
                throw new Exception("kurs ücreti sıfırdan küçük olamaz.");
            }
        }
        webDao.addCourse(course);
        for (Logger logger1 : loggers) {
            logger1.CourseLogger(course);
        }
    }

    public void addCategories(Categories category) throws Exception {
        for (Categories categories1 : categories) {
            if (categories1.getName() != category.getName()) {
                throw new Exception("bu kurs kategorilerde mevcuttur");
            }
        }
        webDao.addCategory(category);
        for(Logger logger1:loggers) {
            logger1.CategoryLogger(category);
        }

    }

    public void addInstructor(Instructors ınstructor){
        webDao.addInstructor(ınstructor);
        for(Logger logger1: loggers){
            logger1.InstructorLogger(ınstructor);
        }


    }

}
