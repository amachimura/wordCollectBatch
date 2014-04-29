package wordcollectbatchinterface;

import wordcollectimpl.crawl.CrawlExecuter;

public interface UrlObserver {
	public void scrape(CrawlExecuter executer) throws Exception;
}
