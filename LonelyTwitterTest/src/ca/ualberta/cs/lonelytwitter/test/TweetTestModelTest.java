package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import ca.ualberta.cs.lonelytwitter.data.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;


public class TweetTestModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetTestModelTest()
	{
		super(LonelyTwitterActivity.class);
	}

	public void testaddTweets(){
		TweetListModel tlm = new TweetListModel();
		Tweet tweet1 = new Tweet("Hello1");
		try{
			tlm.addTweet(tweet1);
			assertEquals("1 Tweet Added!", 1,tlm.getCount());
		}catch (Exception e){
			assertEquals("Exception correctly thrown!", "Already Exists!", e.getMessage());
		}
	}
	
	public void testgetCount() throws Exception{
		TweetListModel tlm = new TweetListModel();
		Tweet tweet1 = new Tweet("Hello1");
		Tweet tweet2 = new Tweet("Hello2");
		tlm.addTweet(tweet1);
		tlm.addTweet(tweet2);
		
		assertEquals("The counts are equal!", 2, tlm.getCount());
	}
	
	public void testhasTweet() throws Exception{
		TweetListModel tlm = new TweetListModel();
		Tweet tweet1 = new Tweet("Hello1");
		tlm.addTweet(tweet1);
		assertTrue("Tweet Exists!", tlm.hasTweet(tweet1));
	}
	
	public void testremoveTweet(){
		TweetListModel tlm = new TweetListModel();
		Tweet tweet1 = new Tweet("Hello1");
		try{
			tlm.addTweet(tweet1);
			assertEquals("1 Tweet Added!", 1,tlm.getCount());
			tlm.removeTweet(tweet1);
			assertEquals("1 Tweet Removed!", 0,tlm.getCount());
		}catch (Exception e){
			assertEquals("Exception correctly thrown!", "Tweet does not exist!", e.getMessage());
		}
	}
	
	public void testgetTweets(){
		
	}
	

}
