package wordcollectbatchinterface;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author machi_000
 *
 */
public interface ScrapingInterface {

	
	/**
	 * �X�N���C�s���O���\�b�h��facade�B���̃��\�b�h����e���\�b�h���Ăяo���Ă��������B
	 * @return
	 * @throws Exception 
	 */
	public HashMap<String, String> scrapingFacade() throws Exception;

	
	/**
	 * �n���ꂽUrl�̒��̒P����W�߂郁�\�b�h
	 * @param url
	 * @return
	 * @throws Exception 
	 */
	abstract String scrapingWord(String url) throws Exception;
}
