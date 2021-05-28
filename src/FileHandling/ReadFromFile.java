package FileHandling;
import java.io.*;
import java.util.Scanner;

public class ReadFromFile {
	public static void main(String[] args) {
		try {
			File myReader = new File("C:\\\\installation\\\\eclipse workspace\\\\Fileio2\\\\myFile2.txt");
			Scanner myRead = new Scanner(myReader);
			while(myRead.hasNextLine()) {
				String data = myRead.nextLine();
				System.out.println(data);
			}
		} catch (IOException e) {
			System.out.println("caught error");
			e.printStackTrace();
		}
	}
}
