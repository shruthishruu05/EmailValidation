package com.bridgelabz.emailvalidation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {
	public static boolean emailValidator(String email) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]*[@][.a-zA-z]*$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter an email id");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		
		if(emailValidator(email))System.out.println("valid email id");
		else System.out.println("invalid email id");

		sc.close();
	}
}
