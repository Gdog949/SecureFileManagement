//Made by Giancarlo Barrientes
//and
//https://www.tutorialspoint.com/java/io/file_mkdir.htm
import java.util.Scanner;	
import java.io.File;



public class MakeFolder 
{
	private Scanner input = new Scanner(System.in);
	
	public void makeFolder()
	{      
		//declared variables
		String location, choice, folderName;
		File f = null;
		boolean bool = false;
		boolean loop = true;



		//debug option  C:/Users/barrg/Desktop/
		do 
		{	
			//prompt user to give location of folder.
			System.out.printf("where do you want to create the folder at ?"
					+ "\nEXAMPLE. C:/Users/Example/Desktop/\n");
			location = input.nextLine();
			System.out.printf("Is this correct ?\n"
					+ "%s\n\"Yes\" or \"No\"\n",location);

			choice = input.nextLine();

			switch(choice)
			{
			case "yes":
				loop = false;
				break;
			case "Yes":
				loop = false;
				break;
			case "no":
				loop = true;
				break;
			case "No":
				loop = true;
				break;
			default:
				System.out.printf("wrong input please type \"yes\" or \"no\"");
				break;
			}
		}while(loop != false);

		//reset loop for do while loop
		loop = true;

		do 
		{
			//ask user for Folder name and will give confirmation in the end 
			input = new Scanner(System.in);
			System.out.printf("What name do you want for the folder ?\n");
			folderName = input.nextLine();
			//showing folder location and name	
			System.out.printf("Is this correct ?\n"
					+ "%s%s\n\"Yes\" or \"No\"\n",location,folderName);

			choice = input.nextLine();

			switch(choice)
			{
			case "yes":
				loop = false;
				break;
			case "Yes":
				loop = false;
				break;
			case "no":
				loop = true;
				break;
			case "No":
				loop = true;
				break;
			default:
				System.out.printf("wrong input please type \"yes\" or \"no\"");
				break;
			}
		}while(loop != false);

		try {
			// returns pathnames for files and directory
			f = new File(location + folderName);

			// creates Folder
			bool = f.mkdir();
			// print
			System.out.printf("Directory %s was created ?"+ bool + "\n" ,folderName);

		} 
		catch(Exception e) 
		{
			// if any error occurs
			e.printStackTrace();
		}

	}
}
