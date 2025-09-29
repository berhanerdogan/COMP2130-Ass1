package org.example;

import java.util.Arrays;

public class Student {
    private int StudentID;
    private String stdFirstName;
    private String stdLastName;
    private Double[] stdMarks;
    private Address stdAddress;

    public Student(int studentID, String stdFirstName, String stdLastName, Double[] stdMarks, Address stdAddress) {
        StudentID = studentID;
        this.stdFirstName = stdFirstName;
        this.stdLastName = stdLastName;
        this.stdMarks = stdMarks;
        this.stdAddress = stdAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + StudentID +
                ", stdFirstName='" + stdFirstName + '\'' +
                ", stdLastName='" + stdLastName + '\'' +
                ", stdMarks=" + Arrays.toString(stdMarks) +
                ", stdAddress=" + stdAddress +
                '}';
    }

    public double Average(){
        int len = stdMarks.length;
        double sum = 0;
        for (int i = 0; i < len; i++) {
            sum += stdMarks[i];
        }
        double avg = sum / len;
        return avg;
    }


    public boolean Graduate() {
        double avg = Average();
        return avg >= 70;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public void setStdFirstName(String stdFirstName) {
        this.stdFirstName = stdFirstName;
    }

    public String getStdLastName() {
        return stdLastName;
    }

    public void setStdLastName(String stdLastName) {
        this.stdLastName = stdLastName;
    }

    public Double[] getStdMarks() {
        return stdMarks;
    }

    public void setStdMarks(Double stdMarks) {
        this.stdMarks = new Double[]{stdMarks};
    }

    public Address getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(Address stdAddress) {
        this.stdAddress = stdAddress;
    }

}