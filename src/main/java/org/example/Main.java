
// Berhan Erdogan - 101591316

package org.example;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        boolean check = true;
        StudentManager sm = new StudentManager();

        while (check){
            clearTerminal();

            String[] options = {"[1]Add Student", "[2]View All Students", "[3]View Graduating Students", "[4]Remove Student", "[5]Exit"};
            String prompt = "Please enter your choice:";


            Menu menu = new Menu(options, prompt);
            menu.DisplayMenu();

            Scanner sc = new Scanner(System.in);
            String input = sc.next();


            switch (input) {
                case "1":
                    clearTerminal();
                    System.out.println("Student");
                    System.out.println("===========================");
                    sm.addStudent();
                    break;
                case "2":
                    clearTerminal();
                    System.out.println("Student List");
                    System.out.println("===========================");
                    sm.listStudents();
                    break;
                case "3":
                    clearTerminal();
                    System.out.println("Graduating Students");
                    System.out.println("===========================");
                    sm.listGraduatingStudents();
                    break;
                case "4":
                    clearTerminal();
                    sm.removeStudent();
                    break;
                case "5":
                    clearTerminal();
                    System.out.println("Exit");
                    System.out.println("===========================");
                    break;

            }
            System.out.print("Dou you want to choose another option? " + "\n" +
                                "Please enter y or n..." + "\n");
            input = sc.next();

            if (input.equals("n")) {
                check = false;
            }
        }
    }
    private static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}