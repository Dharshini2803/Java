package com.example.FileHandling;
import java.io.*;
public class ReadLine {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("sample.txt"));
		String line;
	
		while((line = r.readLine()) != null) {
			System.out.println(line);
		}
		System.out.println("ReadLine successfull");

	}

}
