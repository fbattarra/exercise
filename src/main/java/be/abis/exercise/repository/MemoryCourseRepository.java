package be.abis.exercise.repository;

import be.abis.exercise.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MemoryCourseRepository implements CourseRepository {
    private final List<Course> coursesList = new ArrayList<>();

    public MemoryCourseRepository(){
        coursesList.add(new Course("001","st Course 1","lt Course 1",5, 500));
        coursesList.add(new Course("002","st Course 2","lt Course 2",4, 600));
        coursesList.add(new Course("003","st Course 3","lt Course 3",3, 700));
        coursesList.add(new Course("004","st Course 4","lt Course 4",2, 800));
        coursesList.add(new Course("005","st Course 5","lt Course 5",1, 900));
    }

    @Override
    public List<Course> findAllCourses() {
        return this.coursesList;
    }

    @Override
    public Course findCourseById(String id) {
        Course found = null;
        for(Course c: coursesList){
            if(c.getCourseID().equals(id)){
                found = c;
                break;
            }
        }
        return found;
    }

    @Override
    public Course findCourseByShortTitle(String shortTitle) {
        /*
        Course found = null;
        for(Course c: coursesList){
            if(c.getShortTitle().equals(shortTitle)){
                found = c;
                break;
            }
        }
        return found;
        */
        /*
        List<Course> listOfCourseShortTitles = coursesList.stream()
                .filter(c->c.getShortTitle().equals(shortTitle)).collect(Collectors.toList());
         */

        return coursesList.stream()
                            .filter(c->c.getShortTitle().equalsIgnoreCase(shortTitle))
                            .findFirst().orElse(null);
    }

    @Override
    public void addCourse(Course c) {
        this.coursesList.add(c);
    }

    public List<Course> findCoursesByDuration(int daysDuration){

        return coursesList.stream().filter(c->c.getNumberOfDays()==daysDuration).toList();

    }

    @Override
    public void updateCourse(Course newCourse) {
        Course found = null;
        for(Course c: coursesList){
            if(c.getCourseID().equals(newCourse.getCourseID())){
                c.setShortTitle(newCourse.getShortTitle());
                c.setLongTitle(newCourse.getLongTitle());
                c.setNumberOfDays(newCourse.getNumberOfDays());
                c.setPricePerDay(newCourse.getPricePerDay());
                break;
            }
        }

    }

    @Override
    public void deleteCourse(int id) {

    }

}