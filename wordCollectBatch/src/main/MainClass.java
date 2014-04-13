package main;

import wordcollectimpl.EnglishScraping;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass();
		mc.execute();
	}
	
	private void execute(){
		EnglishScraping es = new EnglishScraping();
		try {
			System.out.println("midashi:"+ es.scraping());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
