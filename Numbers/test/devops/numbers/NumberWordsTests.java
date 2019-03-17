package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "minus one", numberWords.toWords( -1 ) ) ;
	}
	@Test
	public void numberToWord65() {
		Assert.assertEquals( "Error", "sixty-five", numberWords.toWords( 65 ) ) ;
	}
	@Test
	public void numberToWord165() {
		Assert.assertEquals( "Error", "one hundred sixty-five", numberWords.toWords( 165 ) ) ;
	}
	
	@Test
	public void numberToWord965() {
		Assert.assertEquals( "Error", "nine hundred sixty-five", numberWords.toWords( 965 ) ) ;
	}
	
	@Test
	public void numberToWord999() {
		Assert.assertEquals( "Error", "nine hundred ninety-nine", numberWords.toWords( 999 ) ) ;
	}
	
	@Test
	public void numberToWordDisconnect() {
		Assert.assertEquals( "Error", "nine hundred  million sixty-five thousand six hundred twelve", numberWords.toWords( 900065612 ) ) ;
	}
	
	@Test
	public void numberToWordZero() {
		Assert.assertEquals( "Error", "zero", numberWords.toWords( 0 ) ) ;
	}

}
