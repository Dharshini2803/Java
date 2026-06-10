package com.example.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public static void main(String[] args) throws IOException {

        File f = new File("sample.txt");

        if (!f.exists()) {

            if (f.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File not created");
            }

        } else {

            System.out.println("File already exists");
           
        }

        System.out.println("File Name: " + f.getName());
        System.out.println(f.getAbsolutePath());
        
    }
}

