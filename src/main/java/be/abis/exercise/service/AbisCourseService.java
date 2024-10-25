package be.abis.exercise.service;

import be.abis.exercise.model.Course;
import be.abis.exercise.repository.CourseRepository;
import be.abis.exercise.repository.MemoryCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbisCourseService implements CourseService{

    //@Autowired //field injection not recommended here
    private CourseRepository courseRepository;

    @Autowired //("Construction Injection"; "@Autowired is optional, just for a better readability of the code)
    public AbisCourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAllCourses();
    }

    @Override
    public Course findCourseById(String id) {
        return courseRepository.findCourseById(id);
    }

    @Override
    public List<Course> findCoursesByDuration(int daysDuration) {
        return courseRepository.findCoursesByDuration(daysDuration);
    }

    @Override
    public Course findCourseByShortTitle(String shortTitle) {
        return courseRepository.findCourseByShortTitle(shortTitle);
    }

    @Override
    public void addCourse(Course c) {
        courseRepository.addCourse(c);
    }

    @Override
    public void updateCourse(Course c) {
        courseRepository.updateCourse(c);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepository.deleteCourse(id);
    }
}
