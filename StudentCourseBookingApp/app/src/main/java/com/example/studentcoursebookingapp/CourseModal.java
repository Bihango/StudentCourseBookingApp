package com.example.studentcoursebookingapp;

public class CourseModal {

    // variables for our coursename,
    // description, tracks and duration, id.
    private String courseName;
    private String courseCode;
    private String courseTracks; /////////////////////////////// remove
    private String courseDescription; /////////////////////////////// remove
    private int id;

    // creating getter and setter methods
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTracks() {
        return courseTracks;
    }

    public void setCourseTracks(String courseTracks) {
        this.courseTracks = courseTracks;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // constructor
    public CourseModal(String courseName, String courseCode, String courseTracks, String courseDescription) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseTracks = courseTracks;
        this.courseDescription = courseDescription;
    }
}
