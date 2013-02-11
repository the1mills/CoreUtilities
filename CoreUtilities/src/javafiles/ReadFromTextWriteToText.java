package javafiles;

import java.util.Vector;

public class ReadFromTextWriteToText {

	
	private WriteToTextFile wttf = new WriteToTextFile();
	
	
	public ReadFromTextWriteToText() {
		
		boolean start = false;
		Vector<String> xxx =  ReadTextFile.readFileFirstToken("C:\\Users\\denman\\Desktop\\nyse_old.txt");
		
		for(int i = 0; i < xxx.size(); i++){
			
			if( xxx.get(i).startsWith("FGB")){
				System.out.println("FGB");
				start = true;
			}
			
			if(xxx.get(i).contains(".") || xxx.get(i).contains("-") || start == false){
				continue;
			}
			
			wttf.writeToTextFile(xxx.get(i));
		}
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReadFromTextWriteToText();
	}

}
