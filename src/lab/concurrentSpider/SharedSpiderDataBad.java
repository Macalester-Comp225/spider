package lab.concurrentSpider;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The data structures that all the ConcurrentSpiders will use go here:
 * work, finished, urlCounter.
 * 
 * @author shoop
 *
 */
public class SharedSpiderDataBad {
	// move the declaration of each of these 3 data structures into 
	// this class and add getters and setters to them:
	// work, finished, urlCounter
	
	/**
	 * Urls waiting to be scraped.  The "work" left to do.
	 */
	private Queue<String> work = new LinkedList<String>();
	
	/**
	 * Keeps track of counts for each url.
	 */
	private AllWordsCounter urlCounter = new AllWordsCounter();
	
	/**
	 * URLs that have already been retrieved.
	 */
	private List<String> finished = new ArrayList<String>();

	/**
	 * @return the work
	 */
	public Queue<String> getWork() {
		return work;
	}

	/**
	 * @return the urlCounter
	 */
	public AllWordsCounter getUrlCounter() {
		return urlCounter;
	}

	/**
	 * @return the finished
	 */
	public List<String> getFinished() {
		return finished;
	}
	
}
