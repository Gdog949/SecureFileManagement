import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Create {
  
  private Scanner input = new Scanner(System.in);

  public void create() 
  {
    
    try 
    {
      //Getting the user to set where they want to put the text file at and naming the file.
      String fileName;
    
      System.out.printf("Where do you want to create this file and what name do you want to give the file. "
      		+ "Include ./ in the beginning EX. \n C:\\Users\\Myname\\fileName.txt");
      System.out.println();
    
      //get user input with file location and name
      fileName = input.nextLine();
      //FileC gets input from String variable fileName
      File fileC = new File(fileName);

      /*
      *File fileC = new File(".//Sam//was.txt");
      *^creates a new text file under Joe called "test.txt"
       */
      if (fileC.createNewFile()) 
      { 
        System.out.println("File Created: " + fileC.getName());
      } 
      else
      {
       System.out.println("File exists.");
      }
    } 
    catch (IOException a) {
      System.out.println("Error.");
      a.printStackTrace();
    }
  }
}
