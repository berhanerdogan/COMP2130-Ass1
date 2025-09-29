package org.example;

public class Menu
{
    String[] options;
    String prompt;
    public Menu(String[] options, String prompt)
    {
        this.options = options;
        this.prompt = prompt;
    }

    public void DisplayMenu()
    {
        System.out.print("MENU");
        System.out.print("\n");
        System.out.print("============================");
        System.out.print("\n");
        for (int i = 0; i < options.length; i++){
            String option = options[i];
            System.out.print(option + "\n");
        }
        System.out.print("============================");
        System.out.print("\n");
        System.out.print(prompt + "\n");


    }
}
