package wordcollectbatchinterface;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author machi_000
 *
 */
public interface ScrapingInterface {

	
	/**
	 * スクレイピングメソッドのfacade。このメソッドから各メソッドを呼び出してください。
	 * @return
	 * @throws Exception 
	 */
	public HashMap<String, String> scrapingFacade() throws Exception;

	
	/**
	 * 渡されたUrlの中の単語を集めるメソッド
	 * @param url
	 * @return
	 * @throws Exception 
	 */
	abstract String scrapingWord(String url) throws Exception;
}
