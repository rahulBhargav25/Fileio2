package FileHandling;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File myFile = new File("C:\\installation\\eclipse workspace\\Fileio2\\myFile2.txt");
		if(myFile.exists()) {
			System.out.println( "File name  :-"+myFile.getName() + "   | Abs path:: " + myFile.getAbsolutePath()+"  | Writeable | " + myFile.canWrite()+"   | readable | " + myFile.canRead()+ "  | File size " + myFile.length());
		}
		else {
			System.out.println("file doesnt exist");
		}
	}
}
