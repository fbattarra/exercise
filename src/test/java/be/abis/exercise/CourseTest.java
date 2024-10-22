package be.abis.exercise;

import be.abis.exercise.model.Course;

public class CourseTest {

    public static void main(String[] args){
        Course course = new Course("120", "st course 1", "lt course 1", 5, 500);
        System.out.println(course.toString());
    }
}
