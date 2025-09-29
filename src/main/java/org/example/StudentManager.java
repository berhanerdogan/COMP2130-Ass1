package org.example;

import java.net.spi.InetAddressResolver;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager
{
    private final ArrayList<Student> students;

    public StudentManager()
    {
        students = new ArrayList<Student>();

        //Example Students
        students.add(new Student(101591316, "Berhan", "Erdogan", new Double[]{80.0, 90.0, 70.0}, new Address("ABC", "York", "XXXXXX", "ON", "Canada")));
        students.add(new Student(201591316, "Neda", "Olsoy", new Double[]{65.0, 72.0, 60.0}, new Address("ABC", "York", "XXXXXX", "ON", "Canada")));
        students.add(new Student(301591316, "Venus", "Cat", new Double[]{100.0, 95.0, 98.0}, new Address("ABC", "York", "XXXXXX", "ON", "Canada")));
    }

    public ArrayList<Student> getStudents()
    {
        return students;
    }

    public void addStudent()
    {
        StudentInputHelper studentInputHelper = new StudentInputHelper();
        Student newStudent = studentInputHelper.createStudentFromInput();
        students.add(newStudent);
        System.out.println("Student added successfully!");
    }

    public void removeStudent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student List");
        System.out.println("===========================");
        listStudents();
        System.out.println("Please enter the student id you want to remove:");
        int id = sc.nextInt();
        boolean removed = students.removeIf(s -> s.getStudentID() == id);

        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("No student found with ID: " + id);
        }

    }

    public void listStudents() {
        System.out.format("+------------+----------------------+------------+---------+----------------------+-------+----------------------+%n");
        System.out.format("| ID         | Name                 | City       | Avg     | Subject              | Year  | Thesis               |%n");
        System.out.format("+------------+----------------------+------------+---------+----------------------+-------+----------------------+%n");

        String rowFormat = "| %-10d | %-20s | %-10s | %-7.2f | %-20s | %-5s | %-20s |%n";

        students.forEach(s -> {
            int stuID = s.getStudentID();
            String fullName = s.getStdFirstName() + " " + s.getStdLastName();
            Address address = s.getStdAddress();
            String stuCity = address.getCity();
            double stuAvg = s.Average();

            String subject = "";
            String year = "";
            String thesis = "";

            if (s instanceof GraduateStudent) {
                GraduateStudent g = (GraduateStudent) s;
                subject = g.getSubject();
                year = String.valueOf(g.getYearOfEntry());
                thesis = g.getThesisTopic();
            } else if (s instanceof UndergradStudent) {
                UndergradStudent u = (UndergradStudent) s;
                subject = u.getSubject();
                year = String.valueOf(u.getYearOfEntry());
                thesis = "";
            }

            System.out.format(rowFormat, stuID, fullName, stuCity, stuAvg, subject, year, thesis);
            System.out.format("+------------+----------------------+------------+---------+----------------------+-------+----------------------+%n");
        });
    }



    public void listGraduatingStudents() {
        System.out.format("+---------------+---------------+---------------------+---------+%n");
        System.out.format("| ID            | Name          | Surname             | Average |%n");
        System.out.format("+---------------+---------------+---------------------+---------+%n");

        String leftAlignment = "| %-13d | %-13s | %-19s | %-7.2f |%n";

        students.forEach(s ->{
            if (s instanceof GraduateStudent) {
                return;
            }
            double avg = s.Average();
            boolean check = s.Graduate();
            if (check) {
                System.out.format(leftAlignment, s.getStudentID(), s.getStdFirstName(), s.getStdLastName(), avg);
                System.out.format("+---------------+---------------+---------------------+---------+%n");
            }
        });
    }
}
