package intro_to_file_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution2 {

	public static void main(String[] args) {
		String input = "";
		try {
			FileReader fr = new FileReader("src/intro_to_file_io/Solution 1.txt");
			int c = fr.read();
			while(c != -1){
				System.out.print((char)c);
				c = fr.read();
				
				char e = (char) c;
				input.concat(e + "");
			}
			fr.close();
			System.out.println(input);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String number = "";
		for (int i = 0; i < input.length(); i++) {
			
		}
		
	}
	
}
