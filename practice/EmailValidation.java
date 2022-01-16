package package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.*;

public class EmailValidation {

	public static int inValidCount = 0;
	public static int validCount = 0;

	public static void main(String args[]) {
		ArrayList<String> emails = new ArrayList<String>();

		// Valid emails

		emails.add("ram@domain.co.in");
		emails.add("ram@domain.com");
		emails.add("ram.name@domain.com");
		emails.add("ram#@domain.co.in");

		// Invalid emails
		emails.add(".ram@yahoo.com");
		emails.add("ram@yahoo.com.");
		emails.add("ram@yahoo..com");
		emails.add("ram@yahoo.c");
		emails.add("ram@yahoo.corporate");

		emails.add("ram'@domain.com");
		emails.add("pravin@yahoo.com");

		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";

		Pattern pattern = Pattern.compile(regex);

		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			
			
			if (matcher.matches()) {
				
				System.out.println(email + " : Valid email" + "\n");
				validCount++;
				
				if(email.contains("@yahoo.com")) {					
					System.out.println("This is Yahoo domain email ******* \n");					
				}
				
				
			} else {
				System.out.println(email + " : Invalid email" + "\n");
				inValidCount++;
			}

		}

		System.out.println("Total invalid email " + inValidCount + "\n");
		System.out.println("Total valid email " + validCount + "\n");

	}
}