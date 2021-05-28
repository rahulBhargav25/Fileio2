package FileHandling;
import java.io.*;
import java.io.IOException;
public class fileio {
	public static void main(String[] args) {
		try {
			File myFile = new File("C:\\installation\\eclipse workspace\\Fileio2\\myFile2.txt");
			if(myFile.createNewFile()) {
				System.out.println("File Created " + myFile.getName());
			}else {
				System.out.println("file exist");
			}
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
