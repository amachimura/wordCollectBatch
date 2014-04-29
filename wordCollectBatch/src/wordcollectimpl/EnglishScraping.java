package wordcollectimpl;

import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.xpath.*;

import org.w3c.dom.Document;
import org.w3c.tidy.Tidy;

import wordcollectbatchinterface.ScrapingInterface;
import wordcollectbatchinterface.UrlObserver;
import wordcollectimpl.crawl.CrawlExecuter;

public class EnglishScraping implements ScrapingInterface, UrlObserver {

	static final String WEBLIO_BASE_URL = "http://ejje.weblio.jp/content/";
	static final String WEBLIO_MIDASHIGO_PATH= "//div[@class='kijiWrp']/div[@class='kiji']/h2[@class='midashigo']";
	static final String WEBLIO_KENKYUSHA_HINSHI_PATH="//div[@class='kijiWrp']/div[@class='kiji']/div[@class='kejje']/div[@class='lebel0']/div[@class='KnenjSub']";
	static final String WEBLIO_KENKYUSHA_IMI_PATH="";
	
	public HashMap<String, String> scrapingFacade() throws Exception {
		return null;
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

		String english=(String) xpath.evaluate(WEBLIO_MIDASHIGO_PATH, doc, XPathConstants.STRING);
		return english;


	} 


	@Override
	public void scrape(CrawlExecuter executer) throws Exception {
		scrapingWord(executer.getUrl());
	}



}
