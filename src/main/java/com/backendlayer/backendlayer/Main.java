package com.backendlayer.backendlayer;

public class Main{

    public int courseId;
    public String courseName;
    public long coursePrice;
    public String details;

    public Main(int courseId, String courseName, long coursePrice, String details) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.details = details;
    }
    public Main()
    {
        super();
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public long getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(long coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Main{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", coursePrice=" + coursePrice +
                ", details='" + details + '\'' +
                '}';
    }
}
