package wordcollectimpl;

import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.xpath.*;

import org.w3c.dom.Document;
import org.w3c.tidy.Tidy;

import wordcollectbatchinterface.ScrapingInterface;

public class EnglishScraping implements ScrapingInterface {
	
	static final String WEBLIO_BASE_URL = "http://ejje.weblio.jp/content/";
	static final String WEBLIO_PATH= "//div[@class='kijiWrp']/div[@class='kiji']/h2[@class='midashigo']";

	public HashMap<String, String> scrapingFacade() throws Exception {
		ArrayList<String> weblioUrls = collectUrl(WEBLIO_BASE_URL);
		for(weblioUrls)
	}	
	
	public String scrapingWord(String url) throws Exception{
		URL scrapeUrl=new URL(url);
		URLConnection conn = scrapeUrl.openConnection();
		Tidy tidy = new Tidy();
		tidy.setShowWarnings(false);
		tidy.setQuiet(true);
		Document doc = tidy.parseDOM(conn.getInputStream(),null);
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xpath = xpf.newXPath();
		
		String english=(String) xpath.evaluate(WEBLIO_PATH, doc, XPathConstants.STRING);
		return english;
		
		
	} 
	
public ArrayList<String> collectUrl(String baseUrl){
		
		
	}


	
}
