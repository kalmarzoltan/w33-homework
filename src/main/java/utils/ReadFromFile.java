package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

	public static List<String> readWithBufferedReader(String fileName) {

		ArrayList<String> inputArray = new ArrayList<>();
		FileReader file;
		try {
			// a java beli file objektumot megfeleltetem egy az egyben a test.txt-nek
			file = new FileReader(fileName);
			// egy BufferedReader objektumpéldányban tárolom a fájl tartalmát
			BufferedReader breader = new BufferedReader(file);
			// a line változóba belekerül a fájl egy sora
			String line = breader.readLine();

			// vegigmegyek a bemenetkent kapott fajl sorain, amig nem nulla a sor (hisz ha
			// nulla akkor vege a fajlnak)
			while (line != null) {
				// kiirom az aktualis sort
				// System.out.println(line);
				inputArray.add(line);
				// kerem a kovetkezo sort

				line = breader.readLine();
			}
			file.close();
		} catch (IOException ex) {
			System.out.println("File not found. Please check the filename or place. " + ex.toString());
		}
		return inputArray;
	}

}
