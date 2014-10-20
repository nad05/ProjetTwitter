import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;
import java.util.List;

import twitter4j.Status;
import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.api.TrendsResources;
import twitter4j.conf.ConfigurationBuilder;



public class Tweet {

    
	public static Vector<String> getTrend() throws TwitterException {
       
        ConfigurationBuilder cb =new ConfigurationBuilder();
        cb.setDebugEnabled(true)
		.setOAuthConsumerKey("1BgjmryhAhIDhWxn043Ftky77")
        .setOAuthConsumerSecret("zRqOz2gWrv9gF3xt38ezbbXOacDU2TuzlU4v0b3XHlOj8X7y2x")
        .setOAuthAccessToken("537787500-hBjyD0ylvXTGiAhtR1xeaz2q0NVCBnZiTI9x9J67")
        .setOAuthAccessTokenSecret("t29NAKmblM0B1Il4hdn0apshnv9GncxTuMRkm9ESdnX6N");

 
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter4j.Twitter tw = tf.getInstance();
		
		int monde = 1;
		int paris = 615702;
		int france = 23424819; 
		
		Trends trend =tw.getPlaceTrends(france);
		// List<String> currentTrends = new ArrayList<String>();
		Vector<String> currentTrends = new Vector<String>();

		for(Trend t : trend.getTrends()) {
         
			String name = t.getName();
         	String url=t.getURL();
         	currentTrends.add(name);
         	// currentTrends.add(url);
		
		}
	
		return currentTrends;	
  } 
}
