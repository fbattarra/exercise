package be.abis.exercise.service;

import be.abis.exercise.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    List<Course> findAllCourses();

    Course findCourseById(String id);

    List<Course> findCoursesByDuration(int daysDuration);

    Course findCourseByShortTitle(String shortTitle);

    void addCourse(Course c);

    void updateCourse(Course c);

    void deleteCourse(int id);
}
