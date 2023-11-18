package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferreader {
	public static void main(String[] args) throws IOException {
		String filepath = "./excelrmaybatch/src/filehandling/Untitled 2";
		FileReader reader = new FileReader(filepath);
		BufferedReader br = new BufferedReader(reader);
		System.out.println(br.read());
		System.out.println(br.readLine());
		
		
		
	}

}
