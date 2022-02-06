package com.LockMe;

public interface LockMeMenu {

	static void printWelcomeScreen(String applicatonName, String developerName) {

		
			String companyDetails = String.format("*****************************************************\n"
					+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n**"
					+ "*****************************************************\n", applicatonName, developerName);
			String appFunction = "You can use this application to :-\n"
					+ "• Retrieve all file names in the \"main\" folder.\n"
					+ "• Search, add, or delete files in \"main\" folder.\n"
					+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
			System.out.println(companyDetails);

			System.out.println(appFunction);
		}
	
	static void displayLockMeMenu() {
		String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	
	}
	
	

}