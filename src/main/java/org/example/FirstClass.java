package org.example;

import java.util.Scanner;

public class FirstClass {
    Scanner scan = new Scanner(System.in);
    public void run(){
        System.out.println("Введите имя: ");
        String name = scan.nextLine();
        System.out.println("Введите возраст: ");
        int age;
        String age_pre = scan.nextLine();
        try {
            age = Integer.parseInt(age_pre);
            Decorator.greetings(name, age);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
    public String setData(String message){
        System.out.println(message);
        return scan.nextLine();
    }

}
