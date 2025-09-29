package org.example;


import java.util.Arrays;

public class GraduateStudent extends Student
{
    private String subject;
    private int yearOfEntry;
    private String thesisTopic;

    public GraduateStudent(int studentID, String stdFirstName, String stdLastName, Double[] stdMarks, Address stdAddress, String subject, int yearOfEntry, String thesisTopic) {
        super(studentID, stdFirstName, stdLastName, stdMarks, stdAddress);
        this.subject = subject;
        this.yearOfEntry = yearOfEntry;
        this.thesisTopic = thesisTopic;
    }


    @Override
    public String toString() {
        return "GraduateStudent{" +
                "StudentID=" + getStudentID() +
                ", stdFirstName='" + getStdFirstName() + '\'' +
                ", stdLastName='" + getStdLastName() + '\'' +
                ", stdMarks=" + Arrays.toString(getStdMarks()) +
                ", stdAddress=" + getStdAddress() +
                "subject='" + subject + '\'' +
                ", yearOfEntry=" + yearOfEntry +
                ", thesisTopic='" + thesisTopic + '\'' +
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

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
}
