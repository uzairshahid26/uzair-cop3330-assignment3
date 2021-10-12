/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WebsiteGenerator {
    //Create attributes of the website to be set by the user.
    String siteName;
    String author;
    String path;

    //Create function to create the website folder.
    public String createWebsite() {

//Set our directory and create the file with that path
        String directory = path + siteName;
        File newFolder = new File(directory);

//Create the folder and return the directory for testing purposes
        newFolder.mkdirs();
        return directory;


    }

    //Create function to create the JS folder
    public String createJSFolder() {

//Set our directory and create the file with that path
        String directory = path + siteName + "/js";
        File newFolder = new File(directory);

//Create the folder and return the directory for testing purposes
        newFolder.mkdirs();
        return directory;


    }

    //Create a function to create the CSS folder
    public String createCSSFolder() {

//Set our directory and create the file with that path
        String directory = path + siteName + "/css";
        File newFolder = new File(directory);

//Create the folder and return the directory for testing purposes
        newFolder.mkdirs();
        return directory;

    }

    //Create a function to create the HTML file
    public String createHTMl() {

//Establish path
        String directory = path + siteName + "/index.html";

//Create whatever is going to go inside the file
        String htmlContent = "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";

//Create the file
        File file = new File(directory);

        try {

//Write on the file.
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlContent);
            writer.close();
            return directory;

//Exit if any exceptions are found.
        } catch(Exception ex) {

            return "Failure";
        }

    }

}
