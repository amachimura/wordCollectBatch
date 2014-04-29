package main;

import wordcollectimpl.EnglishScraping;
import wordcollectimpl.crawl.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass();
		mc.execute();
	}
	
	private void execute() {
		SiteCrawlController cr = new SiteCrawlController();
		try {
			cr.control();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		EnglishScraping es = new EnglishScraping();
//		try {
//			System.out.println("midashi:"+ es.scraping());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

}
