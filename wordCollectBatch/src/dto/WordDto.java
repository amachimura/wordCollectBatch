package dto;

import java.util.HashMap;

public class WordDto {

	private HashMap<String, String> wordList;
	
	public WordDto(){
		wordList = new HashMap<String, String>();
	}
	
	public HashMap<String, String> getWords(){
		return wordList;
	}
	
	public void setWords(HashMap<String, String> words){
		this.wordList = words;
	}
	
}
