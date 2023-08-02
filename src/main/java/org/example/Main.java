package org.example;

import org.example.business.BaseWebManager;
import org.example.dataAccess.JdbcWebDao;
import org.example.entities.Categories;
import org.example.entities.Courses;
import org.example.entities.Instructors;
import org.example.logging.DatabaseLogger;
import org.example.logging.FileLogger;
import org.example.logging.Logger;
import org.example.logging.MailLogger;

import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger() };
        BaseWebManager baseWebManager = new BaseWebManager(new JdbcWebDao(), (Logger) List.of(loggers));
        Courses course = new Courses("java kursu", 5);
        Categories category = new Categories("web kategorisi");
        Instructors ınstructor = new Instructors("fatma", 24);
        baseWebManager.addInstructor(ınstructor);
        baseWebManager.addCategories(category);
        //baseWebmanager.addCourse(course);



    }
}