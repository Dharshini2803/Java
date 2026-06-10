package com.example.FileHandling;
import java.io.*;
public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("sample.txt");
		int ch;
		while((ch=r.read()) !=-1) {
			System.out.println((char)ch);
		}
		r.close();
		System.out.println("ReadFile successfull");

	}

}
