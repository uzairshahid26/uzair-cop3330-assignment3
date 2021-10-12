/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package ex46;

import java.util.*;
import java.io.*;

public class WordFrequencyFinder {

    public static void main(String[] args) throws IOException {

        // assign a file pointer to input file
        Scanner file = new Scanner(new File("src/main/java/ex46/exercise46_input.txt"));
        Map<String,Integer> hm = new TreeMap <String,Integer>();

        // read values from file and add them into map
        while(file.hasNext()) {
            String str=file.next();
            if(hm.containsKey(str))
                hm.put(str,hm.get(str)+1);
            else
                hm.put(str,1);
        }

        // print the histogram
        for(String key:hm.keySet()) {
            System.out.printf("%-10s",key+":");
            for(int i = hm.get(key); i > 0 ; i--)
                System.out.print("*");
            System.out.println();
        }

    }
}