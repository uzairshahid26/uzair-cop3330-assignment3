/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFinder {


    // throws IOException
    public static void main(String[] args) throws IOException {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask for output file name
        System.out.print("\nEnter the name for the output file : ");

        String outputFile = scanner.next();

        // create an object of ReadFile class
        ReadFile rf = new ReadFile();

        // read file
        rf.readFile();

        // get the list contains data of file
        ArrayList<String> list = rf.getData();

        // create an object of WriteFile
        // and passing output file name and list contains data
        WriteFile wr = new WriteFile(outputFile, list);

        // write file
        wr.writeFile();

        // and print the Number of Modifications on console
        System.out.println("\nThe Number of Modifications are : "+wr.getModification());


    }

}

// class named ReadFile
class ReadFile{

    // instance variable

    private final ArrayList<String> list;
    private final Scanner sc;

    // constructor

    public ReadFile() throws FileNotFoundException {

        list = new ArrayList<>();

        // initialize instance variable

        // pass the path to the file as a parameter
        File file = new File("src/main/java/ex45/exercise45_input.txt");
        sc = new Scanner(file);

    }

    public void readFile() {

        // use try and finally to avoid exceptions

        try {
            int i = 0;

            while (sc.hasNext()) {
                // read file line by line and store it into list
                String fileData = sc.nextLine();
                list.add(fileData);
            }
        }

        finally
        {
            sc.close();
        }

    }

    //return the list
    public ArrayList<String> getData() {

        return list;

    }

}



// class for Write into File
class WriteFile{

    // instance variable
    private final FileWriter writer;
    private int count_Modification;
    private final ArrayList<String> list;

    // constructor
    public WriteFile(String name, ArrayList<String> list) throws IOException {

        // initialize variables

        writer = new FileWriter("src/main/java/ex45/"+name+".txt");
        this.list = list;


    }

    // write into file
    public void writeFile() throws IOException {

        // using for loop till size of list
        for (String temp : list) {
            String str = "utilize";
            int index = 0;

            // count the modifications
            while (true) {
                index = temp.indexOf(str, index);
                if (index != -1) {
                    count_Modification++;
                    index += str.length();
                } else {
                    break;
                }
            }

            // Change the word
            temp = temp.replaceAll("utilize", "use");

            // and write into file
            writer.write(temp + "\n");

        }

        // close the writer object
        writer.close();

    }


    // method that returns the count of modifications

    public int getModification() {
        return count_Modification;

    }


}
