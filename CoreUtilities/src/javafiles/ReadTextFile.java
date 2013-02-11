package javafiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

public class ReadTextFile {
	
	public static BufferedReader br = null;
	public static FileReader fr = null;

	public ReadTextFile() {

	}

	public static Vector<String> readFileWholeLine(String path) {

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String aLine = null;
		Vector<String> returnString = new Vector<String>();

		try {
			while ((aLine = br.readLine()) != null) {

				returnString.add(aLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return returnString;
	}

	public static Vector<String> readFileFirstToken(String path) {

		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String aLine = null;
		Vector<String> returnString = new Vector<String>();

		StringTokenizer st = null;
		try {
			while ((aLine = br.readLine()) != null) {

				st = new StringTokenizer(aLine);
				String x = st.nextToken();
				returnString.add(x);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return returnString;
	}

}
