package be.abis.exercise.model;

import org.apache.commons.lang3.StringUtils;

public class Course {

    private String courseID;
    private String shortTitle;
    private String longTitle;
    private int numberOfDays;
    private int pricePerDay;
    public Course(){}

    public Course(String courseID, String shortTitle, String longTitle, int numberOfDays, int pricePerDay) {
        this.courseID = courseID;
        this.shortTitle = shortTitle;
        this.longTitle = longTitle;
        this.numberOfDays = numberOfDays;
        this.pricePerDay = pricePerDay;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getLongTitle() {
        return longTitle;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String toString(){
        return "The "+ StringUtils.lowerCase(this.getShortTitle())+" course"+
                " takes "+this.getNumberOfDays()+" days and"+
                " costs "+this.getPricePerDay()+" per day.";
    }
}