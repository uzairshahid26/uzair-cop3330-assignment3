/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex42;

import java.util.*;
import java.io.*;

public class Employee {
    public void printDetails(String filename) {
        try {
            Scanner sc = new Scanner(new File("src/main/java/ex42/exercise42_input.txt"));


            while (sc.hasNext()) {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: File Not Found!!");
        }
    }

    // Driver method to test the code
    public static void main(String[] args) {

        Employee emp = new Employee();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        emp.printDetails("exercise42_input.txt");

    }
}
