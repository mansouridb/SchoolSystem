package org.example.model;

import java.time.LocalDate;
import java.util.Collection;

public class Course {
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", startDate=" + startDate +
                ", weekDuration=" + weekDuration +
                ", Students=" + Students +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public Collection getStudents() {
        return Students;
    }

    public void setStudents(Collection students) {
        Students = students;
    }

    public Course(int id, String courseName, LocalDate startDate, int weekDuration, Collection students) {
        this.id = id;
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        Students = students;
    }

    private int id ;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration ;
    private Collection<> Students;
}
