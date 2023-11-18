package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class filereader {
	public static void main(String[] args) throws IOException {
		String filepath = "./src/filehandling/Untitled 2";
		FileReader reader = new FileReader(filepath);
		System.out.println((char)reader.read());
		int i = 10;
		while ( (i = reader.read()) != -1)  {
			System.out.println((char)i);
			
			
		}
		
		
	}

}
