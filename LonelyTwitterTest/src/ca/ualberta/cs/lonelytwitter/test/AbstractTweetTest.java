package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import android.test.ActivityInstrumentationTestCase2;


public class AbstractTweetTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public AbstractTweetTest()
	{
		super(LonelyTwitterActivity.class);
	}
	
	public void testAbstractTweet(){
		Tweet t = new Tweet("Hello");
		String actual = t.getTweetBody();
		Tweet t2 = new Tweet("Hello");
		
		assertEquals("Tweet body is the same", "Hello", actual);
		assertEquals("Same tweets", t, t2);
	}
}
