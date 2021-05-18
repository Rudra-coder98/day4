package day4;

import java.util.Scanner;

public class MyCVusingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		String NameKey = " Name ";
		System.out.println("Enter Name");
		String NameValue = scanner.nextLine();
		
		String EmailKey = " Email Address ";
		System.out.println("Enter Email Address");
		String EmailValue = scanner.nextLine();
		
		String MobileNumberKey = " Mobile Number ";
		System.out.println("Enter Mobile Number");
		String MobileNumberValue = scanner.nextLine();
		
		
		// format here
		String formattedNameKey = String.format("|%-25s|", NameKey);
		String formattedNameVal = String.format("%-25.25s|", NameValue);
		String formattedEmailKey = String.format("|%-25s|", EmailKey);
		String formattedEmailVal = String.format("%-25.25s|", EmailValue);
		String formattedMobileNumberKey = String.format("|%-25s|", MobileNumberKey);
		String MobileNumberVal = String.format("%-25.25s|", MobileNumberValue);
		
		
		String dash = "-------------------------|------------------------";
		
		
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedNameKey + formattedNameVal);
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedEmailKey + formattedEmailVal );
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedMobileNumberKey + MobileNumberVal );
		System.out.println(String.format("|%-51s|", dash));
		
		
		scanner.close();
	}

	}


