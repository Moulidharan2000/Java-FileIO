package com.bridgelabz.employeepayrollservice;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayroll {
	
	static Scanner scan = new Scanner(System.in);
	static boolean check;
	public static String check() throws IOException {
		
		check = Files.exists(Paths.get("D:\\JavaProjects\\Eclipse\\com.bridgelabz.employeepayrollservice\\demo.txt"));
		if(check == true) 
			return "File Exists....";
		return  "File Not Exists....";
	}
	
	public static String delete(boolean check) throws IOException {
		
		boolean delete = Files.deleteIfExists(Paths.get("D:\\JavaProjects\\Eclipse\\com.bridgelabz.employeepayrollservice\\demo.txt"));
		if(check == false) 
			return "File Deleted Successfully....";
		return "File Not Deleted....";
	}
	
	public static String createDirectory(boolean check) throws IOException {
		
		String path = "D:\\JavaProjects\\Eclipse\\com.bridgelabz.employeepayrollservice\\Demo";
		File file = new File(path);
		boolean directory = file.mkdir();
		if(directory == true)
			return "Directory Created Successfully....";
		return "Directory Not Created....";
	}
	
	public static String createFile(boolean check) throws IOException{
		
		if(check == false) {
			File.createTempFile("demo", "text");
			return "File Created Successfully....";
		}
		return  "File Not Created....";
	}
	
	public static void listfiles(File[] fi, int i, int lvl) {
		
		File files = new File("D:\\JavaProjects\\Eclipse\\com.bridgelabz.employeepayrollservice");
		if(files.exists() && files.isDirectory()) {
			fi = files.listFiles();
			System.out.println("Displaying Files and Directories : "+files);
			if(i == fi.length) {
				return;
			}
			if(fi[i].isFile()) {
				System.out.println(fi[i].getName());
			}
			listfiles(fi, i+1, lvl);
		}
	}
	
	public static void main(String[] args) {

		try {
			System.out.println(check());
			System.out.println(delete(check));
			System.out.println(createDirectory(check));
			System.out.println(createFile(check));
			File[] fi = null;
			int i = 0;
			int lvl = 0;
			listfiles(fi, i, lvl);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
