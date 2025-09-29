package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInputHelper {

    public Student createStudentFromInput() {

        Scanner sc = new Scanner(System.in);
        Student student;

        try {
            String type = null;
            while(true) {
                System.out.print("Enter student type (undergrad / grad): ");
                type = sc.nextLine();
                if (type.equals("undergrad")) break;
                if (type.equals("grad")) break;
                else System.out.println("Please enter undergrad / grad ");
            }

            System.out.print("Press \"ENTER\" to skip a field.\n" );

            System.out.print("Enter first name: ");
            String fName = sc.nextLine();

            System.out.print("Enter last name: ");
            String lName = sc.nextLine();

            int id = 0;
            while(true) {
                try {
                    System.out.print("Enter student ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid student ID.");
                    sc.nextLine();
                }
            }

            Address address = readAddress(sc);

            System.out.print("Enter subject: ");
            String subject = sc.nextLine();

            int year = 0;
            while(true) {
                try {
                    System.out.print("Enter year of entry: ");
                    year = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid year of entry.");
                    sc.nextLine();

                }
            }


            System.out.print("Enter thesis topic: ");
            String thesis = sc.nextLine();

            ArrayList<Double> marksList = new ArrayList<>();
            System.out.println("Enter marks (q to finish):");
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("q")) break;
                marksList.add(Double.parseDouble(input));
            }

            Double[] marksArray = marksList.toArray(new Double[0]);


            switch(type.toLowerCase()) {
                case "undergrad":
                    return student = new UndergradStudent(id, fName, lName, marksArray, address, subject, year);
                case "grad":
                    return student = new GraduateStudent(id, fName, lName, marksArray, address, subject, year, thesis);
                default:
                    return student = new Student(id, fName, lName, marksArray, address);
            }
        } catch (InputMismatchException e){
            System.out.println("Error: Invalid input.");
            return null;
        }
    }

    private Address readAddress(Scanner sc) {
        System.out.print("Street: ");
        String street = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();
        System.out.print("Province: ");
        String province = sc.nextLine();
        System.out.print("Country: ");
        String country = sc.nextLine();

        return new Address(street, city, zip, province, country);
    }
}
