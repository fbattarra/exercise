package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.repository.MemoryCourseRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CourseRepositoryTestJU {
    Course c;
    MemoryCourseRepository cr ;

    @BeforeEach
    public void setUp() throws Exception{
        cr = new MemoryCourseRepository();
        c = new Course("007","st Course 7", "lt Course 7",10,400);
        cr.addCourse(c);
    }

    @AfterEach
    public void tearDown() throws Exception {cr = null;}

    @Test
    public void courseShortTitleIsFound() throws Exception{
        Course cFound = cr.findCourseByShortTitle("st Course 7");
        assertNotNull(cFound);
    }

    @Test
    public void courseIdIsFound() throws Exception{
        Course cFound = cr.findCourseById("007");
        assertNotNull(cFound);
    }

    @Test
    public void courseIdIsNotFound() throws Exception{
        Course cNotFound = cr.findCourseById("000007");
        assertNull(cNotFound);
    }

}
