package com.practice.question;

import java.util.Scanner;

public class Application {

    public static Scanner scan;
    public static String name;
    private static int age;
    private static double salary;
    private static String designation;


    public static void main(String[] args) {

        int choice = 0;
        Employee[] employees = new Employee[3];
        scan = new Scanner(System.in);


        for(int i=0;i<3;i++) {

            System.out.println("1. Doctor\n2. Engineer\n3. Pilot");
            System.out.println("Enter your choice");
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    details();
                    System.out.println("IsDoctor Certified");
                    boolean iscertified = scan.nextBoolean();
                    employees[i] = new Employee(name, age, salary, designation);
                    break;
                case 2:
                    details();
                    System.out.println("Engineer details");
                    employees[i] = new Employee(name, age, salary, designation);
                    break;
                case 3:
                    details();
                    System.out.println("Pilot Details");
                    employees[i] = new Employee(name, age, salary, designation);
                    break;
                default:
                    System.out.println("Enter valid choice");

            }
        }

        System.out.println("Employee Details");
        for(int i=0;i<3;i++) {
            System.out.println(employees[i].getName());
            System.out.println(employees[i].getAge());
            System.out.println(employees[i].getSalary());
            System.out.println(employees[i].getDesignation());
        }

    }

    private static void details() {
        System.out.println("Enter Name");
        name = scan.next();
        System.out.println("Enter age");
        age = scan.nextInt();
        System.out.println("Enter salary");
        salary = scan.nextDouble();
        System.out.println("Enter Designation");
        designation = scan.next();
    }

}
