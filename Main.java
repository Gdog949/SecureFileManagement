//prompt user if they want to create or delete a file and execute
//import java.io.File; 
import java.util.Scanner;

public abstract class Main 
{

	private static Scanner input = new Scanner(System.in);
	private static String  confirm;
	public static void main(String[] args) 
	{ 
		//calls upon the classes of Delete/Create so we can use methods from there
		Delete classDelete = new Delete();
		Create classCreate = new Create();
		MakeFolder classMakeFolder = new MakeFolder();
		FolderContents classLS = new FolderContents();
		boolean loop = true;

		do
		{
			//gives user choice in creating or deleting a file 
			System.out.printf("Welcome to group 2's File Manipulation Main menu\n"
					+ "What do you want to do ?\n"
					+ "Look into a directory ? Type \"ls\"\n"
					+ "Create or delete a file? Type \"Create\" or \"Delete\"\n"
					+ "Create or delete Folder? Type \"mkdir\"\n");
			String choice = input.nextLine(); 




			//switch statement menu in choose what the user wants to do.
			switch(choice)
			{
			case "Ls":
				classLS.folderLS();
				break;
			case "ls":
				classLS.folderLS();
				break;
			case "Create": 
				classCreate.create();
				break;
			case "Delete":
				classDelete.deletes();
				break;
				//for when user inputs lower case Create/Delete
			case "create":
				classCreate.create();
				break;
			case "delete":
				classDelete.deletes(); 
				break;
			case "mkdir":
				classMakeFolder.makeFolder();
				break;
				//in the event the user dosen't input Create/Delete
			default:
				System.out.printf("Huh? you didnt type \"Create\",\"Delete\" or \"mkdir\" Please try again."
						+ "\nWhat do you want to do ? Create or delete a file ?\nChoose  \"Create\",\"Delete\",or \"mkdir\"");
				Scanner input = new Scanner(System.in);
				choice = input.nextLine(); 
			}
			//get confirmation to continue using Group 2's File manipulation.
			System.out.printf("Do you want to continue using Group 2's File Manipulation ?\n"
					+ "\"yes\" or \"no\"\n");
			input = new Scanner(System.in);
			confirm = input.nextLine();
			
			switch(confirm)
			{
			case "yes":
				loop = true;
				break;
			case "Yes":
				loop = true;
				break;
			case "no":
				loop = false;
				break;
			case "No":
				loop = false;
				break;
			default:
				System.out.printf("wrong input please type \"yes\" or \"no\"");
				break;
			}

		}while(loop != false);
		
		System.out.printf("exiting program File manipulation\nHave a nice day c:");
		System.exit(0);
	}
}

