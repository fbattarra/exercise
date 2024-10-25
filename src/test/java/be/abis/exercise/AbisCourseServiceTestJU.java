package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AbisCourseServiceTestJU {

    @Autowired
    CourseService courseService;

    @Test
    public void courseShortTitleIsFound() throws Exception{
        Course cFound = courseService.findCourseByShortTitle("st Course 4");
        System.out.println(cFound);
        assertNotNull(cFound);
    }

    @Test
    public void courseIdIsFound() throws Exception{
        Course cFound = courseService.findCourseById("004");
        assertNotNull(cFound);
    }

    @Test
    public void courseIdIsNotFound() throws Exception{
        Course cNotFound = courseService.findCourseById("000004");
        assertNull(cNotFound);
    }
}
