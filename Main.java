package page289;

import java.io.File;

//Ref page 289 Java In a NutShell 6th Ed

public class Main {

	public static void main(String[] args) {
		//System Properties are strings that can be used to hold system properties
		//See:  https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
		//Here we see an example of the use of the "user.home" system property
		File f = new File(System.getProperty("user.home"));   //Gets  the "home" directory path for the current user
		System.out.println(f.toString());
		
		
		//Working with Existing Files
		System.out.println("Lets have some fun with an existing file called \'AFile.txt\'");		
		File aFileReference = new File("AFile.txt");
		
		System.out.print("File \"AFile.txt\" exits ?  ");  	
		System.out.println(aFileReference.exists());
	 	
		System.out.println ("The file path to \'AFile.txt\' is: " + aFileReference.getAbsolutePath());
		
		
	 	System.out.println("Lets list some \'AFile.txt\' File attributes:");
	 	System.out.println("File \'AFile.txt\' Exists?  " + aFileReference.exists() );
	 	System.out.println("Is \'AFile.txt\' a file? " + aFileReference.isFile() );
	 	System.out.println("Can we read the file \'ATFile.txt\'? " + aFileReference.canRead());
	 		 	
	 	boolean makeDirSuccess = new File("aDIR").mkdirs();  //creates a project directory called aDir
	  	
	 	System.out.println("makeDirSuccess ? " + makeDirSuccess);
	 	
	 	//File aDir = new File(a,"pauldir");  //doesn't create the dir because its still "just a File path"
	 	File aDir = new File(aFileReference,"pauldir");
	 	boolean success = aDir.mkdir();
	 	System.out.println("We made a dir!  " + success);
	 	
	 	
	 	boolean weMakeADir = aFileReference.mkdirs();
	 	System.out.println("We made a dir!  " + weMakeADir);
	 	// mkdir
	 	// public boolean mkdir()
	 	// Creates the directory named by this abstract pathname.
	 	// Returns:true if and only if the directory was created; false otherwise
	}

}
