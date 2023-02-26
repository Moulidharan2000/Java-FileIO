package com.bridgelabz.employeepayrollservice;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayroll {
	
	public static void main(String[] args) throws IOException {
		
		List<String> somelines = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the ID : ");
		int id = scan.nextInt();
		System.out.print("Enter the Name : ");
		String name = scan.next();
		System.out.print("Enter the Salary : ");
		int salary = scan.nextInt();
		somelines.add("ID : "+id);
		somelines.add("Name : "+name);
		somelines.add("Salary : "+salary);
		Files.write(Paths.get("D:\\JavaProjects\\Eclipse\\com.bridgelabz.employeepayrollservice\\FileIO.txt"),somelines,StandardOpenOption.APPEND);
		List<String> lines = Files.readAllLines(Paths.get("D:\\JavaProjects\\Eclipse\\com.bridgelabz.employeepayrollservice\\FileIO.txt"));
		for(String line : lines) {
			System.out.println(line);
		}
	}
}
