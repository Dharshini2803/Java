package com.example.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) throws IOException {

        FileWriter write = new FileWriter("sample.txt", false);

        write.write("Hello World\n");
        write.write("First Java Class\n");
        write.close();
        System.out.println("Data written successfully");
    }
}
