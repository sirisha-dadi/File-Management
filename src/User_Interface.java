import java.io.File;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class User_Interface {
	static ArrayList<File> files = new ArrayList<>() ; 
	static File file=null;
	static String path="";
	static int value=1; 
	static int optionSelected; // variable for option selection
	static int suboption;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean close=true; // to stop while loop of label
	boolean subClose=true;
	
	label :
	while(close) { // welcome interface
		System.out.println("---------------@Welcome@ --------------");
		System.out.println("Application Name : File Management");
		System.out.println("Devloper Name : Sirisha");
		System.out.println("------------------------------------");
		System.out.println("Menu details listed as below : ");
		System.out.println("1.Sort and retrieve all existing files");
		System.out.println("2.Add/Delete/search for a file");
		System.out.println("3.Exit the application");
		System.out.println("-------------------------------------");
		try {
			System.out.println("Please choose an option : ");
			optionSelected=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("Invalid option selected, please choose again from menu");
			continue label;
		}
		
		switch(optionSelected)
		{
		
		case 1:
			
				
			
			Get_All_Files.getFiles(); // retrieves all files 
			
			System.out.println("Press any key to return main menu");
			sc.nextLine();
			continue label; // returns to main menu
		
			
		case 2:
			sublabel:
			while(subClose){ // sub options for ADD/delete/search
				System.out.println("1. Add file");
				System.out.println("2. Delete file");
				System.out.println("3.Search");
				System.out.println("4.Return to main menu");
				System.out.println("Please choose an option:");
				suboption=sc.nextInt();
				sc.nextLine();
				
			
				switch(suboption)
				{
				case 1:  // add operation
					System.out.println("Provide file name you want to add : ");
					Add_File.addFile(sc.nextLine());
					break;
				case 2:  // delete file from specified path
					String deleteFile="";
					System.out.println("Specify the file name to delete");
					deleteFile=sc.nextLine();
					Delete_File.deleteFile(deleteFile);
					break;
				case 3:  // Search for the file
					String fileSearch="";
					
					System.out.println("Enter the file name that you want to search : ");
					fileSearch=sc.nextLine();
					
					Search_File.searchFile(fileSearch);
					break;
				case 4:   // return to main menu
					continue label;
				default:
					System.out.println("Invalid option selected, please select again from below menu");
					continue sublabel;
					
				}
			}
		case 3:  //exit code or terminate the cli
			System.out.println("Do you want to exit from application (Y/N) : ");
			char option=sc.next().charAt(0);
			if(option=='Y' || option=='y')
			{
				close=false;
				continue label;
			}
			continue label;
			
		 default :
			 System.out.println("Not valid, please again choose from below menu");
			 continue label;
		}
	}
	
	System.out.println("Thank you for visiting the page");
	
	
	
	
}
}
