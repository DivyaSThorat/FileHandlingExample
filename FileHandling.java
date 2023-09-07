package com.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	
	public static void main(String[] args) {
		try {
            // Create a file named "example.txt" if it doesn't exist
            File file = new File("example.txt");
            
            // Write to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, world!\nThis is a file handling example in Java.");
            writer.close();
            
            System.out.println("Data written to the file successfully.");
            
            // Read from the file
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            
            System.out.println("Reading from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
		
	
	}
}
