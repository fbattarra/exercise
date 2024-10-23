package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.repository.MemoryCourseRepository;
import be.abis.exercise.repository.CourseRepository;

import java.util.List;

public class MemoryCourseRepositoryTest {
    public MemoryCourseRepositoryTest() {
    }

    public static void main(String[] args){
        /*
        Course c = new ;
        List<Course> allCoursesList = c.
        */

        CourseRepository cr = new MemoryCourseRepository();

        List<Course> courses =  cr.findAllCourses();
        courses.forEach(System.out::println);

        System.out.println("--------");

        String courseShortTitle = "st Course 3";
        System.out.println("Course with short title '"+courseShortTitle+"' has id="+cr.findCourseByShortTitle(courseShortTitle).getCourseID());

        System.out.println("--------");
        int courseDuration = 3;
        System.out.println("course with duration="+courseDuration+" days :");
        cr.findCoursesByDuration(3).forEach(System.out::println);
    }
}
