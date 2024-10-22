package be.abis.exercise.model;

public class Instructor extends Person{

    private double salary;

    public Instructor(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach(){
        System.out.println(getFirstName() + " is teaching a course");
    }
}
