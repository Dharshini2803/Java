package com.example.FileHandling;
import java.io.*;
public class ReadWordByWord {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("sample.txt"));
		String line;
	
		while((line = r.readLine()) != null) {
			String[] word = line.split(" ");
			for(String  words: word) {
				System.out.println(words);
			}
		}
		
		
	}

}
