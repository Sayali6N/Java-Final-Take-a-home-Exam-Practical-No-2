package practicalNo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileKeyValues {

	public static void main(String[] args) throws IOException {

		// String path =
		// "D:\Sayali\java\Take_A_Home_Final_Exam\Data_Exam\worddictionary.txt";
		
		String path = "Data_Exam\\worddictionary.txt";

		boolean doesExist = doesFileExist(path);
		if (!doesExist) {
			System.out.println("File Doesnt Exist");
			return;
		}

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(path)));
		} catch (IOException ioe) {

		}

		String line;
		while ((line = br.readLine()) != null) {
			String[] keyValue = line.split("-");
			System.out.println(keyValue[0]);

			if (keyValue.length == 2) {

				String[] values = keyValue[1].split(",");

				for (String val : values) {
					System.out.println(val.trim());// trims white spaces
				}
				System.out.println();

			}
		}
		br.close();

	}

	public static boolean doesFileExist(String path) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));//combined 3 object variables.can also be done .
			br.close();
			return true;
		} catch (IOException ioe) {

		}

		return false;
	}

}