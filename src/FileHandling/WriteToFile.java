package FileHandling;
import java.io.*;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\installation\\eclipse workspace\\Fileio2\\myFile2.txt");
			myWriter.write("Java is oops \n and it is statically typed language");
			myWriter.close();
			System.out.println("successfully wrote to file");
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
