package be.abis.exercise.repository;

import be.abis.exercise.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcCourseRepository implements CourseRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Course> findAllCourses() {
        return jdbcTemplate.query("select * from abiscourses",new CourseMapper());
    }

    @Override
    public Course findCourseById(String id) {
        return null;
    }

    @Override
    public List<Course> findCoursesByDuration(int daysDuration) {
        return List.of();
    }

    @Override
    public Course findCourseByShortTitle(String shortTitle) {
        return null;
    }

    @Override
    public void addCourse(Course c){
		jdbcTemplate.update("INSERT INTO abiscourses(cid,cstitle,cltitle,cdur,caprice) VALUES(?,?,?,?,?)",
                c.getCourseID(),
                c.getShortTitle(),
                c.getLongTitle(),
                c.getNumberOfDays(),
                c.getPricePerDay());
    }

    @Override
    public void updateCourse(Course c) {

    }

    @Override
    public void deleteCourse(int id) {

    }


    private static final class CourseMapper implements RowMapper<Course> { public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
        Course course = new Course();
        course.setCourseID(rs.getString("cid"));
        course.setShortTitle(rs.getString("cstitle"));
        course.setLongTitle(rs.getString("cltitle"));
        course.setNumberOfDays(rs.getInt("cdur"));
        course.setPricePerDay(rs.getInt("caprice"));
        return course;
    }
    }
}
