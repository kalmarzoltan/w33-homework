package utils;


import java.io.FileOutputStream;

import java.io.IOException;
import java.io.PrintStream;

public class WriteToFile {

    public static void writing() {
    	PrintStream printStream;
		try {
			printStream = new PrintStream(new FileOutputStream("C:\\Users\\Kalmi\\Documents\\eclipse-workspace\\tuesday-peti\\tuesday\\PlayerResult.txt",true));
			System.setOut(printStream);
			
			
		} catch (IOException ex) {
			
			System.err.println("There is some problem with file writing. " + ex.toString());
		}

	}
}
