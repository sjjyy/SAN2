package com.example.san;


public class DeleteList {
  //  String userID;
  String courseID;
    String courseTitle;
    String courseRoom;
    String courseTime;

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseRoom() {
        return courseRoom;
    }

    public void setCourseRoom(String courseRoom) {
        this.courseRoom = courseRoom;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public DeleteList(String courseID, String courseTitle, String courseRoom, String courseTime) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.courseRoom = courseRoom;
        this.courseTime = courseTime;

    }
}

//