package org.example;

import java.util.Arrays;

public class UndergradStudent extends Student {

    private String subject;
    private int yearOfEntry;

    public UndergradStudent(int studentID, String stdFirstName, String stdLastName, Double[] stdMarks, Address stdAddress, String subject, int yearOfEntry) {
        super(studentID, stdFirstName, stdLastName, stdMarks, stdAddress);
        this.subject = subject;
        this.yearOfEntry = yearOfEntry;
    }

    @Override
    public String toString() {
        return "UndergradStudent{" +
                "StudentID=" + getStudentID() +
                ", stdFirstName='" + getStdFirstName() + '\'' +
                ", stdLastName='" + getStdLastName() + '\'' +
                ", stdMarks=" + Arrays.toString(getStdMarks()) +
                ", stdAddress=" + getStdAddress() +
                "subject='" + subject + '\'' +
                ", yearOfEntry=" + yearOfEntry +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public void setYearOfEntry(int yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }
}
