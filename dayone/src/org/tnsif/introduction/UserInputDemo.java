package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String strl=s.nextLine();
	System.out.println("String is: "+strl);
	}

}
