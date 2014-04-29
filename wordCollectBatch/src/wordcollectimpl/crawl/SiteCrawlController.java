package wordcollectimpl.crawl;

import wordcollectimpl.crawl.CrawlExecuter;
import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

public class SiteCrawlController {

	public void control() throws Exception{
		String crawlStorageFolder="/results";
		int numberOfCrawlers = 3;
		

		CrawlConfig config = new CrawlConfig();
		config.setCrawlStorageFolder(crawlStorageFolder);
		config.setPolitenessDelay(1000);
		config.setMaxDepthOfCrawling(3);
		config.setMaxPagesToFetch(1000);
		config.setResumableCrawling(false);

		PageFetcher pageFetcher = new PageFetcher(config);
		RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
		RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
		CrawlController controller = new CrawlController(config, pageFetcher, robotstxtServer);

		controller.addSeed("http://ejje.weblio.jp/content/apple/");
		controller.addSeed("http://ejje.weblio.jp/content/satisfactory/");
		controller.addSeed("http://ejje.weblio.jp/content/yield/");

		controller.start(CrawlExecuter.class, numberOfCrawlers);
	}


}
