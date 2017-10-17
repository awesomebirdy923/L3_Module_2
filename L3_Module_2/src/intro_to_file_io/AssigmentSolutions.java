package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AssigmentSolutions {
	static String message = "";
	public static void main(String[] args) {
		
		List<Character> charList = new ArrayList<Character>();
		List<Integer> intList = new ArrayList<Integer>();
		
		String userInput = JOptionPane.showInputDialog("Insert some stuff:");
		char[] chars = userInput.toCharArray();
		for(char e : chars) {
			intList.add((int)e);
		}
		for(Integer i : intList) {
			message += " " + i;
		}
		try {
			FileWriter writer = new FileWriter("src/intro_to_file_io/Solution 1.txt");
			writer.write(message);
//			System.out.println(message);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}
