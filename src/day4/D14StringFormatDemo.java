package day4;

import java.util.Scanner;
public class D14StringFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String NameKey = " Name ";
		System.out.println("Enter Name");
		String NameValue = scanner.nextLine();
		
		
		
		// format here
		String formattedFirstNameKey = String.format("|%-25s|", NameKey);
		String formattedNameVal = String.format("%-25.25s|", NameValue);
		
		
		String dash = "-------------------------|------------------------";
		
		
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedNameKey + formattedNameVal);
		System.out.println(String.format("|%-51s|", dash));
		
		
		scanner.close();
	}


	}


