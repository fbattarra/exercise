package be.abis.exercise.controller;

import be.abis.exercise.model.Course;
import be.abis.exercise.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseApiController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    // http://localhost:8080/exercice/api/courses?shortTitle={short title}
    public Course findCourseByShortTitle(@RequestParam("shortTitle") String shortTitle) {
        Course c = courseService.findCourseByShortTitle(shortTitle);
        return c;
    }

    @GetMapping("/courses/{id}")
    // http://localhost:8080/exercice/api/courses/{id}
    public Course findCourseById(@PathVariable String id) {
        Course c = courseService.findCourseById(id);
        return c;
    }

    @GetMapping("/courses/list")
    // http://localhost:8080/exercice/api/courses/list
    public List<Course> findAllCourses() {
        List<Course> allCourses = courseService.findAllCourses();
        return allCourses;
    }

    // using JdbcCourseRepository
    @GetMapping("/courses/db/list")
    // http://localhost:8080/exercice/api/courses/db/list
    public List<Course> findAllCoursesFromDb(){
        List<Course> allCourses = courseService.findAllCoursesFromDb();
        return allCourses;
    }

    @PostMapping("/courses/new")
    // http://localhost:8080/exercice/api/courses/new + POST
    /*
                                                          {
                                                              "courseID": "{id}",
                                                              "shortTitle": "{shortTitle}",
                                                              "longTitle": "{longTitle}",
                                                              "numberOfDays": {numberOfDays},
                                                              "pricePerDay": {pricePerDay}
                                                          }
     */
    public void addCourse(@RequestBody Course newCourse){
        courseService.addCourse(newCourse);
    }

}
