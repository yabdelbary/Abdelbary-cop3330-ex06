package org.example;

import java.util.Scanner;
//requirement for assignment to access calendar
import java.util.Calendar;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is your current age?");
        Scanner scan = new Scanner(System.in);
        String string_age = scan.nextLine();
        int age = Integer.parseInt(string_age);
        System.out.println("AT what age would you like to retire?");
        String string_retirement = scan.nextLine();
        int age_of_retirement = Integer.parseInt(string_retirement);
        int time_to_retirement = age_of_retirement - age;

        System.out.println("You have "+ time_to_retirement + " years left until you can retire.");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int year_of_retirement = year + time_to_retirement;

        System.out.println("It's " + (year - 6) + ", "+ "So you can retire in "+ (year_of_retirement -6) );

    }
}
